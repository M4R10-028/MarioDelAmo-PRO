import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Entrada {
    //VISTA
    /*Si la lista está vacia, al listar, mostrará un mensaje
    * Pedir desde el main los datos del coche a añadir, con la restricción:
    * - No puedo tener más de 5 coches
    * - No puede haber 2 coches con la misma matrícula*/
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Garaje garaje = new Garaje();
        System.out.println("Bienvenido a la APP de la Gestión de coches");
        int opcion;
        String marca;
        String modelo;
        int cv;
        String matricula;
        String marcaBusqueda;

        do {
            System.out.println("1. Añadir coche");
            System.out.println("2. Mostrar coches");
            System.out.println("3. Buscar por Marca");
            System.out.println("4. Salir");
            System.out.println("Que quieres realizar");
            opcion = scanner.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Dime la matricula de tu coche");
                    matricula = scanner.next();

                    if (!garaje.estaCoche(matricula)){
                        System.out.println("Dime la marca de tu coche");
                        marca = scanner.next();

                        System.out.println("Dime el modelo de tu coche");
                        modelo = scanner.next();

                        System.out.println("Dime los cavallos que tiene tu coche");
                        cv = scanner.nextInt();
                        garaje.anadirCoche(marca, modelo, cv, matricula);
                        break;
                    } else {
                        System.out.println("Ese coche ya está en el garaje");
                    }break;
                case 2:
                    garaje.mostrarCoches();
                    break;
                case 3:
                    System.out.println("Introduce la marca que quieres buscar");
                    marcaBusqueda = scanner.next();

                    garaje.buscarMarca(marcaBusqueda);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Esa no es una opción válida");
            }
        } while (opcion != 4);

    }
}
// garaje.anadirCoche("Mercedes","c220",200,"1234A");
//        garaje.anadirCoche("Ford","Fiesta",100,"1234B");
//        garaje.mostrarCoches();