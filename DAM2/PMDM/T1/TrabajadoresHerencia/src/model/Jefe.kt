package model

class Jefe(nombre : String, apellido : String, dni : String, salario : Double, var nResponsabilidad : Int) : Trabajador(nombre, apellido, dni, salario) {

    fun disminuirResponsabilidad(){
        if (nResponsabilidad > 0){
            nResponsabilidad--
            println("Se ha bajado el nivel de responsabilidad a $nResponsabilidad")
        }
    }

    fun aumentarResponsabilidad(){
        if (nResponsabilidad < 5){
            nResponsabilidad++
            println("Se ha aumentado el nivel de responsabilidad a $nResponsabilidad")
        }
    }

    override fun calcularSalarioNeto(): Double {
        if (nResponsabilidad < 3) {
            return salario - 0.3
        } else {
            return salario + 0.3
        }
    }

    override fun mostrarDatos() {
        super.mostrarDatos()
        println("nResponsabilidad = ${nResponsabilidad}")
    }
}