package model

class Asalariado(nombre : String, apellido : String,dni : String , salario : Double, var nPagas : Int, var irpf: Double) : Trabajador(nombre, apellido, dni, salario) {

    override fun calcularSalarioNeto() : Double {
        //salario total - lo que te quitan de IRPF
        // 10000 0.20
        return salario - (salario * irpf)
    }

    //Un asalariado, puede pedir un aumento de salario
        // se genera un aleatorio entre 1-10
        // en caso de generar un numero < 5 no se le sube el salario
        // en caso de generar un numero > 5 se le sube un 10% el salario

    fun aumentoSalario(){
        var aleatorio : Int = (1..10).random()

        if (aleatorio < 5){
            println("Ha salido el numero $aleatorio, no hay subida de sueldo")
        } else {
            println("Ha salido el numero $aleatorio, se te ha subido el sueldo en un 10%")
            salario *= 1.1
        }
    }


    override fun mostrarDatos() {
        super.mostrarDatos()
        println("nPagas = ${nPagas}")
        println("irpf = ${irpf}")
    }
}