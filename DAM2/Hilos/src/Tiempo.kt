import java.util.Calendar
import kotlin.concurrent.thread

fun main() {
    while (true){
        val horaActual = Calendar.getInstance().time
        println(horaActual)
        Thread.sleep(1000)
    }

}