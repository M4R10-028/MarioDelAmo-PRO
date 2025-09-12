import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("Dime la medida de la base de tu triangulo");
        int base = lectorTeclado.nextInt();

        System.out.println("Dime la altura de tu triangulo");
        int alt = lectorTeclado.nextInt();

        int areat = (base * alt)/2;

        System.out.println("Dame la medida del primer lado");
        int lado1 = lectorTeclado.nextInt();
        System.out.println("Dame la medida del segundo lado");
        int lado2 = lectorTeclado.nextInt();
        System.out.println("Dame la medida del tercer lado");
        int lado3 = lectorTeclado.nextInt();

        boolean isosceles = ((lado1 == lado2) && (lado1 != lado3) && (lado2 != lado3)) || ((lado1 != lado2) && (lado1 == lado3) && (lado2 != lado3))
                || ((lado1 != lado3) && (lado1 != lado2) && (lado2 == lado3));
        boolean equilatero = (lado1 == lado2 && lado1 == lado3 && lado2 == lado3);

        System.out.println("Dame el radio de tu circunferencia");
        int radio = lectorTeclado.nextInt();

        float areac = (float) (Math.PI * Math.pow(radio, 2));

        System.out.printf("El area del triangulos on base %d y altura %d es de %d\n" +
                "El triangulo es equilatero: %b\n" +
                "El triangulo es isosceles: %b\n" +
                "El area de la circunferencia de radio %d es de %.3f", base, alt, areat, equilatero, isosceles, radio, areac);


    }
}
