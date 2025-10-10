import kotlin.system.measureTimeMillis

fun tablaMultiplicar(){
    for (i in 1..10){
        println("Tabla de multiplicar del $i: ")
        for (j in 1..10){
            println("$j x $i = ${j * i}")
        }
        println()
    }
}

fun main() {
    val tiempo = measureTimeMillis {
        val hilos = Thread {tablaMultiplicar()}

        hilos.start()
        hilos.join()
    }
    println(tiempo)
}