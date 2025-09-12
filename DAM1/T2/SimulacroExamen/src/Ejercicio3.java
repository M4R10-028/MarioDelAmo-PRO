import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Escribe el precio completo");
        int pago = lectorTeclado.nextInt();

        System.out.println("Escribe en cuantos meses quieres pagarlo");
        int meses = lectorTeclado.nextInt();

        float pagomes = (float)pago / meses;

        System.out.printf("Vas a pagar el coche de %d€ en %d meses, con un total de %.2f€ cada plazo (sin\n" +
                "tener en cuenta los intereses", pago, meses,pagomes);

    }
}
