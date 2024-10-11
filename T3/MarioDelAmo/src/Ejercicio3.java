import java.util.Scanner;

public class Ejercicio3 {

    static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¿Que tipo de café quieres?");
        String cafe = lectorTeclado.next();

        System.out.println("¿Cuantas cucharaditas de azucar quieres?");
        int azucar = lectorTeclado.nextInt();

        System.out.println("¿De que tamaño quieres el cafe?");
        String tamano = lectorTeclado.next();

        System.out.printf("Preparando un %s,de tamaño %s y  con %d cucharaditas de azúcar", cafe, tamano, azucar);
    }
}
