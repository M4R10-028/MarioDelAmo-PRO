package model

class Directivo (nombre : String, apellido : String, dni : String, telefono : Int, correo : String, var nAcciones : Int) : Persona(nombre,apellido,dni,telefono,correo), Sindicato {

    override fun mostrarDatos() {
        super.mostrarDatos()
        println("nAcciones = ${nAcciones}")
    }

    fun venderAcciones (acciones : Int) {
        if (acciones > nAcciones){
            println("No puedes vender tantas acciones")
        } else {
            nAcciones -= acciones
            println("Numero de acciones actualizado")
        }
    }

    override fun bajarSueldos(lista: ArrayList<Trabajador>): Boolean {
        println("Procedes a bajar los sueldos, eres directivo y puedes hacerlo")
        lista.forEach {
            if (it is Jefe){
                it.salario *= 0.9
            } else {
                it.salario *= 0.8
            }
        }
        return true
    }

    override fun calcularBeneficios(): Double {
        println("Como directivo, vas a calcular el beneficio de la empresa")
        return 0.0
    }

}