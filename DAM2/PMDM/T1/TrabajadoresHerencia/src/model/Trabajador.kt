package model

abstract class Trabajador(nombre : String, apellido : String, dni : String, var salario : Double) : Persona(nombre, apellido, dni){

    //nombre, apellido, dni, Salario
    //op : telefono, mail, seguro
    var seguro : Boolean = false

    constructor(nombre: String, apellido: String, dni: String, salario: Double, telefono : Int, correo : String, seguro : Boolean) : this(nombre, apellido, dni, salario) {
        this.seguro = seguro
        this.telefono = telefono
        this.correo = correo
    }

    override fun mostrarDatos() {
        super.mostrarDatos()
        println("salario = ${salario}")
        println("seguro = ${seguro}")
    }

    abstract fun calcularSalarioNeto() : Double
}