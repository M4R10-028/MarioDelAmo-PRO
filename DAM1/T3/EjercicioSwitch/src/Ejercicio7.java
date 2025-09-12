import java.util.Scanner;

public class Ejercicio7 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese su nota del 1 al 5");
        int nota = scanner.nextInt();

        switch (nota){
            case 1,2:
                System.out.println("Suspenso");
                break;
            case 3:
                System.out.println("Aprobado");
                break;
            case 4:
                System.out.println("Notable");
                break;
            case 5:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Esta no es una nota valida");
        }
    }
}
