import java.net.Socket

fun main() {
    val cliente = Socket("196.168.2.216",12345)

    cliente.getOutputStream().write("hola profe".toByteArray())

    cliente.close()
}