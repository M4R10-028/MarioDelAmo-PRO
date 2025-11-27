import java.net.DatagramPacket
import java.net.DatagramSocket
import java.net.InetAddress

fun main() {
    val datagrama = DatagramSocket()
    val direccion = InetAddress.getByName("localhost")
    val paquete = DatagramPacket("Hola buenas".toByteArray(),"Hola buenas".toByteArray().size,direccion,1234)
    datagrama.send(paquete)
}