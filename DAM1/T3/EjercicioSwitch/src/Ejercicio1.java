import java.util.Scanner;

public class Ejercicio1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escribe el numero del dia de la semana");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Este dia es el lunes");
                break;
            case 2:
                System.out.println("Este dia es el martes");
                break;
            case 3:
                System.out.println("Este dia es el miercoles");
                break;
            case 4:
                System.out.println("Este dia es el jueves");
                break;
            case 5:
                System.out.println("Este dia es el viernes");
                break;
            case 6:
                System.out.println("Este dia es el sabado");
                break;
            case 7:
                System.out.println("Este dia es el domingo");
                break;
            default:
                System.out.println("No hay mas de 7 dias en una semana");
        }
    }
}
