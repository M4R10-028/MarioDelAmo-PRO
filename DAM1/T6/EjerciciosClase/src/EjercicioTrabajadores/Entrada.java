package EjercicioTrabajadores;

import EjercicioTrabajadores.controller.Empresa;

import java.util.Scanner;

public class Entrada {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        Empresa empresa = new Empresa();
        do {
            System.out.println("1. Registrar Trabajador");
            System.out.println("2. Listar Trabajadores");
            System.out.println("3. Despedir Trabajador");
            System.out.println("4. Repartir Beneficios");
            System.out.println("5. Salir");
            System.out.println("Dime la opcion que quieres realizar");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    int tipoTrabajador;
                    System.out.println("Que tipo de trabajador quieres añadir");
                    System.out.println("1. Jefe");
                    System.out.println("2. Asalariado");
                    System.out.println("3. Autonomo");
                    tipoTrabajador = sc.nextInt();
                    switch (tipoTrabajador){
                        case 1:
                            System.out.println("Dime su nombre");
                            String nombre = sc.next();
                            System.out.println("Dime su apellido");
                            String apellido = sc.next();
                            System.out.println("Dime su dni");
                            String dni = sc.next();

                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        } while (opcion != 5);
    }
}
