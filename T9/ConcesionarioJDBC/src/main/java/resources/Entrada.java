package resources;

import controller.ConcesionarioController;
import database.DBConnection;
import model.Coches;

import java.util.Scanner;

public class Entrada {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ConcesionarioController cc = new ConcesionarioController();
        int opcion;
        int id;
        do {
            System.out.println("Elige que opcion ejecutar");
            System.out.println("1. Añadir nuevo coche");
            System.out.println("2. Borrar coche por Id");
            System.out.println("3. Consultar coche por Id");
            System.out.println("4. Listar coches");
            System.out.println("5. Exportar datos al csv");
            System.out.println("6. Salir");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Dime la marca del coche que quieres guardar");
                    String marca = sc.next();
                    System.out.println("Dime el modelo del coche que quieres guardar");
                    String modelo = sc.next();
                    System.out.println("Dime la matricula del coche que quieres guardar");
                    String matricula = sc.next();
                    System.out.println("Dime el color del coche que quieres guardar");
                    String color = sc.next();
                    System.out.println("Dime el precio del coche que quieres guardar");
                    int precio = sc.nextInt();
                    System.out.println("Dime las plazas del coche que quieres guardar");
                    int plazas = sc.nextInt();
                    cc.agregarCoche(new Coches(precio, plazas, marca, modelo, matricula, color));
                    break;
                case 2:
                    System.out.println("Dime la id del coche que quieres borrar");
                    id = sc.nextInt();
                    cc.borrarCoche(id);
                    break;
                case 3:
                    System.out.println("Dime la id del coche que estas buscando");
                    id = sc.nextInt();
                    cc.buscarCocheId(id);
                    break;
                case 4:
                    System.out.println("Listando coches...");
                    cc.listarCoches();
                    break;
                case 5:
                    System.out.println("Exportando datos al csv");
                    cc.exportarCochesCsv();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida");
                    break;
            }
        }while(opcion != 6);

    }
}
