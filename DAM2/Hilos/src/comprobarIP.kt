import kotlinx.coroutines.*
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException
import java.net.InetSocketAddress
import java.net.Socket
import java.time.Duration

fun main() = runBlocking {
    val base = "192.168.2"
    val start = 1
    val end = 254

    val port = 80
    val connectTimeoutMs = 1000
    val httpCallTimeoutSeconds = 5L
    val pauseBetweenHostsMs = 500L // 1 segundo

    val httpClient = OkHttpClient.Builder()
        .callTimeout(Duration.ofSeconds(httpCallTimeoutSeconds))
        .build()

    val openHosts = mutableListOf<String>()

    println("Escaneo secuencial $base.$start..$base.$end puerto $port (1s pausa entre hosts).")

    for (i in start..end) {
        val ip = "$base.$i"
        println("\n-> Comprobando $ip:$port ...")

        val abierto = withContext(Dispatchers.IO) {
            isPortOpen(ip, port, connectTimeoutMs)
        }

        if (abierto) {
            println("   ✅ $ip:$port abierto. Haciendo petición HTTP...")
            try {
                val (code, preview) = withContext(Dispatchers.IO) {
                    httpGetPreview(httpClient, ip, port)
                }
                println("      HTTP code: $code")
                if (preview.isNotBlank()) {
                    val previewSafe = preview.replace("\n", "\\n").take(800)
                    println("      Cuerpo (preview): $previewSafe${if (preview.length > 800) "...(truncado)" else ""}")
                } else {
                    println("      (sin cuerpo)")
                }
                openHosts.add(ip)
            } catch (e: Exception) {
                println("      ⚠️ Error en petición HTTP: ${e.message}")
            }
        } else {
            println("   ❌ $ip:$port cerrado / inaccesible.")
        }

        // Espera 1 segundo antes de comprobar la siguiente IP
        delay(pauseBetweenHostsMs)
    }

    println("\n--- Resumen ---")
    if (openHosts.isEmpty()) {
        println("Ninguna IP con puerto $port abierta encontrada.")
    } else {
        println("IPs con puerto $port abierto:")
        openHosts.forEach { println(" - $it") }
    }

    // Cerrar cliente OkHttp si quieres (no estrictamente necesario aquí)
    httpClient.dispatcher.executorService.shutdown()
    httpClient.connectionPool.evictAll()
    println("Fin del escaneo.")
}

/**
 * Comprueba si el puerto está abierto intentando conectar con timeout.
 */
fun isPortOpen(host: String, port: Int, timeoutMs: Int): Boolean {
    return try {
        Socket().use { socket ->
            socket.connect(InetSocketAddress(host, port), timeoutMs)
        }
        true
    } catch (e: IOException) {
        false
    } catch (e: IllegalArgumentException) {
        false
    }
}

/**
 * Hace una petición HTTP GET a http://<ip>:<port>/ y devuelve (codigo, cuerpo).
 */
fun httpGetPreview(client: OkHttpClient, ip: String, port: Int): Pair<Int, String> {
    val url = "http://$ip:$port/"
    val request = Request.Builder()
        .url(url)
        .header("User-Agent", "Kotlin-PortChecker/1.0")
        .build()

    client.newCall(request).execute().use { resp ->
        val code = resp.code
        val body = resp.body?.string() ?: ""
        return code to body
    }
}
