import controller.Constructora;
import model.Terreno;
import utils.Orientacion;

import java.util.Scanner;

import static utils.Orientacion.*;

public class Entrada {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        Orientacion orientacion;
        Constructora constructora = new Constructora();
        do {
            System.out.println("1. Crear un terreno");
            System.out.println("2. Crear una casa");
            System.out.println("3. Mostrar datos de la casa");
            System.out.println("4. Crear una habitacion");
            System.out.println("5. Crear una piscina");
            System.out.println("6. Crear un Anexo");
            System.out.println("7. Revalorizar terreno");
            System.out.println("8. Salir");
            System.out.println("----------------------------------------");
            System.out.println("Que opcion quieres realizar");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    constructora.crearTerreno();
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Esa no es una opcion válida");
                    break;
            }
        }while(opcion != 7);
    }
}
