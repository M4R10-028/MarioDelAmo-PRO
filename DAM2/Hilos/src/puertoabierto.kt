import java.io.IOException
import java.net.Socket
import java.net.UnknownHostException

fun main() {
    try {
        val cliente = Socket("192.168.2.217", 80)
        print("ha funcionado")
    } catch (e: UnknownHostException){
        print(e)
    } catch (e : IOException){
        print("No he podido abrir el puerto")
    }
}