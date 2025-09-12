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
    public boolean estaCoche(String matricula){
        if (listaCoches.containsKey(matricula)){
            return true;
        }
        return false;
    }
    public void listarCoches(){
        for ( Object[] coche : listaCoches.values()){
            System.out.print(coche + " - ");
        }
        System.out.println();
    }
    public void mostrarcostes(){
        int costes = 0;
        for ( Object[] coche : listaCoches.values() ){
            costes = (int) coche[3];
        }
        System.out.println("El coste total de los coches guardados es de " + costes);
    }
    public void borrarCoche(String matricula){
        listaCoches.remove(matricula);
    }
}
