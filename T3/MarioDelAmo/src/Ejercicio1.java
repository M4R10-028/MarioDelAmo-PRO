import java.util.Scanner;

public class Ejercicio1 {
    static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Dime cual es tu nombre");
        String nombre = lectorTeclado.next();

        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Dime cuales son tus apellidos");
        String apellidos = lectorTeclado.nextLine();

        System.out.println("Cuanto dinero tienes para hacer la compra");
        double dinero = lectorTeclado.nextDouble();

        System.out.println("Dime cual es el precio de la play 5 sin IVA");
        double ps5 = lectorTeclado.nextDouble();

        System.out.println("Dime cual es el precio del iphone 15 sin IVA");
        double iphone = lectorTeclado.nextDouble();

        System.out.println("Dime cuanto es el IVA");
        int iva = lectorTeclado.nextInt();

        double ps5iva = ((double) iva / 100) * ps5;
        double iphoneiva = ((double) iva / 100) * iphone;

        double preciops5 = ps5 + ps5iva;
        double precioiphone = iphone + iphoneiva;
        double preciototal = precioiphone + preciops5;

        boolean play = dinero >= preciops5;
        boolean iphone15 = dinero >= precioiphone;
        boolean todo = dinero >= preciototal;

        System.out.printf("%s con %.2f€ puedes:\n" +
                "Comprar la ps5: %b \n" +
                "Comprar el iphone15: %b \n" +
                "Puedes comprar las dos cosas: %b", nombre, dinero, play, iphone15, todo);


    }
}
