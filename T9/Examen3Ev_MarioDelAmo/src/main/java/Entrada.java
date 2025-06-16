import database.DBConnector;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Entrada {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        DBConnector dbConnector = null;
        dbConnector.getConexion();
        int opcion;
        do {
            System.out.println("Elige la opcion que quieres realizar");
            System.out.println("1. Mostrar profesores base de datos");
            System.out.println("2. ");
            opcion = scanner.nextInt();
        } while (opcion != 6);

    }
}
