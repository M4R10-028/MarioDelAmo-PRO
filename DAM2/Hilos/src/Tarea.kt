import java.util.concurrent.Executors

fun main() {
    val ejecutar = Executors.newSingleThreadExecutor()
    ejecutar.execute {
        println("Soy un hilo")
        //Aqui todo lo que nos apetezca
    }
    ejecutar.shutdown()
}