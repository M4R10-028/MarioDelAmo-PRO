import java.lang.reflect.Array;
import java.util.Scanner;

public class Ejercicio1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String nom;
        double precio;
        double min;
        int lon;
        double guardado;
        String guardar;

        System.out.println("Dime cuantos productos quieres guardar");
        lon = scanner.nextInt();

        Object [][] lista = new Object[lon][2];

        for (int i = 0; i < lon; i++) {
            System.out.println("Dime el nombre del producto que quieres guardar");
            nom = scanner.next();
            lista[i][0] = nom;

            System.out.println("Dime el precio del producto mencionado");
            precio = scanner.nextDouble();
            lista[i][1] = precio;
        }
        for (int i = 0; i < lon; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(lista[i][j] + " - ");
            }
        }
        System.out.println();
        System.out.println("Dime un precio minimo para mostrar los productos");
        min = scanner.nextDouble();

        for (int i = 0; i < lon; i++) {
            if ((double)lista[i][1] > min){
                System.out.println(lista[i][0] + " - " + lista[i][1]);
            }
        }
        System.out.println();
        System.out.println("Productos ordenados por precio:");
        for (int i = 0; i < lon; i++) {
            for (int j = 0; j < lon-1; j++) {
                if ((double)lista[j][1] > (double)lista[j + 1][1]){
                    guardar = (String)lista[j + 1][0];
                    guardado = (double)lista[j + 1][1];

                    lista[j + 1][0] = lista[j][0];
                    lista[j + 1][1] = lista[j][1];

                    lista[j][0] = guardar;
                    lista[j][1] = guardado;
                }
            }
        }
        for (int i = 0; i < lon; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(lista[i][j] + " - ");
            }
            System.out.println();
        }

    }
}
