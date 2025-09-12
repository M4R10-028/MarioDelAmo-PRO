import utils.LongitudDNINoValidaException;

import java.util.Scanner;

public class Entrada {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Formulario formulario = new Formulario();
        int opcion;
        do {
            System.out.println("1. Rellenar nombre");
            System.out.println("2. Rellenar apellido");
            System.out.println("3. Rellenar DNI");
            System.out.println("4. Finalizar");
            System.out.println("Que quieres realizar");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Introduce tu nombre");
                    try {
                        formulario.setNombre(sc.next());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Introduce tu apellido");
                    try {
                        formulario.setApellido(sc.next());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Introduce tu DNI");
                    try {
                        formulario.setDni(sc.next());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try{
                        formulario.mostrarDatos();
                    } catch (NullPointerException e) {
                        System.out.println("No hay datos en los elementos");
                    }
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida");
                    break;
            }
        }while (opcion != 4);
    }
}
