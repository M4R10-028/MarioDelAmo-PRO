fun main() {
    val hiloLiebre = Thread{

        println("Empieza hilo liebre")

        try {
            while (!Thread.currentThread().isInterrupted){
                for (i in 1..10){
                    println("Liebre corriendo")
                    Thread.sleep(1000)
                }
            }
        }catch (e: InterruptedException){
            println("Liebre abatida")
        }

        println("Liebre acabado")

    }

    val hiloTortuga = Thread{
        println("Ejecutando hilo Tortuga")
        for (i in 1..10){
            println("Tortuga corriendo")
            Thread.sleep(3000)
        }
        println("Tortuga acabado")
    }

    println("La carrera ha empezado")

    hiloTortuga.start()
    hiloLiebre.start()

    Thread.sleep(5000)
    hiloLiebre.interrupt()

    hiloTortuga.join()
    hiloLiebre.join()

    println("La carrera ha acabado")
}