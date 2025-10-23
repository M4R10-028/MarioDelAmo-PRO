import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    val jobs = mutableListOf<Job>()
    runBlocking {
        for (i in 1..10){

            val job = launch {
                println("Tabla de multiplicar del $i: ")
                for (j in 1..10){
                    println("$j x $i = ${j * i}")
                }
                println()
            }
            jobs.add(job)
        }
    }
}