import java.util.Scanner;

public class Ejercicios {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //ejerciciowhile();
        //ejerciciodowhile();
        ejerciciop();
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
}
