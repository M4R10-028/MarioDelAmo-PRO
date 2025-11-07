import okhttp3.OkHttpClient
import okhttp3.Request

fun main() {
    val cliente = OkHttpClient()
    val url = "http://192.168.2.216/"
    val peticion = Request.Builder().url(url).build()
    val respuesta = cliente.newCall(peticion).execute()
    println(respuesta.body?.string())

    print(OkHttpClient().newCall(Request.Builder().url("http://192.168.2.216/").build()).execute())
}