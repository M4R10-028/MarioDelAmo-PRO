import java.util.Scanner;

public class EjerciciosMultidimensionales {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //ejercicio();
        //ejercicio001();
        ejercicio002();
    }
    public static void ejercicio(){
        //definir un array con filas 5 y columnas aleatorias entre 2-6
        //rellenar el array entero con aleatorios
        int[][] numeros = new int[5][(int)(Math.random() * 5) + 2];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int) (Math.random() * 101);
            }
        }
        /*for ( int[] item : numeros) {
            for (int element : item) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }*/

        imprimirArray(numeros);
        /*
        1,3,4,6
        2,3,5,7
        6,7,6,7
        4,1,2,3

        Hay que quitarle uno a cada posicion y volver a imprimirlo

        0,2,3,5
        1,2,4,6
        5,6,5,6
        3,0,1,2
         */
    }
    public static void imprimirArray(int[][] array) {
        for ( int[] item: array) {
            for ( int element : item ) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
    public static void ejercicio001(){
        int[][] numeros = new int[(int)(Math.random()*5) + 2][(int)(Math.random()*5) + 2];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int) (Math.random()*100 + 1);
            }
        }
        System.out.println("Array normal:");
        imprimirArray(numeros);
        System.out.println();
        System.out.println("Array modificado:");

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = numeros[i][j] - 1;
            }
        }

        imprimirArray(numeros);
    }
    public static void modificarArray(int[][] array, int resta){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] -= resta;
            }
        }
    }
    public static void ejercicio002(){
        int[][] numeros = new int[(int)(Math.random() * 5) + 2][(int)(Math.random() * 5) + 2];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int)(Math.random() * 100) + 1;
            }
        }
        System.out.println("Array Normal:");
        imprimirArray(numeros);
        System.out.println();
        for (int i = 0; i < 8; i++) {
            System.out.println("Cuanto quieres modificar el array");
            int resta = scanner.nextInt();

            modificarArray(numeros,resta);
            System.out.println("Array modificado por " + resta + ":");
            imprimirArray(numeros);
            System.out.println();
        }
    }
}
