// src/main/kotlin/Main.kt
import kotlinx.coroutines.*
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.sync.withLock
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import java.time.Duration
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.measureTimeMillis

data class Config(
    val url: String,
    val concurrency: Int = 50,
    val rps: Int = 200,
    val total: Int = 1000,
    val method: String = "GET",
    val body: String? = null,
    val timeoutMs: Long = 5000,
    val retries: Int = 0
)

fun parseArgs(argv: Array<String>): Config {
    val map = mutableMapOf<String, String>()
    var i = 0
    while (i < argv.size) {
        val a = argv[i]
        if (a.startsWith("--") && i + 1 < argv.size) {
            map[a.removePrefix("--")] = argv[i + 1]
            i += 2
        } else i++
    }
    val url = map["url"] ?: throw IllegalArgumentException("Falta --url <URL>")
    return Config(
        url = url,
        concurrency = map["concurrency"]?.toInt() ?: 50,
        rps = map["rps"]?.toInt() ?: 200,
        total = map["total"]?.toInt() ?: 1000,
        method = map["method"] ?: "GET",
        body = map["body"],
        timeoutMs = map["timeoutMs"]?.toLong() ?: 5000L,
        retries = map["retries"]?.toInt() ?: 0
    )
}

/** Limitador simple: asegura un intervalo mínimo entre peticiones global */
class SimpleRateLimiter(permitsPerSecond: Int) {
    private val minIntervalMs: Long = if (permitsPerSecond <= 0) 0L else (1000.0 / permitsPerSecond).toLong()
    private val mutex = Mutex()
    private var nextAvailableAt: Long = 0L

    suspend fun acquire() {
        if (minIntervalMs <= 0) return
        mutex.withLock {
            val now = System.currentTimeMillis()
            if (now < nextAvailableAt) {
                delay(nextAvailableAt - now)
                nextAvailableAt += minIntervalMs
            } else {
                nextAvailableAt = now + minIntervalMs
            }
        }
    }
}

fun buildClient(timeoutMs: Long): OkHttpClient {
    return OkHttpClient.Builder()
        .connectTimeout(Duration.ofMillis(timeoutMs))
        .callTimeout(Duration.ofMillis(timeoutMs))
        .readTimeout(Duration.ofMillis(timeoutMs))
        .build()
}

suspend fun doHttp(client: OkHttpClient, cfg: Config): Pair<Int?, Long> {
    val builder = Request.Builder().url(cfg.url)
    val method = cfg.method.uppercase()
    if (method == "GET" || method == "DELETE") {
        builder.method(method, null)
    } else {
        val bodyStr = cfg.body ?: ""
        val mt = "application/json; charset=utf-8".toMediaTypeOrNull()
        builder.method(method, bodyStr.toRequestBody(mt))
    }
    val req = builder.build()

    // Ejecuta la llamada en Dispatcher.IO para no bloquear dispatcher principal
    var code: Int? = null
    val ms = measureTimeMillis {
        val call = client.newCall(req)
        val resp = withContext(Dispatchers.IO) {
            try {
                call.execute()
            } catch (e: Exception) {
                null
            }
        }
        resp?.use { r ->
            code = r.code
            // lee cuerpo para liberar recursos (pero no lo usamos)
            r.body?.string()
        }
    }
    return code to ms
}

fun percentile(sorted: List<Long>, p: Double): Long {
    if (sorted.isEmpty()) return 0L
    val idx = ((p / 100.0) * (sorted.size - 1)).toInt().coerceIn(0, sorted.size - 1)
    return sorted[idx]
}

fun main(args: Array<String>) = runBlocking {
    val cfg = try {
        parseArgs(args)
    } catch (e: Exception) {
        println("Error: ${e.message}")
        println("Ejemplo: --url http://127.0.0.1:8080 --concurrency 50 --rps 200 --total 1000 --method GET")
        return@runBlocking
    }

    println("Configuración: $cfg")
    val client = buildClient(cfg.timeoutMs)
    val sem = Semaphore(cfg.concurrency)
    val rateLimiter = SimpleRateLimiter(cfg.rps)

    val successes = AtomicInteger(0)
    val failures = AtomicInteger(0)
    val statusCounts = mutableMapOf<Int, AtomicInteger>()
    val latencies = mutableListOf<Long>()
    val latMutex = Mutex()

    val start = System.currentTimeMillis()
    val jobs = mutableListOf<Job>()

    for (i in 1..cfg.total) {
        rateLimiter.acquire()
        sem.acquire()

        val job = launch {
            try {
                var attempt = 0
                var lastCode: Int? = null
                var latency: Long = 0
                var ok = false
                while (attempt <= cfg.retries && !ok) {
                    attempt++
                    val (code, ms) = doHttp(client, cfg)
                    lastCode = code
                    latency = ms
                    if (code != null && code in 200..399) {
                        successes.incrementAndGet()
                        ok = true
                    } else {
                        if (attempt > cfg.retries) failures.incrementAndGet()
                        // else retry
                    }
                }

                if (lastCode != null) {
                    synchronized(statusCounts) {
                        statusCounts.computeIfAbsent(lastCode) { AtomicInteger(0) }.incrementAndGet()
                    }
                }
                latMutex.withLock {
                    latencies.add(latency)
                }
            } finally {
                sem.release()
            }
        }
        jobs.add(job)
    }

    // espera a todos
    jobs.joinAll()
    val elapsedSec = (System.currentTimeMillis() - start) / 1000.0

    latMutex.withLock { latencies.sort() }

    val totalDone = successes.get() + failures.get()
    println("---- Resumen ----")
    println("Total solicit.: $totalDone")
    println("Exitosas: ${successes.get()}")
    println("Fallidas: ${failures.get()}")
    println("Tiempo total: ${"%.2f".format(elapsedSec)} s")
    println("Throughput promedio: ${"%.2f".format(if (elapsedSec > 0) totalDone / elapsedSec else 0.0)} req/s")
    println("Códigos de estado:")
    statusCounts.entries.sortedByDescending { it.value.get() }.forEach { (code, cnt) ->
        println("  $code -> ${cnt.get()}")
    }
    if (latencies.isNotEmpty()) {
        println("Latencias (ms) mediana: ${percentile(latencies, 50.0)}, p95: ${percentile(latencies, 95.0)}, p99: ${percentile(latencies, 99.0)}")
    } else {
        println("No se registraron latencias.")
    }

    client.dispatcher.executorService.shutdown()
    client.connectionPool.evictAll()
    println("Fin.")
}
