import controller.Empresa;
import model.*;

import java.util.Scanner;

public class Entrada {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        int numeroSerie, cv, cc, autonomia;
        String marca, modelo, estado, tipo, transmision, tipoBici;
        double precioVenta, peso;
        Empresa AUTOSCES = new Empresa();

        do {
            System.out.println("1. Agregar Vehiculo al Stock");
            System.out.println("2. Buscar Vehiculo en el Stock");
            System.out.println("3. Vender Vehiculo");
            System.out.println("4. Reparar Vehiculo y añadirlo al Stock");
            System.out.println("5. Ver el resultado del precio de la caja");
            System.out.println("6. Salir");
            System.out.println("Indica que opcion quieres realizar");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Dime el tipo de tu vehiculo (Coche / Moto / Patinete / Bici)");
                    tipo = sc.next();
                    System.out.println("Dime el numero de serie del vehiculo a añadir");
                    numeroSerie = sc.nextInt();
                    System.out.println("Dime la marca del vehiculo a añadir");
                    marca = sc.next();
                    System.out.println("Dime el modelo del vehiculo a añadir");
                    modelo = sc.next();
                    System.out.println("Dime el estado del vehiculo (Nuevo / Seminuevo / Usado)");
                    estado = sc.next();
                    System.out.println("Dime el precio de venta del vehiculo");
                    precioVenta = sc.nextDouble();
                    if (tipo.equalsIgnoreCase("Coche")){
                        System.out.println("Dime los cv de tu Coche");
                        cv = sc.nextInt();
                        System.out.println("Dime los cc de tu Coche");
                        cc = sc.nextInt();
                        Vehiculo vehiculo = new Coche(numeroSerie,marca,modelo,estado,precioVenta,cv,cc);
                        AUTOSCES.anadirVehiculo(vehiculo);
                    } else if (tipo.equalsIgnoreCase("Moto")) {
                        System.out.println("Dime el peso de tu moto");
                        peso = sc.nextDouble();
                        System.out.println("Dime el tipo de transmision que tiene tu moto");
                        transmision = sc.next();
                        Vehiculo vehiculo = new Moto(numeroSerie,marca,modelo,estado,precioVenta,peso,transmision);
                        AUTOSCES.anadirVehiculo(vehiculo);
                    } else if (tipo.equalsIgnoreCase("Patinete")){
                        System.out.println("Dime la autonomia de tu patinete");
                        autonomia = sc.nextInt();
                        Vehiculo vehiculo = new Patinete(numeroSerie,marca,modelo,estado,precioVenta,autonomia);
                        AUTOSCES.anadirVehiculo(vehiculo);
                    } else {
                        System.out.println("Dime el tipo de tu Bici (mtb / carretera / cross)");
                        tipoBici = sc.next();
                        Vehiculo vehiculo = new Bici(numeroSerie,marca,modelo,estado,precioVenta,tipoBici);
                        AUTOSCES.anadirVehiculo(vehiculo);
                    }break;
                case 2:
                    System.out.println("Dime el numero de serie del vehiculo que estas buscando");
                    numeroSerie = sc.nextInt();
                    AUTOSCES.buscarVehiculo(numeroSerie);
                    break;
                case 3:
                    System.out.println("Dime el numero de serie del vehiculo que quieres vender");
                    numeroSerie = sc.nextInt();
                    AUTOSCES.venderVehiculo(numeroSerie);
                    break;
                case 4:
                    System.out.println("Dime el tipo de tu vehiculo (Coche / Moto / Patinete / Bici)");
                    tipo = sc.next();
                    System.out.println("Dime el numero de serie del vehiculo a añadir");
                    numeroSerie = sc.nextInt();
                    System.out.println("Dime la marca del vehiculo a añadir");
                    marca = sc.next();
                    System.out.println("Dime el modelo del vehiculo a añadir");
                    modelo = sc.next();
                    System.out.println("Dime el estado del vehiculo (Nuevo / Seminuevo / Usado)");
                    estado = sc.next();
                    System.out.println("Dime el precio de venta del vehiculo");
                    precioVenta = sc.nextDouble();
                    if (tipo.equalsIgnoreCase("Coche")){
                        System.out.println("Dime los cv de tu Coche");
                        cv = sc.nextInt();
                        System.out.println("Dime los cc de tu Coche");
                        cc = sc.nextInt();
                        Vehiculo vehiculo = new Coche(numeroSerie,marca,modelo,estado,precioVenta,cv,cc);
                        AUTOSCES.repararVehiculo(vehiculo);
                    } else if (tipo.equalsIgnoreCase("Moto")) {
                        System.out.println("Dime el peso de tu moto");
                        peso = sc.nextDouble();
                        System.out.println("Dime el tipo de transmision que tiene tu moto");
                        transmision = sc.next();
                        Vehiculo vehiculo = new Moto(numeroSerie,marca,modelo,estado,precioVenta,peso,transmision);
                        AUTOSCES.repararVehiculo(vehiculo);
                    } else if (tipo.equalsIgnoreCase("Patinete")){
                        System.out.println("Dime la autonomia de tu patinete");
                        autonomia = sc.nextInt();
                        Vehiculo vehiculo = new Patinete(numeroSerie,marca,modelo,estado,precioVenta,autonomia);
                        AUTOSCES.repararVehiculo(vehiculo);
                    } else {
                        System.out.println("Dime el tipo de tu Bici (mtb / carretera / cross)");
                        tipoBici = sc.next();
                        Vehiculo vehiculo = new Bici(numeroSerie,marca,modelo,estado,precioVenta,tipoBici);
                        AUTOSCES.repararVehiculo(vehiculo);
                    }
                    break;
                case 5:
                    System.out.println("El precio actual de la caja es de: " + AUTOSCES.getPrecioCaja());
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Esa no es una opcion válida");
                    break;
            }
        } while (opcion != 6);
    }
}
