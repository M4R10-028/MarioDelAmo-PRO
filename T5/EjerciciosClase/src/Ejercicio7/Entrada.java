package Ejercicio7;

import Ejercicio7.model.Equipo;

public class Entrada {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Equipo A");
        Equipo equipo2 = new Equipo("Equipo B",100,100,100);

        for (int i = 0; i < 3; i++) {
            if (equipo1.atacar()) {
                System.out.println("El equipo " + equipo1.getNombre() + " ha marcado.");
            }
            if (equipo2.atacar()) {
                System.out.println("El equipo " + equipo2.getNombre() + " ha marcado.");
            }
        }

        System.out.println("El partido acabó Equipo A: " + equipo1.getGoles() + " - Equipo B: " + equipo2.getGoles() + ".");
    }
}
