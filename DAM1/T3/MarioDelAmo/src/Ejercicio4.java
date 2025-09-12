import java.util.Scanner;

public class Ejercicio4 {

    static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Dime cual es tu nombre");
        String nombre = lectorTeclado.next();

        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Dime tus apellidos");
        String apellidos = lectorTeclado.nextLine();

        System.out.println("¿Cual es el salario que esperas recibir?");
        int salario = lectorTeclado.nextInt();

        System.out.println("¿Cuantos años tienes?");
        int edad = lectorTeclado.nextInt();

        System.out.println("¿Que número es el dia de su cumpleaños?");
        int numeroc = lectorTeclado.nextInt();

        System.out.println("¿Tienes carnet de conducir?");
        boolean carnet = lectorTeclado.nextBoolean();

        boolean validez1 = edad < 50 && salario < 40000 && carnet == true;
        //no hace falta comparar el carnet porq ya es un booleano.
        boolean validez2 = edad > 45 && salario < 20000 && numeroc % 2 == 0;

        boolean validez = validez1 == true || validez2 == true;

        System.out.printf("Con los datos introducidos, el candidato cuyo nombre completo es %s %s tiene como resolución: %b",
                nombre, apellidos, validez);
    }
}
