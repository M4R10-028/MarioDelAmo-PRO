import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Ejercicios {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
        //ejercicio11();
        //ejercicioP();
        //ejercicio13();
        ejercicio14();
    }

    public static void ejercicio1() {
        System.out.println("Cuantas temperaturas quieres introducir");
        float n = scanner.nextInt();

        float temperatura=0;
        float sumatorio=0;
        if (n <= 0){
            n=10;
        }
        for (int i=0; i<n; i++){
            System.out.printf("Dime la %d temperatura", i+1);
            temperatura = scanner.nextFloat();
            sumatorio = sumatorio + temperatura;
        }
        float media= sumatorio / n;
        System.out.printf("La suma de todas las temperaturas es %.2f\nLa media de las temperaturas es de %.2f",sumatorio, media);
    }

    public static void ejercicio2() {
        System.out.println("De que número quieres ver la tabla de multiplicar");
        int n = scanner.nextInt();

        for (int i=0; i<11; i++){
            int r = n * i;
            System.out.println(n + " * " + i + " = " + r);
        }
    }

    public static void ejercicio3() {
        System.out.println("Hasta que numero quieres saber la tabla de multiplicar");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            for (int x = 0; x < 11; x++) {
                int r = i * x;
                System.out.println("\t" + i + " * " + x + " = " + r);
            }
        }
    }

    public static void ejercicio4() {
        System.out.println("Desde que numero quieres saber las tablas de multiplicar");
        int ni = scanner.nextInt();

        System.out.println("Hasta que numero quieres saber la tabla de multiplicar");
        int n = scanner.nextInt();

        if (ni>=n){
            System.out.println("No se puede ejecutar");
        }else{

        for (int i = ni; i < n+1; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            for (int x = 0; x < 11; x++) {
                int r = i * x;
                System.out.println("\t" + i + " * " + x + " = " + r);
            }
        }
        }
    }

    public static void ejercicio5() {

        System.out.println("Dime un numero entero para la base");
        int base = scanner.nextInt();

        System.out.println("Dime un numero entero para el exponente");
        int exp = scanner.nextInt();

        int resultado=1;
        //Cualquier cosa elevada a 0
        if (exp==0){
            System.out.println("El resultado de la potencia es 1");
        } else if(base==0){
            System.out.println("No se calculan potencias con base 0");
        } else {
            for (int i = 0; i < exp; i++){
                //multiplicar tantas veces la base como diga el exponente
                resultado = resultado * base;
            }
            System.out.println("El resultado de la potencia es " + resultado);
        }
    }

    public static void ejercicio6() {
        System.out.println("Dime un numero inicial");
        int ni = scanner.nextInt();

        System.out.println("Dime un numero final");
        int nf = scanner.nextInt();

        for (int i = ni; i <= nf; i++ ) {
            //preguntar si es par o no
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void ejercicio7() {
        System.out.println("Cuantas veces quieres tirar el dado");
        int nv = scanner.nextInt();

        if (nv < 1){
            System.out.println("No se puede tirar veces negativas");
            nv = 100;
        }
        for (int i = 1; i <= nv; i++) {
            int tirada = (int) (Math.random() * 6) + 1;
            System.out.printf("La tirada numero %d es %d \n", i, tirada);
        }
    }
    public static void ejercicio8() {
        int acumuladorPositivos = 0, acumuladorNegativos = 0, numeroCeros = 0, numeroNegativo = 0, numeroPositivo = 0;
        for (int i = 0; i <= 9; i++) {
            System.out.println("Por favor introduce el numero que quieres");
            int n = scanner.nextInt();
            if (n < 0) {
                acumuladorNegativos += n;
                numeroNegativo++;
            } else if (n > 0) {
                acumuladorPositivos += n;
                numeroPositivo++;
            } else {
                numeroCeros++;
            }
        }
        System.out.println("La media de positivos es " + ((float)acumuladorPositivos/numeroPositivo));
        System.out.println("La media de negativos es " + ((float)acumuladorNegativos/numeroNegativo));
        System.out.println("La cantidad de ceros es " + numeroCeros);
    }
    public static void ejercicio9() {
        int sueldosMayores = 0, sumatorioSueldos = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("introduce el sueldo");
            int sueldo = scanner.nextInt();
            if (sueldo > 1000) {
                sueldosMayores++;
            }
            sumatorioSueldos += sueldo;
        }
        System.out.println("");
    }

    public static void ejercicio10() {
        int numeroSS = 0, numeroAP = 0, numeroCD = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println("Introduce una nota");
            int nota = scanner.nextInt();
            if (nota >= 0 && nota <= 10){
                if (nota>4){
                    numeroAP++;
                } else if (nota < 4) {
                    numeroSS++;
                } else {
                    numeroCD++;
                }
            } else {
                System.out.println("Nota invalidada");
            }
        }

        System.out.println("El numero de AP es " + numeroAP);
        System.out.println("El numero de SS es " + numeroSS);
        System.out.println("El numero de CD es " + numeroCD);
    }

    public static void ejercicio11() {
        System.out.println("Dime el lado del cuadrado");
        int lado = scanner.nextInt();
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i==0 || i==lado-1){
                    System.out.print("\t+\t");
                } else if (j == 0 || j == lado-1) {
                    System.out.print("\t+\t");
                } else {
                    System.out.print("\t \t");
                }
            }
            System.out.println();
        }
    }
    public static void ejercicioP() {
        System.out.println("Escribe una palabra");
        String p1 = scanner.nextLine();

        System.out.println("Escribe la palabra con la que la quieres comparar");
        String p2 = scanner.nextLine();

        p2 = p2.replaceAll(" ", "");

        for (int i = 0; i < p1.length() ; i++) {
            boolean comparacion = p1.charAt(i) == p2.charAt(i);
            System.out.println("La letra en la posicion " + i + " es " + comparacion);
        }
    }
    public static void ejercicio13() {
        System.out.println("Introduce una palabra");
        String p = scanner.nextLine();

        for (int i = p.length()-1; i >= 0 ; i--) {
            System.out.print(p.charAt(i));
        }
    }
    public static void ejercicio14() {
        System.out.println("Introduce una palabra palindromo");
        String p = scanner.nextLine();
        p = p.toLowerCase().replaceAll("á","a").replaceAll("é","e").replaceAll("í","i")
                .replaceAll("ó","o").replaceAll("ú","u");

        String pp = "";

        for (int i = p.length()-1; i >= 0 ; i--) {
            pp += p.charAt(i);
        }
        boolean comp = p.equals(pp);
        System.out.println(comp);

    }
}



