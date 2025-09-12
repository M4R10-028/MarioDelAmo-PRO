import java.util.Scanner;

public class Ejercicio9 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escribe el numero correspodiente al mes del año");
        int n = scanner.nextInt();

        switch (n){
            case 12,1,2,3:
                System.out.println("Invierno");
                break;
            case 4,5:
                System.out.println("Primavera");
                break;
            case 6,7,8:
                System.out.println("Verano");
                break;
            case 9,10,11:
                System.out.println("Otoño");
                break;
            default:
                System.out.println("No hay un mes " + n);
        }
    }
}
