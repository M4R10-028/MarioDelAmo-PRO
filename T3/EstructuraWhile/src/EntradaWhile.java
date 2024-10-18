import java.util.Scanner;

public class EntradaWhile {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int i = 10;
        while (i > 0) {
            System.out.println("El valor de i es " + i);
            i--;
        }
    }

}
