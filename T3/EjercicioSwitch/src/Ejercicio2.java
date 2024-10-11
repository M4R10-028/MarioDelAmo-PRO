import java.util.Scanner;

public class Ejercicio2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Escribe una letra(En mayuscula)");
        char letra = scanner.next().charAt(0);

        switch (letra){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("Es una consonante");
        }
    }
}
