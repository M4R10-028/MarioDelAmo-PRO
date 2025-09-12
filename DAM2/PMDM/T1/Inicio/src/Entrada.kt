fun main () {

    // comentario de linea
    /* El otro*/

    println("Este es mi primer programa Kotlin")
    var nombre = "Mario" // String
    var edad = 19 // Int
    var correo : String? = null
    lateinit var direccion : String
    val DNI = "123123A"


    println("Hola soy $nombre tengo $edad y mi dni es $DNI")
    println("Mi nombre tiene ${nombre.length} letras")
    correo = "mario@ces.com"
    println("Mi correo es ${correo ?: "sin asignar"} ")
}