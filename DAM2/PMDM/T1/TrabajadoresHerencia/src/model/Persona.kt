package model

abstract class Persona (var nombre : String, var apellido : String, var dni : String){

    var telefono : Int? = null
    var correo : String? = null

    constructor(nombre: String, apellido: String, dni: String, telefono : Int, correo : String) : this(nombre, apellido, dni) {
        this.telefono = telefono
        this.correo = correo
    }

    open fun mostrarDatos(){
        println("nombre = ${nombre}")
        println("apellido = ${apellido}")
        println("dni = ${dni}")
        println("telefono = ${telefono?: "no se ha definido"}")
        println("correo = ${correo ?: "no se ha definido"}")
    }
}