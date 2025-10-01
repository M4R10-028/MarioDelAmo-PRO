package model

class Trabajador(nombre : String, apellido : String, dni : String, var salario : Int, var nPagas : Int) : Persona(nombre, apellido, dni){

    //nombre, apellido, dni, Salario, Pagas
    //op : telefono, mail, seguro
    var seguro : Boolean = false

    constructor(nombre: String, apellido: String, dni: String, salario: Int, nPagas: Int, telefono : Int, correo : String, seguro : Boolean) : this(nombre, apellido, dni, salario, nPagas) {
        this.seguro = seguro
        this.telefono = telefono
        this.correo = correo
    }

    override fun mostrarDatos() {
        super.mostrarDatos()
        println("salario = ${salario}")
        println("nPagas = ${nPagas}")
        println("seguro = ${seguro}")
    }
}