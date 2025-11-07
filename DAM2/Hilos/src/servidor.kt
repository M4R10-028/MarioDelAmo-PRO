import java.net.ServerSocket


fun main() {
    val servidor = ServerSocket(12345)

    val clientes = servidor.accept()

    println(clientes.getInputStream().bufferedReader().readLine())
    clientes.close()
    servidor.close()
}