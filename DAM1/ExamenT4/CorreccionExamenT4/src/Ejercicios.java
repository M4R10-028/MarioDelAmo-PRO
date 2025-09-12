import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ejercicio 1
        /*
        Controladora1 controladora1 = new Controladora1();
        controladora1.agregarProducto("Platano",1.25);
        controladora1.agregarProducto("Camiseta",19.95);
        controladora1.listarProductos();
        controladora1.listarPrecioMinimo(15);
        controladora1.listarOrdenado();*/

        //Ejercicio 2
        /*
        Controladora2 controladora2 = new Controladora2();
        System.out.println("Indica cuantos alumnos quieres agregar");
        int numeroAlumnos = scanner.nextInt();
        for (int i = 0; i < numeroAlumnos; i++) {
            System.out.println("Introduce el nombre del alumno");
            String nombre = scanner.next();
            controladora2.agregarAlumno(nombre);
        }

        System.out.println("Quieres calificar? (s/n)");
        String respuesta = scanner.next();
        if (respuesta.equalsIgnoreCase("s")){
            controladora2.calificar();
            System.out.println("Quieres ver suspensos: 1");
            System.out.println("Quieres ver ordenadas por nota: 2");
            System.out.println("Indica que quieres hacer");
            int opcion = scanner.nextInt();
            if (opcion == 1){
                controladora2.listarSuspensos();
            } else {
                controladora2.listarNotasOrdenadas();
            }
        } else {
            System.out.println("Terminado");
        }*/

        //Ejercicio 3
        /*
        Controladora3 controladora3 = new Controladora3();
        int opcion;
        String dni;
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
                    System.out.println("Dime el dni de la persona que quieres agregar");
                    dni = scanner.next();
                    System.out.println("Dime el nombre de la persona que quieres agregar");
                    String nombre = scanner.next();
                    System.out.println("Dime el apellido de la persona que quieres agregar");
                    String apellido = scanner.next();
                    System.out.println("Dime el telefono de la persona que quieres agregar");
                    int telefono = scanner.nextInt();
                    System.out.println("Dime si tiene disponibilidad de la persona que quieres agregar (true/false)");
                    boolean dispo = scanner.nextBoolean();
                    controladora3.agregarContacto(dni,nombre,apellido,telefono,dispo);
                    break;
                case 2:
                    System.out.println("Dime el dni de la persona que estas buscando");
                    dni = scanner.next();
                    controladora3.buscarContacto(dni);
                    break;
                case 3:
                    System.out.println("Dime el dni de la persona que quieres borrar");
                    dni = scanner.next();
                    controladora3.borrarContacto(dni);
                    break;
                case 4:
                    System.out.println("Dime el dni que quieres borrar si no tiene disponibilidad");
                    dni = scanner.next();
                    controladora3.borrarContactoDisponibilidad(dni);
                    break;
                case 5:
                    controladora3.listarContactos();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Esa no es una opcion, prueba de nuevo");
                    break;
            }
        }while(opcion != 6);*/
    }
}
