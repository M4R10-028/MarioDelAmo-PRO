import java.util.Scanner;

public class Ejercicio5 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Añadir\n2. Listar\n 3. Buscar\n4. Modificar\n5. Salir");
        System.out.println("Ingresa el numero de la opción del 1 al 4 que quieras iniciar");
        int n = scanner.nextInt();

        switch (n){
            case 1:
                System.out.println("Opción 1 seleccionada");
                break;
            case 2:
                System.out.println("Opción 2 seleccionada");
                break;
            case 3:
                System.out.println("Opción 3 seleccionada");
                break;
            case 4:
                System.out.println("Opción 4 seleccionada");
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Esa no es una opción");
        }
    }
}
