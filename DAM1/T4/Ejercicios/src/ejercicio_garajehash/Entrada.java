package ejercicio_garajehash;

import ejercicio_garajehash.controller.Garaje;

import java.util.Scanner;

public class Entrada {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Garaje garaje = new Garaje();
        int opcion;
        String matricula;
        String marca;
        String modelo;
        int coste;

        do {
            System.out.println("1. Añadir coche");
            System.out.println("2. Listar coches");
            System.out.println("3. Buscar coche");
            System.out.println("4. Mostrar costes");
            System.out.println("6. Salir");
            System.out.println("Que opcion quieres realizar");
            opcion = scanner.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Dime la matricula del coche que quiere añadir");
                    matricula = scanner.next();

                    System.out.println("Dime la marca del coche");
                    marca = scanner.next();

                    System.out.println("Dime el modelo del coche");
                    modelo = scanner.next();

                    System.out.println("Dime el coste del coche");
                    coste = scanner.nextInt();

                    garaje.anadirCoche(matricula,marca,modelo,coste);
                    break;
                case 2:
                    garaje.listarCoches();
                    break;
                case 3:
                    System.out.println("Dime la matricula del coche que estas buscando");
                    matricula = scanner.next();

                    garaje.estaCoche(matricula);
                    break;
                case 4:
                    garaje.mostrarcostes();
                    break;
                case 5:
                    System.out.println("Escribe la matricula del coche que quieres borrar");
                    matricula = scanner.next();

                    garaje.borrarCoche(matricula);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentarlo");
            }
        }while (opcion != 6);
    }
}
