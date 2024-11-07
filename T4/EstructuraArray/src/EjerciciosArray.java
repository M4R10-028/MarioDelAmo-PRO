import java.lang.ref.SoftReference;
import java.util.Scanner;

public class EjerciciosArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
    }

    public static void ejercicio1() {
        int numeros[] = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dime el numero que quieres guardar");
            int n = scanner.nextInt();

            numeros[i] = n;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("El numero en la posición %d es %d\n",i + 1,numeros[i]);
        }
    }
    public static void ejercicio2() {

        int numeros[] = new int[30];
        int sumatorio = 0;
        float media;

        for (int i = 0; i < numeros.length ; i++) {
            numeros[i] = (int) (Math.random() * 11);
            sumatorio += numeros[i];
        }
        media = (float) sumatorio / 30;

        System.out.println("La suma de los numeros es " + sumatorio);
        System.out.println("La media de los numeros es " + media);
    }
    public static void ejercicio3() {
         int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escribe los numeros que quieres guardar");
            int n = scanner.nextInt();

            numeros[i] = n;
        }
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    public static void ejercicio4() {
        int numero[] = new int[20];
        int cuadrado[] = new int[20];
        int cubo[] = new int[20];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random()*101);
        }
        for (int i = 0; i < numero.length; i++) {
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = numero[i] * cuadrado[i];
        }
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Numero: " + numero[i]);
            System.out.println("Cuadrado: " + cuadrado[i]);
            System.out.println("Cubo: " + cubo[i]);
        }
    }
    public static void ejercicio5() {
        int numeros[] = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("Introduce un numero entero");
            numeros[i] = scanner.nextInt();

        }

        for (int i = 0; i < 8; i++) {

            if (numeros[i] % 2 == 0){
                System.out.println(numeros[i] + "Par");
            } else {
                System.out.println(numeros[i] + "Impar");
            }
        }

    }
    public static void ejercicio6() {
        int numeros[] = new int[20];
        int modificaciones = 0;

        for (int i = 0; i < 20; i++) {
            numeros[i] = (int) (Math.random() * 31);

            if (numeros[i] == 6){
                numeros[i] = 8;
                modificaciones++;
                
            } else if (numeros[i] == 7) {
                numeros[i] = 15;
                modificaciones++;
                
            } else if (numeros[i] == 20) {
                numeros[i] = 10;               
                modificaciones++;
                
            }
        }
        System.out.printf("Han habido %d modificaciones", modificaciones);
    }
    public static void ejercicio7() {
        String palabra[] = new String[10];
        int opcion;
        int azar=0;
        int nl=0;
        int ml=0;
        int pm=0;
        int pn=100;
        String palabramayor = "";
        String palabramenor = "";

        for (int i = 0; i < 10; i++) {
            System.out.println("Escribe una palabra");
            palabra[i] = scanner.next();

            if (palabra[i].length() > pm) {
                palabramayor = palabra[i];
            }
            if (palabra[i].length() < pn) {
                palabramenor = palabra[i];
            }

            nl += palabra[i].length();
        }
        ml = nl / 10;

        System.out.println("1. Ver todas las palabras");
        System.out.println("2. Mostrar una palabra al azar");
        System.out.println("3. Numero de letras totales");
        System.out.println("4. Media de letras de las palabras ingresadas");
        System.out.println("5. Palabras más larga");
        System.out.println("6. Palabra más corta");
        System.out.println("Elige una opción");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                for (int i = 0; i < 10; i++) {
                    System.out.println(palabra[i]);
                }
                break;
            case 2:
                System.out.println(palabra[(int)(Math.random() * 11)]);
                break;
            case 3:
                System.out.println("El numero de letras totales es " + nl);
                break;
            case 4:
                System.out.println("La media de letras de las palabras ingresadas es de " + ml);
                break;
            case 5:
                System.out.println("La palabra más larga es " + palabramayor);
                break;
            case 6:
                System.out.println("La palabra más corta es " + palabramenor);
                break;
            default:
                System.out.println("Esa no es una opción");
                break;
        }

    }
}
//Hacer del 1 - 7.