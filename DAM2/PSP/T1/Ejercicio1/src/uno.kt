import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args:Array<String>) {
    //val nombre = "arp -a"
    //val proceso = ProcessBuilder("cmd.exe","/c","arp -a ")
    //val procesoTemporal = proceso.start()

    //print(procesoTemporal.inputStream.bufferedReader().readText())
    //print(procesoTemporal.isAlive)
    //procesoTemporal.waitFor()

    /*val lector = BufferedReader(InputStreamReader(procesoTemporal.inputStream))
    var linea:String?
    while (lector.readLine().also { linea = it } != null){
        print( linea )
    }*/


    var linea = BufferedReader(InputStreamReader(ProcessBuilder("C:\\Users\\Usuario DAM2\\.jdks\\openjdk-24.0.2+12-54\\bin\\java.exe\" \"-javaagent:C:\\Users\\Usuario DAM2\\AppData\\Local\\Programs\\IntelliJ IDEA Community Edition 2025.2.1\\lib\\idea_rt.jar=54868\" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath \"C:\\Users\\Usuario DAM2\\Documents\\Github\\MarioDelAmo-PRO\\DAM2\\PSP\\T1\\Ejercicio1\\out\\production\\Ejercicio1;C:\\Users\\Usuario DAM2\\.m2\\repository\\org\\jetbrains\\kotlin\\kotlin-stdlib-jdk8\\2.1.21\\kotlin-stdlib-jdk8-2.1.21.jar;C:\\Users\\Usuario DAM2\\.m2\\repository\\org\\jetbrains\\kotlin\\kotlin-stdlib\\2.1.21\\kotlin-stdlib-2.1.21.jar;C:\\Users\\Usuario DAM2\\.m2\\repository\\org\\jetbrains\\annotations\\13.0\\annotations-13.0.jar;C:\\Users\\Usuario DAM2\\.m2\\repository\\org\\jetbrains\\kotlin\\kotlin-stdlib-jdk7\\2.1.21\\kotlin-stdlib-jdk7-2.1.21.jar\" LlamarKt").start().inputStream)).readLine()
    println(linea.uppercase())

}