package agenda_arraylist;

import agenda_arraylist.controller.Agenda;

import java.util.Scanner;

public class Entrada {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        String nombre;
        String apellido;
        int telefono;
        String dni;
        int opcion;
        String respuesta;

        do {
            System.out.println("1. Agregar persona");
            System.out.println("2. Buscar personas");
            System.out.println("3. Salir");
            System.out.println("Que opción quieres ejecutar");
            opcion = scanner.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Dime el nombre de la persona");
                    nombre = scanner.next();

                    System.out.println("Dime el apellido de la persona");
                    apellido = scanner.next();

                    System.out.println("Dime el telefono de la persona");
                    telefono = scanner.nextInt();

                    System.out.println("Dime el dni de la persona");
                    dni = scanner.next();

                    if (agenda.agregarPersona(nombre, apellido, telefono, dni)){
                        System.out.println("Operación realizada");
                    } else {
                        System.out.println("No se ha podido realizar la operación debido a que en la lista ya existe un dni igual al introducido");
                    }
                    break;
                case 2:
                    System.out.println("Dime el dni de la persona que estas buscando");
                    dni = scanner.next();
                    int respuesta1 = agenda.buscarPersonas(dni);
                    if (respuesta1 == 1){
                        System.out.println("La lista esta vacia");
                    } else if (respuesta1 == 2){
                        System.out.println("La persona no esta en la lista, queires agregarla?");
                        respuesta = scanner.next();

                        if (respuesta.equalsIgnoreCase("si")){
                            System.out.println("Dime el nombre de la persona");
                            nombre = scanner.next();

                            System.out.println("Dime el apellido de la persona");
                            apellido = scanner.next();

                            System.out.println("Dime el telefono de la persona");
                            telefono = scanner.nextInt();

                            agenda.agregarPersona(nombre, apellido, telefono, dni);
                        } else {
                            System.out.println("Persona no añadida");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Esa no es una opción de la app");
            }
        }while(opcion != 3);

    }
}
