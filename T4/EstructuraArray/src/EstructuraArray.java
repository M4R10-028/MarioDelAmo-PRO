import java.util.Scanner;

public class EstructuraArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*El array es un conjunto de datos no dinamicos, es decir, si en el array se dice que hay 20 datos los hay,
        no pueden ser ni más ni menos.
        int[] numeros (Si no le doy valores el valor será null)
        int[] numeros = new int[6]
        (En el de arriba el numeros.length = 6)

        int [] numeros = {7,9,20,10,40}
        (En este caso el numeros.length = 5 ya que hay 5 valores definidos)
        numeros [3] = 40 (Estas sustituyendo la posición numero 3 por 40, en este caso 10 --> 40)
        numeros [numeros.length] "Estaría mal ya que el valor del length es 6 y no hay una posición 6"
        numeros [numeros.length - 1] "Así si estaría bien definido para poder sustituir el último lugar"

        "El valor dentro del int[x] son el numero de datos que tendrá el array"

        boolean[] aciertos = new boolean[4]
        (El "por defecto" del boolean será false, asi que si no se le dan valores en cada posición valdrá "false")

        String [] palabras = new String [2]
        (En los dos valores valdrá null, ya que String es una variable compleja)

         */

        int[] numeros = new int[10];
        //0 0 0 0
        //Cuantas posiciones tienes
        System.out.println(numeros.length); //La longitud
        numeros[3] = 7;
        System.out.println(numeros[3]);//El numeros de la última posición
        // 0 0 0 7
        //Para sacar el último lugar siempre se pone:
        System.out.println(numeros[numeros.length - 1]);

        String[] palabras = {"Hola", "que", "tal", "estas"};

        //sacar todas las palabras del array

        //puedo modificar el contenido del array en un for
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] = (int) (Math.random() * 101));
        }
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
        System.out.println("-----------");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
        System.out.println("--------------------------------------");
        for (int item : numeros) {
            System.out.println(item);
        }
        System.out.println("bah");
        for (int item : numeros) {
            if (item % 2 == 0) {
                System.out.println(item);
            }
        }

        /*Array [] -> Contenedor
        * int[] -> {1,4,8,9,2,20}
        * String[] -> {"Hola", "adios, ..."}
        * boolean[] -> {true, false, true}
        *
        * Todos los elementos son de tipo object
        *
        * Object[] = boolean int String char
        *            {true,   9, "Hola", 'c'}
        * El programa los ve tanto como lo que son como objects, por ejemplo el true lo ve como boolean y como object
        *
        * 'Continuacion en entrada operaciones'*/
    }
}
