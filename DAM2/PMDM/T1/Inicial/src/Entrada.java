import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Primer programa de repaso");
        // variables -> guardar valor que sera utilizado varias veces
        final String DNI = "12341234A";
        String nombre = "Mario";
        String correo; //null
        int edad = 19;
        // Array -> lista no dinamica -> final
        // ArrayList / HashTable -> lista dinamica -> final ç

        System.out.printf("Mi nombre es %s y tengo %d años%n"
                , nombre, edad);

        switch (edad) {
            case 10:

                break;
            case 12:

                break;
            case 18:break;
            case 19:break;
        }
    }
}
