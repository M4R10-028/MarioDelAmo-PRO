package Ejercicio7;

import Ejercicio7.model.Equipo;
import Ejercicio7.model.Jugador;

public class Entrada {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Real Madrid", 90, 80, 95);
        Equipo equipo2 = new Equipo("Barcelona");

        Jugador jugador1 = new Jugador("Messi", 95, "Delantero");

        equipo1.mostrarDatos();
        equipo2.mostrarDatos();

        jugador1.mostrarDatos();
        equipo1.ficharJugador(jugador1);

        for (int i = 0; i < 3; i++) {
            equipo1.atacar();
            equipo2.atacar();
        }

        System.out.printf("El partido ha terminado %s: %d - %s: %d", equipo1.getNombre(), equipo1.getGoles(), equipo2.getNombre(), equipo2.getGoles());
    }

}
