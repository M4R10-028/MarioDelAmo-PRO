import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URI

fun main() {
    val url = URI("http://localhost/index.html").toURL()

    val conexion = url.openConnection()

    val input = conexion.getInputStream()

    val buffer = BufferedReader(InputStreamReader(input))

    var linea : String?
    /*
    while (buffer.readLine().also { linea = it } != null){
        println(linea)
    }*/

    buffer.useLines { linea ->
        for (string in linea){
            println(string)
        }
    }

    /*
    buffer.useLines { lineas ->
        lineas.forEach { linea ->
            println(string)
        }
    }
     */
    
}