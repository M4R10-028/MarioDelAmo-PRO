import model.Persona;

import java.util.Scanner;

public class EntradaE2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escribe el nombre de la persona que quieres guardar");
        String nombre = sc.next();
        System.out.println("Escribe el apellido de la persona que quieres guardar");
        String apellido = sc.next();
        System.out.println("Escribe el dni de la persona que quieres guardar");
        String dni = sc.next();
        System.out.println("Escribe la edad de la persona que quieres guardar");
        int edad = sc.nextInt();
        System.out.println("Escribe el peso de la persona que quieres guardar");
        double peso = sc.nextDouble();
        System.out.println("Escribe la altura de la persona que quieres guardar");
        double altura = sc.nextDouble();

        Persona persona1 = new Persona(nombre, apellido, dni, edad, peso, altura);
        Persona persona2 = new Persona("Diego", "Aranda");
        Persona persona3 = new Persona();

        persona1.mostrarDatos();
        persona2.mostrarDatos();
        persona3.mostrarDatos();

        persona1.setEdad(20);
        persona2.setEdad(20);
        persona3.setEdad(20);

        persona1.calcularIMC();
        persona1.estadoFisico();
    }
}
