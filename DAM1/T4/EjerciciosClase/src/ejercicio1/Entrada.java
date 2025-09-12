package ejercicio1;

import  ejercicio1.gestion_hotel.Gestion;

import java.util.Scanner;

public class Entrada {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Gestion gestion = new Gestion();
        int opcion;
        String dni;
        int numeroH;
        String nombre;
        int telefono;
        int numeroP;

        do {
            System.out.println("1. Registrar reserva");
            System.out.println("2. Eliminar reserva");
            System.out.println("3. Mostrar reservas");
            System.out.println("4. Mostrar reservas ordenadas por huespedes");
            System.out.println("5. Salir");
            System.out.println("Que opcion quieres realizar");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Dime tu dni para la reserva de la habitacion");
                    dni = scanner.next();
                    System.out.println("Dime tu nombre para la reserva");
                    nombre = scanner.next();
                    System.out.println("Dime tu telefono");
                    telefono = scanner.nextInt();
                    System.out.println("Dime el numero de la habitacion que quieres reservar");
                    numeroH = scanner.nextInt();
                    System.out.println("Dime cuantas personas sois para la reserva");
                    numeroP = scanner.nextInt();

                    gestion.registroReserva(dni, numeroH, nombre, telefono, numeroP);
                    break;
                case 2:
                    System.out.println("Dime el dni de la persona que ha realizado la reserva");
                    dni = scanner.next();

                    gestion.eliminarReserva(dni);
                    break;
                case 3:
                    gestion.mostrarReservas();
                    break;
                case 4:
                    gestion.mostrarReservasOrdenadas();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Esa no es una opcion, vuelve a intentarlo");
                    break;
            }
        }while (opcion != 5);
    }
}
