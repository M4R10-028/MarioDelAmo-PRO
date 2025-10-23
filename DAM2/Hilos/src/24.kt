import kotlinx.coroutines.*
import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.sync.withPermit
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.io.IOException
import java.net.URI
import java.time.Duration
import kotlin.math.min
import kotlin.random.Random

suspend fun httpRequest(client: OkHttpClient, url: String, attempt: Int = 1): Int {
    val request = Request.Builder().url(url).build()
    try {
        client.newCall(request).execute().use { response ->
            return response.code
        }
    } catch (e: IOException) {
        if (attempt <= 3) {
            // pequeña espera exponencial antes de reintentar
            delay(200L * attempt)
            return httpRequest(client, url, attempt + 1)
        } else {
            throw e
        }
    }
}

fun isLikelySafeTarget(url: String): Boolean {
    // Recomienda solo targets en local / privada por defecto (puedes ajustar política)
    return try {
        val u = URI(url)
        val host = u.host ?: return false
        // valores simples: localhost o direcciones privadas
        host == "localhost" || host == "127.0.0.1" || host.startsWith("192.168.") || host.startsWith("10.") || host.startsWith("172.")
    } catch (e: Exception) {
        false
    }
}

fun main() = runBlocking {
    val client = OkHttpClient.Builder()
        .callTimeout(Duration.ofSeconds(15))
        .connectTimeout(Duration.ofSeconds(5))
        .readTimeout(Duration.ofSeconds(10))
        .build()

    println("Introduce la URL:")
    // Si quieres evitar pedir input (script), puedes asignar la URL aquí.
    val urlInput = readLine()?.trim().takeIf { !it.isNullOrBlank() } ?: run {
        println("URL no válida. Saliendo.")
        return@runBlocking
    }

    if (!isLikelySafeTarget(urlInput)) {
        println("ADVERTENCIA: La URL indicada no parece ser local/privada. Por seguridad, este script solo permite objetivos locales/privados por defecto.")
        println("Si realmente necesitas probar otra URL, modifica manualmente el código con responsabilidad.")
        return@runBlocking
    }

    println("¿Cuántas peticiones quieres enviar? (número entero):")
    val cantidadRaw = readLine()
    val cantidadSolicitada = cantidadRaw?.toLongOrNull() ?: run {
        println("Cantidad no válida. Saliendo.")
        return@runBlocking
    }

    // LÍMITE PARA EVITAR ABUSO ACCIDENTAL
    val cantidad = Integer.MAX_VALUE

    // Concurrencia máxima y rate limit (peticiones por segundo por worker)
    val maxConcurrency = 50 // ajustable
    val rateDelayMillis = 50L // pausa mínima entre peticiones de un worker (limitador simple)

    println("\nEnviando $cantidad peticiones a: $urlInput")
    val semaphore = Semaphore(maxConcurrency)
    val successes = AtomicCounter()
    val failures = AtomicCounter()

    val start = System.currentTimeMillis()

    // Lanzamos coroutines que piden de 1..cantidad
    val jobs = mutableListOf<Job>()
    for (i in 1..cantidad) {
        val job = launch {
            semaphore.withPermit {
                // pequeña jitter para evitar picos sincronizados
                delay(Random.nextLong(0, 20))

                try {
                    val code = httpRequest(client, urlInput)
                    println("[$i] Código: $code")
                    if (code in 200..299) successes.increment()
                    else failures.increment()
                } catch (e: Exception) {
                    println("[$i] Error: ${e.message}")
                    failures.increment()
                } finally {
                    delay(rateDelayMillis)
                }
            }
        }
        jobs.add(job)
    }

    // Espera a que todo termine
    jobs.joinAll()
    val elapsed = (System.currentTimeMillis() - start) / 1000.0
    println("\n✅ Completado. Peticiones enviadas: $cantidad")
    println("   Éxitos: ${successes.get()}  Fallos: ${failures.get()}")
    println("   Tiempo total: ${"%.2f".format(elapsed)} s  (≈ ${"%.2f".format(cantidad / maxOf(1.0, elapsed))} req/s)")
}

// Contador simple y seguro para concurrencia
class AtomicCounter {
    private val mutex = java.util.concurrent.atomic.AtomicLong(0)
    fun increment() = mutex.incrementAndGet()
    fun get() = mutex.get()
}
