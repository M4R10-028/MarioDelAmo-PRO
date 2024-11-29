import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosExamen {
    static Scanner scanner = new Scanner(System.in);
    // PARTE FÁCIL
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        ejercicio4();
    }
    public static void ejercicio1(){
        int[] numeros = new int[15];
        int[] ordenados = new int[15];
        int n = 0;
        int aleatorio;
        boolean numero = false;

        do {
            aleatorio = (int)(Math.random() * 21);

            for (int i = 0; i < numeros.length ; i++) {
                if (numeros[i] == aleatorio){
                    numero = true;
                    break;
                }
            }
            if (numero != true) {
                numeros[n] = aleatorio;
                n++;
            }
            numero = false;
        } while (n < 15);

        System.out.println("Todos los numeros");
        for (int item : numeros) {
            System.out.print(item + " - ");
        }
        System.out.println();

        Arrays.sort(numeros);
        System.out.println("Numeros ordenados");
        for (int item : numeros) {
            System.out.print(item + " - ");
        }
        System.out.println();

        System.out.println("Los numeros en posicion par");
        for (int i = 0; i < numeros.length; i+=2) {
            System.out.print(numeros[i] + " - ");
        }
        System.out.println();

        System.out.println("Numeros pares");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0){
                System.out.print(numeros[i] + " - ");
            }
        }
    }
    public static void ejercicio2(){

        int lon;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int par = 0;
        int impar = 0;
        int comprobar;
        int veces = 0;

        System.out.println("Cuantos numeros quieres guardar");
        lon = scanner.nextInt();

        int[] numeros = new int[lon];


        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 21);

            if (numeros[i] > mayor){
                mayor = numeros[i];
            }
            if (numeros[i] < menor){
                menor = numeros[i];
            }
            if (numeros[i] % 2 == 0){
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("El numero mayor y el numero menor");
        System.out.println("El mayor es = " + mayor);
        System.out.println("El menor es = " + menor);
        System.out.println("Hay " + par + " numeros pares");
        System.out.println("Hay " + impar + " numeros impares");

        System.out.println("Que numero quieres comprobar si esta");
        comprobar = scanner.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == comprobar){
                veces++;
            }
        }
        System.out.println("Ese numero esta " + veces + " veces");
    }
    public static void ejercicio3(){
        int[] numeros = new int[20];
        int[] ordenados = new int[20];
        int opcion;
        int posicion;
        int temporal;


        do {
            System.out.println("1. Registrar posiciones");
            System.out.println("2. Ver elemento de una posicion");
            System.out.println("3. Mostrar array");
            System.out.println("4. Mostrar array ordenado de menor a mayor");
            System.out.println("5. Rotar el array hacia la izquierda");
            System.out.println("6. Salir");
            System.out.println("Que opcion quieres ejecutar");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.println("Dime el numero de la posicion " + (i + 1));
                        numeros[i] = scanner.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Que posicion quieres saber");
                    posicion = scanner.nextInt();
                    System.out.println(numeros[posicion]);
                    break;
                case 3:
                    for (int item : numeros) {
                        System.out.print(item + " - ");
                    }
                    System.out.println();
                    break;
                case 4:
                    Arrays.sort(numeros);
                    for (int i = numeros.length - 1; i >= 0; i--) {
                        System.out.print(numeros[i] + " - ");
                    }
                    System.out.println();
                    break;
                case 5:
                    temporal = numeros[0];
                    for (int i = 0; i < numeros.length - 1; i++) {
                        numeros[i] = numeros[i + 1];
                    }
                    numeros[numeros.length - 1] = temporal;

                    for (int item : numeros) {
                        System.out.print(item + " - ");
                    }
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Esa no es una opción, intentalo de nuevo");
            }
        } while (opcion != 6);
    }
    public static void ejercicio4() {
        Object[][] personas = new Object [4][10];
        int persona = 0;
        int opcion;
        int nombre = 0;
        int apellido = 1;
        int telefono = 2;
        int dni = 3;
        String busca;

        do {
            System.out.println("1. Agregar persona");
            System.out.println("2. Busca persona");
            System.out.println("3. Listar personas");
            System.out.println("4. Salir");
            System.out.println("Que opcion quieres ejecutar");
            opcion = scanner.nextInt();

            switch(opcion) {
                case 1:
                    System.out.println("Ingresa el nombre de la persona");
                    personas[nombre][persona] = scanner.next();

                    System.out.println("Ingresa el apellido de " + personas[nombre][persona]);
                    personas[apellido][persona] = scanner.next();

                    System.out.println("Ingresa el numero de telefono de " + personas[nombre][persona]);
                    personas[telefono][persona] = scanner.nextInt();

                    System.out.println("Ingresa el DNI de " + personas[nombre][persona]);
                    personas[dni][persona] = scanner.next();

                    persona++;
                    break;
                case 2:
                    if (personas != null){
                        System.out.println("Ingresa el DNI de la persona que quieres buscar");
                        busca = scanner.next();

                        for (int i = 0; i < persona; i++) {
                            if (busca.equals(personas[3][i])){
                                System.out.println(personas[nombre][i]);
                                System.out.println(personas[apellido][i]);
                                System.out.println(personas[telefono][i]);
                            }
                        }
                    } else {
                        System.out.println("Añade a una persona para poder ejecutar");
                    }
                    break;
                case 3:
                    if (personas != null){
                        for (int j = 0; j < personas.length; j++) {
                            System.out.println("Nombre: " + personas[nombre][j]);
                            System.out.println("Apellido: " + personas[apellido][j]);
                            System.out.println("Telefono: " + personas[telefono][j]);
                            System.out.println("DNI: " + personas[dni][j]);
                            System.out.println("---------------------------------------");
                        }
                    } else {
                        System.out.println("Añade a una persona para poder ejecutar");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                default:
                    System.out.println("Esa no es una opcion válida");
            }
        } while (opcion != 4);
    }

}
