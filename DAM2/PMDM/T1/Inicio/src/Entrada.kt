fun main () {

    // comentario de linea
    /* El otro*/

    println("Este es mi primer programa Kotlin")
    var nombre = "Mario" // String
    var edad: Int = 19 // Int
    var correo : String? = null
    lateinit var direccion : String
    val DNI = "123123A"

    /*
    println("Por favor introduce tu nombre")
    nombre = readln()
    println("Introduce tu edad")
    edad = readln().toInt()
    saludar(nombre,1)
    */
    //println("El resultado de la operacion es ${sumar(4,7)}")
    sumaFlecha(5, 7)
    /*
    println("Hola soy $nombre tengo $edad y mi dni es $DNI")
    println("Mi nombre tiene ${nombre.length} letras")
    correo = "mario@ces.com"
    println("Mi correo es ${correo ?: "sin asignar"} ")
    */
    repetirFor()
}

fun saludar(nombreParam : String, vecesParam : Int = 1) {
    println("Hola $nombreParam acabas de realizar una funcion")

}

fun sumar(op1: Int = 0, op2: Int = 0) : Int {
    return op1.and(op2)
}

val sumaFlecha = { p1 : Int, p2 : Int ->
    println("El resultado de la suma es ${p1 + p2}") }

// como si fuera un switch
fun decidirWhen(valor:Int){
    println("El valor analizado es: ")
    when(valor){
        1->{
            println("El caso tiene como valor 1")
        }
        2->{
            println("El caso tiene como valor 2")
        }
        3->{
            println("El caso tiene como valor 3")
        }
        4->{
            println("El caso tiene como valor 4")
        }
        else->{
            println("El valor no esta dentro de la lista de opciones")
        }
    }
}

fun repetirFor(){
    for (i in 0..9){
        println(i)
    }
    (20..30).forEach {  }

    //si la funcion de flecha solo tiene 1 argumento
    //-> se puede llamar con la palabra reservada it

    //Si no quiero utilizar i la pongo como _
    (20..30).forEachIndexed { index, i ->  }
}