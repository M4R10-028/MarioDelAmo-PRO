package garaje_hash;

import garaje_hash.controller.Garaje;

public class Entrada {
    public static void main(String[] args) {
        Garaje garaje = new Garaje();
        garaje.agregarCoche();
        garaje.modificarCoche("3456C");
        //garaje.getCoche("3456C");
        //garaje.recorrerCocheKey();
        garaje.recorrerCochesElement();
    }
}
