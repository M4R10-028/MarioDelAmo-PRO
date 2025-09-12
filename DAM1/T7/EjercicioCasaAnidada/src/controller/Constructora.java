package controller;

import model.Terreno;
import utils.Orientacion;

import java.util.Scanner;

import static utils.Orientacion.*;


public class Constructora {
    static Scanner sc = new Scanner(System.in);
    Orientacion orientacion;
    Terreno terreno;

    public Constructora() {
    }

    public void crearTerreno() {
        System.out.println("Dime los metros cuadrados del terreno");
        int metros2 = sc.nextInt();
        System.out.println("Dime el valor del terreno");
        int precioTerreno = sc.nextInt();
        System.out.println("Dime la orientacion del terreno(NORTE / SUR / ESTE / OESTE)");
        if (sc.next().equalsIgnoreCase("NORTE")) {
            orientacion = NORTE;
        } else if (sc.next().equalsIgnoreCase("SUR")) {
            orientacion = SUR;
        } else if (sc.next().equalsIgnoreCase("ESTE")) {
            orientacion = ESTE;
        } else {
            orientacion = OESTE;
        }
        terreno = new Terreno(metros2, precioTerreno, orientacion);
    }




}
