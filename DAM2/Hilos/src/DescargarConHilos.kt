import java.util.concurrent.TimeUnit
import kotlin.system.measureTimeMillis

fun descargar2(){

    TimeUnit.SECONDS.sleep(2)

}

fun main() {
    val tiempo = measureTimeMillis {
        val hilos = listOf(
            Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}, Thread {descargar2()}
        )
        hilos.forEach { it.start() }
        hilos.forEach { it.join() }
    }
    println(tiempo)
}