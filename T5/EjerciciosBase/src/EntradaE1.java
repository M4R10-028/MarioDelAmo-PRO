import model.Persona;

import java.util.Scanner;

public class EntradaE1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Persona persona = new Persona("Alex", "Cano", "12345678A", 18, 67.3, 1.76);

        persona.mostrarDatos();

        System.out.println("Dime cuantos años quieres incrementarle la edad");
        int numero = sc.nextInt();

        persona.incrementarEdad(numero);

        System.out.println(persona.calcularIMC());
        persona.mostrarDatos();
    }
}
