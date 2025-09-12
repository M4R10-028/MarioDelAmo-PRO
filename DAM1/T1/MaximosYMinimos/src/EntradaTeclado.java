import java.util.Scanner;

public class EntradaTeclado {

    static Scanner lectorTeclado = new Scanner(System.in);
    public static void main(String[] args) {
        String nombre; // al no estar definido su valor, automaticamnete su valor pasa a ser nulo o null.
        System.out.println("Por favor introduce tu nombre");
        // el usuario introduzca el nombre por el teclado
        nombre = lectorTeclado.next();
        // Mi nombre es XXX(Borja) tengo XXX(40) mido XXX(1.73) y tengo experiencia trabajando en XXX(true)

        float altura;
        System.out.println("Introduce ahora tu altura por favor");
        altura = lectorTeclado.nextFloat();

        int edad;
        System.out.println("Perfecto, introduce tu edad");
        edad = lectorTeclado.nextInt();

        boolean exp;
        System.out.println("Ya la última pregunta, ¿tienes experiencia trabajando?");
        exp = lectorTeclado.nextBoolean();

        System.out.printf("Entonces te llamas %s, tienes %d años, mides %.2f y %b.\n", nombre, edad, altura, exp);

    }
}
