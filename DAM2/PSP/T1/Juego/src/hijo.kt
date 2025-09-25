import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val input = BufferedReader(InputStreamReader(System.`in`))

    var plato: String?
    while (true) {
        plato = input.readLine() ?: break
        if (plato.isNotBlank()) {
            println("$plato listo")
            System.out.flush()
        }
    }
}