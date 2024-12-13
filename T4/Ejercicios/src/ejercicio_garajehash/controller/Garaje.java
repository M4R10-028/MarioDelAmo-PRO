package ejercicio_garajehash.controller;

import javax.management.StringValueExp;
import java.util.Hashtable;

public class Garaje {
    private Hashtable<String,Object[]> listaCoches;
    public Garaje(){
        listaCoches = new Hashtable<>();
    }
    public void anadirCoche(String matricula, String marca, String modelo, int coste){
        if (!estaCoche(matricula)){
            Object[] coche = {matricula,marca,modelo,coste};

            listaCoches.put(String.valueOf(coche[0]),coche);
        } else {
            System.out.println("No se ha podido añadir, ese coche ya esta en el garaje");
        }
    }
    private boolean estaCoche(String matricula){
        if (listaCoches.containsKey(matricula)){
            return true;
        }
        return false;
    }
}
