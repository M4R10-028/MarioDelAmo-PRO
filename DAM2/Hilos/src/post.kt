import okhttp3.HttpUrl
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URI

fun main() {
    val url = URI("https://countries.trevorblades.com/").toURL()
    val parametro = ("""
        {
            "query": "query { countries { name, code } }"
        }
    """.trimIndent()).trimIndent()

    val conexion = url.openConnection() as HttpURLConnection

    conexion.requestMethod = "POST"
    conexion.setRequestProperty("Content-Type","application/json")

    conexion.doOutput = true
    val out = conexion.getOutputStream()
    out.write(parametro.toByteArray())
    out.flush()
    out.close()

}