import java.lang.reflect.Array;
import java.util.Scanner;

public class Burbuja {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int cantidadNumeros;
        System.out.println("Cantidad de numeros que quieres ordenar");
        cantidadNumeros = scanner.nextInt();

        int guardado;
        int[] numeros = new int[cantidadNumeros];
        boolean ordenados = false;

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Introduce los numeros que quieres ordenar");
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < cantidadNumeros; i++) {
            for (int j = 0; j < cantidadNumeros; j++) {
                if (numeros[i] <= numeros[j]){
                    guardado = numeros[j];
                    numeros[j] = numeros[i];
                    numeros[i] = guardado;
                }
            }
        }
        for (int item : numeros) {
            System.out.print( item + " - ");
        }
    }
}
