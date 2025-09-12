import java.util.Scanner;

public class Pruebas {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //ejercicio9();
    }
    public static void ejercicio9(){
        System.out.println("Cuanto quieres que ocupe el array");
        int longitud = scanner.nextInt();

        int[] numeros = new int[longitud];
        int numeroGrande = Integer.MIN_VALUE;
        int numeroPeque = Integer.MAX_VALUE;

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
}
