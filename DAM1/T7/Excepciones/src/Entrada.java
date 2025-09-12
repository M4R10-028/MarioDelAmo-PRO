import utils.TelefonoException;

import java.io.IOException;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        try{
            operaciones.divisionEntre0(8);

        } catch (ArithmeticException e) {
            System.out.println("Error en la ejecucion del metodo");
        }
*/
        /*String [] cosas = new String[]{"Dato1", "Dato2", "Dato3"};
        int numero1 = 2;
        int numero2 = 0;
        String nombre;

        System.out.println("A que posicion quieres acceder");
        int posicion = sc.nextInt();

        try {
            System.out.println(cosas[posicion]);
            int resultado = numero1/numero2;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El size es mas pequeño que la posicion indicada");
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
        } finally {
            System.out.println("Terminando el programa");
        }

        //System.out.println("El numero de letras de tu nombre es " + nombre.length());
*/
        Operaciones operaciones = new Operaciones();
        try{
            operaciones.crearFichero("/cosa/raiz/dato/ejemplo.txt");
            operaciones.lanzarExcepcion("Error", 123456789);
        } catch (IOException e) {
            System.out.println("Error en la ruta del fichero");
        } catch (TelefonoException e) {
            System.out.println(e.getMessage());
        }

    }
}
