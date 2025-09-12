import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Dime un mes del año");
        String mes = scanner.next();

        switch (mes.toLowerCase()){
            case "febrero":
                System.out.println("Este mes tiene 28 días");
                break;
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                System.out.println("Este mes tiene 31 días");
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                System.out.println("Este mes tiene 30 días");
                break;
            default:
                System.out.println("Esto no es un mes");
        }

        System.out.println("Introduce un numero del 1 al 12 como si fueran los meses del año");
        int numero = scanner.nextInt();

        switch(numero){
            case 1,3,5,7,8,10,12:
                System.out.println("Este mes tiene 31 días");
                break;
            case 4,6,9,11:
                System.out.println("Este mes tiene 30 días");
                break;
            case 2:
                System.out.println("este mes tiene 28 días");
                break;
            default:
                System.out.println("Este no es un mes del año");

        }
    }

}
