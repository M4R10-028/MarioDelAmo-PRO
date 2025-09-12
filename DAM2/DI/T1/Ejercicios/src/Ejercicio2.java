import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        boolean multiplo, entre;
        System.out.println("Dime el numero que quieres comprobar");
        n1 = sc.nextInt();

        if (n1 % 20 == 0){
            multiplo = true;
        } else {
            multiplo = false;
        }

        if (n1 > -100 && n1 < 100){
            entre = true;
        } else {
            entre = false;
        }

        if (multiplo && entre){
            System.out.println("El numero es multiplo de 20 y esta entre 100 y -100");
        }
    }
}
