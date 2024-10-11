import java.util.Scanner;

public class Ejercicio10 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese el código del producto que desee comprar");
        char c = scanner.next().charAt(0);

        switch (c){
            case '0':
                System.out.println("Play5: 500€");
                break;
            case '1':
                System.out.println("Iphone15: 800€");
                break;
            case '2':
                System.out.println("Xaiomi: 350€");
                break;
            case '3':
                System.out.println("Ordenador: 1250€");
                break;
            case '4':
                System.out.println("MP: 2€");
                break;
            default:
                System.out.println("No quedan de esos productos");
        }
    }
}
