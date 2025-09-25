import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val proceso = ProcessBuilder("C:\\Users\\Usuario DAM2\\.jdks\\openjdk-24.0.2+12-54\\bin\\java.exe\" \"-javaagent:C:\\Users\\Usuario DAM2\\AppData\\Local\\Programs\\IntelliJ IDEA Community Edition 2025.2.1\\lib\\idea_rt.jar=58866\" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath \"C:\\Users\\Usuario DAM2\\Documents\\Github\\MarioDelAmo-PRO\\DAM2\\PSP\\T1\\Llamadas\\out\\production\\Llamadas;C:\\Users\\Usuario DAM2\\.m2\\repository\\org\\jetbrains\\kotlin\\kotlin-stdlib-jdk8\\2.1.21\\kotlin-stdlib-jdk8-2.1.21.jar;C:\\Users\\Usuario DAM2\\.m2\\repository\\org\\jetbrains\\kotlin\\kotlin-stdlib\\2.1.21\\kotlin-stdlib-2.1.21.jar;C:\\Users\\Usuario DAM2\\.m2\\repository\\org\\jetbrains\\annotations\\13.0\\annotations-13.0.jar;C:\\Users\\Usuario DAM2\\.m2\\repository\\org\\jetbrains\\kotlin\\kotlin-stdlib-jdk7\\2.1.21\\kotlin-stdlib-jdk7-2.1.21.jar\" HijoKt")
    val procesoArrancado = proceso.start()

    val array = arrayOf("hola", "desde", "el", "proceso", "padre")

    val out = OutputStreamWriter(procesoArrancado.outputStream)
    out.write(array.joinToString(",") + "\n")
    out.flush()

    val input = procesoArrancado.inputStream
    val leer = BufferedReader(InputStreamReader(input))
    print(leer.readLine())
    //print(array.joinToString(", "))
}