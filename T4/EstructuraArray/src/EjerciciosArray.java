import java.util.Scanner;

public class EjerciciosArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
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
}
//Hacer del 1 - 7.