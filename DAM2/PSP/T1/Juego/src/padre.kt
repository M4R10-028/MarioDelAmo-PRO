import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val proceso = ProcessBuilder("C:\\Users\\Usuario DAM2\\.jdks\\openjdk-24.0.2+12-54\\bin\\java.exe\" \"-javaagent:C:\\Users\\Usuario DAM2\\AppData\\Local\\Programs\\IntelliJ IDEA Community Edition 2025.2.1\\lib\\idea_rt.jar=63000\" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath \"C:\\Users\\Usuario DAM2\\Documents\\Github\\MarioDelAmo-PRO\\DAM2\\PSP\\T1\\Juego\\out\\production\\Juego;C:\\Users\\Usuario DAM2\\.m2\\repository\\org\\jetbrains\\kotlin\\kotlin-stdlib-jdk8\\2.1.21\\kotlin-stdlib-jdk8-2.1.21.jar;C:\\Users\\Usuario DAM2\\.m2\\repository\\org\\jetbrains\\kotlin\\kotlin-stdlib\\2.1.21\\kotlin-stdlib-2.1.21.jar;C:\\Users\\Usuario DAM2\\.m2\\repository\\org\\jetbrains\\annotations\\13.0\\annotations-13.0.jar;C:\\Users\\Usuario DAM2\\.m2\\repository\\org\\jetbrains\\kotlin\\kotlin-stdlib-jdk7\\2.1.21\\kotlin-stdlib-jdk7-2.1.21.jar\" HijoKt").start()
    val out = OutputStreamWriter(proceso.outputStream)
    val leer = BufferedReader(InputStreamReader(proceso.inputStream))

    // Mapa de categorías a opciones de platos
    val menu = mapOf(
        "pizza" to listOf("Margarita", "Pepperoni", "Cuatro Quesos"),
        "pasta" to listOf("Carbonara", "Lasaña", "Penne Arrabiata"),
        "hamburguesa" to listOf("Clásica", "Cheeseburger", "BBQ Burger")
    )

    println("Bienvenidos al restaurante. Pueden pedir varios tipos de platos separados por comas.")

    // Lista para acumular confirmaciones de cocina
    val confirmaciones = mutableListOf<String>()

    while (true) {
        print("Clientes: ¿Qué tipos de platos quieren pedir? (pizza, pasta, hamburguesa) o 'nada mas': ")
        val tiposInput = readLine()?.lowercase()?.trim() ?: break
        if (tiposInput == "nada mas") break

        val tiposPedidos = tiposInput.split(",").map { it.trim() }

        for (tipo in tiposPedidos) {
            val opciones = menu[tipo]
            if (opciones == null) {
                println("Camarero: Lo siento, no tenemos $tipo.")
                continue
            }

            println("Camarero: ¡Excelente! Para $tipo tenemos estas opciones: ${opciones.joinToString(", ")}")
            print("Clientes: ¿Cuál eligen?: ")
            val eleccion = readLine()?.trim() ?: continue

            // Enviar al hijo
            out.write("$eleccion\n")
            out.flush()

            // Leer confirmación de la cocina y guardar en la lista
            val confirmacion = leer.readLine()
            if (confirmacion != null) {
                confirmaciones.add(confirmacion)
                println("Camarero: ¡Perfecto! Su $eleccion está en camino.\n")
            }
        }
    }

    // Al final del todo, imprimir todas las confirmaciones
    println("\n=== Resumen de platos preparados ===")
    confirmaciones.forEach { println("Cocina: $it") }

    out.close()
    println("Camarero: ¡Gracias por su visita! Que tengan un buen día.")
}
