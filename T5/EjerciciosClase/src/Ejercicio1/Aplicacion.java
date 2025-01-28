package Ejercicio1;

import Ejercicio1.model.Coche;
import Ejercicio1.model.Garaje;
import Ejercicio1.model.Motor;

public class Aplicacion {
    public static void main(String[] args) {
        Garaje garaje = new Garaje();

        Motor motor1 = new Motor(270);
        Motor motor2 = new Motor(95);

        Coche coche1 = new Coche("Mercedes","Benz","1234ABC", motor1);
        Coche coche2 = new Coche("VW","Polo","2345BCD",motor2);

        if (garaje.aceptarCoche(coche1,"aceite")){
            System.out.println("Coche arreglandose");
        } else {
            System.out.println("Ya hay un coche arreglandose");
        }
        garaje.devolverCoche();

        if (garaje.aceptarCoche(coche1,"Aire Acondicionado")){
            System.out.println("Coche arreglandose");
        } else {
            System.out.println("Ya hay un coche arreglandose");
        }
        garaje.devolverCoche();

        if (garaje.aceptarCoche(coche2,"aceite")){
            System.out.println("Coche arreglandose");
        } else {
            System.out.println("Ya hay un coche arreglandose");
        }
        garaje.devolverCoche();

        if (garaje.aceptarCoche(coche2,"Caja de Cambios")){
            System.out.println("Coche arreglandose");
        } else {
            System.out.println("Ya hay un coche arreglandose");
        }

        if (garaje.aceptarCoche(coche1,"aceite")){
            System.out.println("Coche arreglandose");
        } else {
            System.out.println("Ya hay un coche arreglandose");
        }

        System.out.println("Informacion del coche con matricula: " + coche1.getMatricula() + "\n"
        + "Modelo: " + coche1.getModelo() + "\n"
        + "Marca: " + coche1.getMarca() + "\n"
        + "CV: " + coche1.getMotor().getCv() + "\n"
        + "Litros de Aceite: " + coche1.getMotor().getLitrosAceite() + "\n"
        + "Precio de las averias: " + coche1.getPrecioAverias());

        System.out.println();
        
        System.out.println("Informacion del coche con matricula: " + coche2.getMatricula() + "\n"
                + "Modelo: " + coche2.getModelo() + "\n"
                + "Marca: " + coche2.getMarca() + "\n"
                + "CV: " + coche2.getMotor().getCv() + "\n"
                + "Litros de Aceite: " + coche2.getMotor().getLitrosAceite() + "\n"
                + "Precio de las averias: " + coche2.getPrecioAverias());
    }
}
