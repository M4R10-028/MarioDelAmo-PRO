import javax.sound.midi.Soundbank;

public class Entrada {

    public static void main(String[] args) {
        //Operadores aritmeticos - binarios
        System.out.println("OPERACIONES ARITMETICOS");
        float operador1 = 10;
        int operador2 = 5;
        float resultado = operador1 + operador2; // 15
        System.out.println("El resultado de la suma es " + resultado);
        resultado = operador1 - operador2; //5
        System.out.println("El resultado de la resta es " + resultado);
        resultado = operador1 * operador2; //50
        System.out.println("El resultado de la multiplicacion es " + resultado);
        operador1 = 7;
        operador2 = 4;
        resultado = operador1 / operador2; //1
        // Si los dos numeros divididos son enteros (int) el resultado sera entero, si uno de los dos es (float, double) este dará el resultado completo con decimales.
        System.out.println("El resultado de la division es " + resultado);
        resultado = operador1 % operador2;
        System.out.println("El resultado del resto es " + resultado); //3.0
        //Aritmeticos - monarios
        resultado = -resultado; //-3
        System.out.println("El resultado del opuesto es " + resultado);
        // resultado = resultado + 1
        resultado++;
        resultado++;
        resultado++;
        resultado++;
        resultado++;
        System.out.println("El resultado del incremento es " + resultado); // -2
        resultado--;
        System.out.println("El resultado del decremento es " + resultado); // 1


        System.out.println("OPERADORES DE ASIGNACION");
        // resultado = 1
        operador1 = 10;
        resultado += operador1; //11
        System.out.println("El resultado de la suma asignada es " + resultado);
        resultado -= 6;
        System.out.println("El resultado de la resta asignada es " + resultado);
        resultado *= 3;
        System.out.println("El resultado de la multiplicacion asignada es " + resultado);
        resultado /= 2; // 7.5 porq uno de los operadores y el resultado estan en float
        System.out.println("El resultado de la division asignada es " + resultado);
        resultado %= 2; // 1
        System.out.println("El resultado del modulo asignado es " + resultado);


        System.out.println("OPERADORES DE COMPARACION");
        //nos dejan comparar numeros y booleanos, nunca strings (palabras)
        int n1 = 10;
        int n2 = 7;
        boolean r = n1 > n2; // 10 > 7
        System.out.printf("El resultado de la comparacion de %d mayor que %d es %b. \n", n1, n2, r);
        r = n1 < n2;
        System.out.printf("El resultado de la comparacion de %d menor que %d es %b. \n", n1, n2, r);
        r = n1 >= n2;
        System.out.printf("El resultado de la comparacion de %d mayor o igual que %d es %b. \n", n1, n2, r);
        r = n1 <= n2;
        System.out.printf("El resultado de la comparacion de %d menor o igual que %d es %b. \n", n1, n2, r);
        r = n1 == n2;
        System.out.printf("El resultado de la comparacion de %d igual que %d es %b. \n", n1, n2, r);
        r = n1 != n2;
        System.out.printf("El resultado de la comparacion de %d diferente que %d es %b. \n", n1, n2, r);
        // x > x mayor que
        // x < x menor que
        // x >= x mayor o igual que
        // x <= x menor o igual que
        // x == x igual que
        // x != x diferente que

        /*Lógicos:
        AND y OR    n1=10       n1>n2 --> False
           (AND)    n2=15       n3%n4 !=o --> False
                    n3=20
                    n4=2
        C1   C2   R  (todas tienen que ser true, con un solo false, el resultado ya es false)
        F     F   F
        F     T   F
        T     F   F
        T     T   T

            (OR)      (si hay un solo true, ya se que el resultado es true)
        C1    C2    R
         T     T    T
         F     F    F
         F     T    T
         T     F    T

         */
        System.out.println("OPERADORES LÓGICOS");
        n1 = 30;
        n2 = 40;
        boolean n3 = true;
        int n4 = -20;
        boolean resultadoLogico = (n1<n2) && !n3 && n4<0; //true && true && true = true
        System.out.println("El resultado logico de las && es " + resultadoLogico);
        resultadoLogico = (n1>0) || (n2!=n1) || n3 || n4>0; // true || true || true || false = true
        System.out.println("El resultado logico de las || es " + resultadoLogico);
        boolean resultadoCompuesto = ((n1>n2)&& !n3 && (n4<10))|| n4>0 || n2>0;
                                     //(F && F && T) || F || T
                                     // F || F || T
                                     // T
        String palabra1 = "Hola"; //la diferencia entre .equals y .equalsIgnoreCase es que el equals compara las dos palabras
        String palabra2 = "hola"; //teniendo en cuenta las mayusculas mientras que el equalsIgnoreCase ignora las mayusculas y las comprara como iguales
        boolean resultadoPalabras = palabra1.equals(palabra2);
        System.out.println("El resultado de la comparación de las palabras es " + resultadoPalabras);


        n1 = 4;
        n2 = 3;
        double resultadoOperacion = (double) n1/n2;
        double n1Double = (double) n1;
        String n1String = String.valueOf(n1);
        String palabra = "Hola ya terminamos";
        int numeroPalabra = Integer.parseInt(palabra);
        System.out.println("El resultado de la division es " + resultadoOperacion);


    }
}
