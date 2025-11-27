import java.io.ObjectInputStream
import java.net.ServerSocket

class ServidorO {
    fun iniciarServidor(){
        val servidor = ServerSocket(1238)
        val cliente = servidor.accept()
        val recibir = ObjectInputStream(cliente.getInputStream())
        val objetoserializado = recibir.readObject() as Persona
        println(objetoserializado.edad)
        recibir.close()
        cliente.close()
        servidor.close()
    }
}