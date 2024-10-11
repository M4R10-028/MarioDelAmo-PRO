import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Ejercicios {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("De que número quieres ver la tabla de multiplicar");
        int n = scanner.nextInt();

        for (int i=0; i<11; i++){
            int r = n * i;
            System.out.println(n + " * " + i + " = " + r);
        }
    }
}
