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
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
        //ejercicio11();
    }

    public static void ejercicio1() {
        int numeros[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Dime el numero que quieres guardar");
            int n = scanner.nextInt();

            numeros[i] = n;
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("El numero en la posición %d es %d\n",i + 1,numeros[i]);
        }
    }
    public static void ejercicio2() {

        int numeros[] = new int[30];
        int sumatorio = 0;
        float media;

        for (int i = 0; i < 30; i++) {
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
        int cuadrado[] = new int[numero.length];
        int cubo[] = new int[numero.length];

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
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un numero entero");
            numeros[i] = scanner.nextInt();

        }

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0){
                System.out.println(numeros[i] + "Par");
            } else {
                System.out.println(numeros[i] + "Impar");
            }
        }

    }
    public static void ejercicio6() {
        int[] numeros = new int[20];
        int modificaciones = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 31);

            for (int item : numeros ) {

            }

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
        for (int item : numeros ) {
            System.out.println(item);
        }
        System.out.printf("Han habido %d modificaciones", modificaciones);
    }
    public static void ejercicio7() {
        String[] palabra = new String[10];
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
                pn = palabramenor.length();
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
                System.out.println(palabra[(int)(Math.random() * 10)]);
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
    public static void ejercicio8(){
        int[] numeros = new int[5];
        int sumatorio = 0;
        int sumatorioM = 0;
        float media;
        float mediaM;

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce numeros enteros");
        }
        for (int i = 0; i < numeros.length; i++) {
            sumatorio += numeros[i];

            numeros[i] *= 2;

            sumatorioM += numeros[i];
        }
        mediaM = (float) sumatorioM / 2;
        media = (float) sumatorio / 2;

        System.out.println("La suma de los numeros sin multiplicar es " + sumatorio);
        System.out.println("La suma de los numeros multiplicados es " + sumatorio);
        System.out.println("La suma de los numeros sin multiplicar es " + media);
        System.out.println("La suma de los numeros multiplicados es " + mediaM);
    }
    public static void ejercicio9(){
        System.out.println("Cuanto quieres que ocupe el array");
        int longitud = scanner.nextInt();

        int[] numeros = new int[longitud];
        int numeroGrande = -1000000000;
        int numeroPeque = 1000000000;

        for (int i = 0; i < longitud; i++) {
            System.out.println("Introduce los numeros enteros que quieres guardar en tu array");
            numeros[i] = scanner.nextInt();

            if (numeros[i] > numeroGrande) {
                numeroGrande = numeros[i];
            }
            if (numeros[i] < numeroPeque) {
                numeroPeque = numeros[i];
            }
        }
        System.out.println("El numero mas grande es " + numeroGrande);
        System.out.println("El numero mas pequeño es " + numeroPeque);
    }
    public static void ejercicio10() {
        System.out.println("Ingresa la longitud del primer array");
        int lon = scanner.nextInt();

        int[] numeros1 = new int[lon];
        int[] numeros2 = new int[lon];
        int[] numeros3 = new int[lon];

        for (int i = 0; i < lon; i++) {
            System.out.println("Ingresa los numeros del primer array");
            numeros1[i] = scanner.nextInt();
        }
        for (int i = 0; i < lon; i++) {
            System.out.println("Inrgesa los numeros del segundo array");
            numeros2[i] = scanner.nextInt();
        }
        for (int i = 0; i < lon; i++) {
            numeros3[i] = numeros1[i] + numeros2[i];
        }
        System.out.println("Numeros primer array: ");
        for ( int uno : numeros1 ) {
            System.out.print(uno + " ");
        }
        System.out.println("\nNumeros segundo array : ");
        for ( int dos : numeros2 ) {
            System.out.print(dos + " ");
        }
        System.out.println("\nNumeros tercer array : ");
        for (int tres : numeros3) {
            System.out.print(tres + " ");
        }
    }
    public static void ejercicio11(){
        System.out.println("Ingresa la longitud del array");
        int lon = scanner.nextInt();

        int[] numeros = new int[lon];

        for (int i = 0; i < lon; i++) {
            System.out.println("Ingresa todos los valores del array");
            numeros[i] = scanner.nextInt();

        }
        int numerolong;
        numerolong = numeros[0];
        for (int i = 1; i < lon; i++) {
            numeros[i-1] = numeros[i];
        }
        numeros[lon-1] = numerolong;

        for (int item:numeros) {
            System.out.print(item + " ");
        }

        int numero1;
        numero1 = numeros[lon-1];
        for (int i = lon-1; i > 0 ; i--) {
            numeros[i] = numeros[i-1];
        }
        numeros[0] = numero1;

        numero1 = numeros[lon-1];
        for (int i = lon-1; i > 0 ; i--) {
            numeros[i] = numeros[i-1];
        }
        numeros[0] = numero1;

        System.out.println(" ");

        for (int item:numeros) {
            System.out.print(item + " ");
        }
    }

}
//Hacer del 1 - 7.