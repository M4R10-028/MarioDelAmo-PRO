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
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentarlo");
            }
        }while (opcion != 6);
    }
}
