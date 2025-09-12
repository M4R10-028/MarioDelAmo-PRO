import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dime cuantas personas vas a guardar en la lista");
        int lon = scanner.nextInt();
        int opcion;
        int personas = 0;
        String dni,nombre,apellido;
        boolean esta = false;
        Object[][] lista = new Object[lon][5];

        do {
            System.out.println("1. Agregar persona");
            System.out.println("2. Buscar persona");
            System.out.println("3. Borrar persona");
            System.out.println("4. Borrar sin disponibilidad");
            System.out.println("5. Listar personas");
            System.out.println("6. Salir");
            System.out.println("Que opcion quieres realizar");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Dime el nombre de la persona que quieres guardar");
                    lista[personas][0] = scanner.next();

                    System.out.println("Dime el apellido de la persona que quieres guardar");
                    lista[personas][1] = scanner.next();

                    System.out.println("Dime el telefono de la persona que quieres guardar");
                    lista[personas][2] = scanner.nextInt();

                    System.out.println("Dime el dni de la persona que quieres guardar");
                    lista[personas][3] = scanner.next();

                    System.out.println("Dime si la persdona que quieres guardar tiene disponibilidad");
                    lista[personas][4] = scanner.nextBoolean();

                    personas += 1;
                    break;
                case 2:
                    System.out.println("Dime el dni de la persona que quieres buscar");
                    dni = scanner.next();

                    for (int i = 0; i < lon; i++) {
                        if (lista[i][3].equals(dni)){
                            System.out.println(lista[i][0] + " - " + lista[i][1] + " - " + lista[i][2] + " - " + lista[i][4]);
                            esta = true;
                        }
                    }
                    if (!esta){
                        System.out.println("La persona que buscas no está en la lista");
                    }
                    break;
                case 3:
                    //TODO borrar la persona de la lista el el caso 3 y 4
                    System.out.println("Dime el dni de la persona que quieres borrar");
                    dni = scanner.next();

                    for (int i = 0; i < lon; i++) {
                        if (lista[i][3].equals(dni)){
                            for (int j = 0; j < 5; j++) {
                                lista[i][j] = null;
                            }
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < lon; i++) {
                        if (!(boolean)lista[i][4]){
                            for (int j = 0; j < 5; j++) {
                                lista[i][j] = null;
                            }
                        }
                    }
                    break;
                case 5:
                    for (int i = 0; i < lon; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(lista[i][j] + " - ");
                            System.out.println();
                        }
                    }
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Esa no es una opcion");
                    break;
            }
        }while (opcion != 6);
    }
}
