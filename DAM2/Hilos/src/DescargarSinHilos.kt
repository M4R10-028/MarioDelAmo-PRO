import java.util.concurrent.TimeUnit
import kotlin.system.measureTimeMillis
import kotlin.time.measureTime

fun descargar(){
    println("Comienzo a descargar")
    TimeUnit.SECONDS.sleep(2)
    println("Lo he descargado")
}

fun main(){
    val tiempo = measureTimeMillis {
        for (i in 1..3){
            descargar()
        }
    }
    println(tiempo)
}