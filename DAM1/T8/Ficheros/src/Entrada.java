import java.util.Scanner;

public class Entrada {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        OperacionesFicheros operacionesFicheros = new OperacionesFicheros();
        //operacionesFicheros.crearFichero("src/recursos/lectura/ejemplo.txt");
        //operacionesFicheros.lecturaUnitaria("src/recursos/lectura/ejemplo.txt");
        //operacionesFicheros.lecturaCompleta("src/recursos/lectura/ejemplo.txt");
        //operacionesFicheros.lecturaCodigoCompleta("src/recursos/lectura/ejemplo_lectura_codigo.txt");
        //operacionesFicheros.escribirFichero("src/recursos/escritura/completa/ejemplo_esccritura.txt");
        System.out.println("Dime tu nombre");
        String nombre = sc.next();
        System.out.println("Dime tu apellido");
        String apellido = sc.next();
        System.out.println("Dime tu edad");
        int edad = sc.nextInt();
        System.out.println("Escribe el mensaje que quieras transmitir");
        Scanner scanner = new Scanner(System.in);
        String mensaje = scanner.nextLine();
        operacionesFicheros.escribirDatos("src/recursos/escritura/completa/datos.txt",nombre,apellido,edad,mensaje);
    }
}
