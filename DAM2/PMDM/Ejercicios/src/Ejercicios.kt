fun main() {
    val ejercicios = Ejercicios()
    //ejercicios.ejercicio1()
    //ejercicios.ejercicio2()
    //ejercicios.ejercicio3()
    //ejercicios.ejercicio4()
    ejercicios.ejercicio5()
}

class Ejercicios {

     fun ejercicio1 () {
         println("Introduce el numero")
         var num1 = readln().toInt()

         if (num1 % 2 == 0){
             println("El numero es par")
         } else {
             println("El numero es impar")
         }
     }

    fun ejercicio2(){
        println("Introduce un numero")
        var num1 = readln().toInt()

        if (num1 > 0) {
            println("Tu numero es positivo")
        } else if (num1 < 0) {
            println("Tu numero es negativo")
        } else {
            println("Tu numero es 0")
        }
    }

    fun ejercicio3 (){
        println("Introduce tu numero")
        var num1 = readln().toInt()

        if (esPrimo(num1)) {
            println("El numero es primo")
        } else {
            println("El numero no es primo")
        }
    }

    fun esPrimo(n : Int) : Boolean {
        for (i in 2..n-1) {
            if (n % i == 0){
                return false
            }
        }
        return true
    }

    fun ejercicio4() {
        println("Introduce un numero")
        var numero = readln().toInt()
        val primos = mutableListOf<Int>()

        for (i in 2..numero){
            if (esPrimo(i)){
                primos.add(i)
            }
        }

        println("Los primos menores o iguales a $numero son ${primos.joinToString(", ")}")
    }

    fun ejercicio5() {
        println("Dime un numero")
        val numero = readln().toInt()
        var factorial = 1L
        for (i in 2..numero) {
            factorial *= i
        }
        println("El factorial de $numero es $factorial")
    }

    fun ejercicio6() {
        println("Introduce un numero")
        val numero = readln().toInt()
        var suma = 0
        for(i in 1..(numero - 1)) {
            suma += i
        }
        println("La suma de los $numero primeros numeros naturales es de $suma")
    }

    fun ejercicio7() {

    }
}
