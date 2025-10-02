package model

class Autonomo(nombre : String, apellido : String, dni : String, salario : Double, seguro : Boolean, var cuotasSS : Double) : Trabajador(nombre, apellido, dni, salario) {

    fun pedirDescuento(){
        if (seguro){
            cuotasSS *= 0.5
        }
    }

    override fun mostrarDatos() {
        super.mostrarDatos()
        println("cuotasSS = ${cuotasSS}")
    }

    override fun calcularSalarioNeto(): Double {
        return salario - (cuotasSS * 12)
    }


}