package model

class Jugador (var id : Int, var nombre : String, var posicion : String, var valor : Int, var puntuacion : Int) {

    fun mostrarDatos(){
        println("id = ${id}")
        println("nombre = ${nombre}")
        println("posicion = ${posicion}")
        println("id = ${valor}")
        println("puntuacion = ${puntuacion}")
        println()
    }
}