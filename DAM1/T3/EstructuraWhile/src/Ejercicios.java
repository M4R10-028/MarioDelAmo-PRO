import com.sun.jdi.request.InvalidRequestStateException;

import java.util.Scanner;

public class Ejercicios {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //ejerciciowhile();
        //ejerciciodowhile();
        //ejerciciop();
        //ejercicio1();
        //ejercicio3();
        //ejercicio5();
        //ejercicio6();
        ejercicio2();

    }

    public static void ejerciciowhile() {
        System.out.println("Introduce un numero");
        int n = scanner.nextInt();
        int i = 1;

        while (n != 0) {
            i++;
            System.out.println("Introduce un numero");
            n = scanner.nextInt();
        }
        System.out.println("Perfecto!");
        System.out.println("Has usado " + i + " intentos.");
    }
    public static void ejerciciodowhile () {
        int numero;
        int i = 0;
        do {
            System.out.println("Introduce un numero");
            numero = scanner.nextInt();
            i++;
        }while (numero!=0);
        System.out.println("Perfecto!");
        System.out.println("El numero de intentos es "+ i);
    }
    public static void ejerciciop() {
        int o;
        do {
            System.out.println("1. Opción añadir\n" +
                    "2. Opción borrar\n" +
                    "3. Opción listar\n" +
                    "4. Opción buscar\n" +
                    "5. Salir");
            System.out.println("¿Que quieres hacer?");
            o = scanner.nextInt();
            switch (o) {
                case 1:
                    System.out.println("Ejecutando Opción Añadir");
                    break;
                case 2:
                    System.out.println("Ejecutando Opción Borrar");
                    break;
                case 3:
                    System.out.println("Ejecutando Opción Listar");
                    break;
                case 4:
                    System.out.println("Ejecutando Opción Buscar");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Esa no esta entre las opciones");
            }
        } while (o != 5);
        System.out.println("Terminando programa");
    }
    public static void ejercicio1() {
        int numero;
        int suma = 0;
        int numerosItroducidos = 0;

        do {
            System.out.println("Introduce un numero");
            numero = scanner.nextInt();

            if (numero > 0) {
                suma += numero;
                numerosItroducidos++;
            }

        }while (numero != 0);
        System.out.println("La suma de los numeros positivos es " + suma);
        System.out.println("Los intentos introducidos son " + numerosItroducidos);
    }
    public static void ejercicio3() {
        int numeroal;
        int maximo = -1;
        int minimo = 101;
        do {
            numeroal = (int) (Math.random()*101);
            System.out.println(numeroal);
            if (numeroal<maximo){
                maximo=numeroal;
            }
            if (numeroal>minimo) {
                minimo = numeroal;
            }
        }while (numeroal != 0);
        System.out.println("El numero mas grande que ha salido es el " + maximo);
        System.out.println("El numero mas pequeño que ha salido es el " + minimo);
    }
    public static void ejercicio5() {
        int aleatorio = (int)(Math.random()*20);
        int numero;
        int intento = 0;
        int numeroIntento = 5;
        do {
            System.out.println("Introduce el intento");
            numero = scanner.nextInt();

            intento++;
            numeroIntento--;

            if (numero != aleatorio) {
                System.out.println("Enahorabuena, has acertado en " + intento + " intentos.");
            } else {
                System.out.println("Lo siento, intetalo de nuevo");
            }
        }while (numero != aleatorio && numeroIntento>0);
        System.out.println("Enahorabuena, has acertado en " + intento + " intentos.");
    }
    public static void ejercicio6() {
        String repetir;
        do {
            int aleatorio = (int)(Math.random()*20);
            int numero;
            int intento = 0;
            int numeroIntento = 10;
            int record = 11;
            do {
                System.out.println("Introduce el intento");
                numero = scanner.nextInt();

                intento++;
                numeroIntento--;

                if (numero == aleatorio) {
                    System.out.println("Enahorabuena, has acertado en " + intento + " intentos.");
                } else {
                    System.out.println("Lo siento, intetalo de nuevo");
                }
            }while (numero != aleatorio && numeroIntento>0);
            System.out.println("Enahorabuena, has acertado en " + intento + " intentos.");

            System.out.println("Quieres volver a jugar?(S/N)");
            repetir = scanner.next();
        } while ( repetir.equalsIgnoreCase("s") );
    }
    public static void ejercicio2() {
        System.out.println("Introduce el primer numero(1-100)");
        int n1 = scanner.nextInt();

        System.out.println("Introduce el segundo numero(1-100)");
        int n2 = scanner.nextInt();

        int x = 1;
        int y = 1;

        int mcm = 0;

        do {
            if ((n1 * x) < (n2 * y)) {
                x++;
            } else if ((n1 * x) > (n2 * y)){
                y++;
            } else {
                mcm = n1 * x;
            }
        } while (n1*x != n2*y);
        System.out.println("El minimo comun multiplo es " + n1 * x);
    }
}
