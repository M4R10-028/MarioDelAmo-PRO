import java.util.Scanner;

public class Ejercicio3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escribe un numero");
        int numero = scanner.nextInt();

        int resto = numero % 2;

        switch (resto){
            case 0:
                System.out.println("Es un numero par");
                break;
            default:
                System.out.println("Es un numero impar");
        }
    }
}
