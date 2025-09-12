import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ejercicio8 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese el caracter de la operación que quiere realizar");
        char c = scanner.next().charAt(0);

        System.out.println("Ingrese el primer numero de su operación");
        float n1 = scanner.nextFloat();
        System.out.println("Ingrese el segundo numero de su operación ");
        float n2 = scanner.nextFloat();

        switch (c){
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("No se peude realizar esa operación");
        }
    }
}
