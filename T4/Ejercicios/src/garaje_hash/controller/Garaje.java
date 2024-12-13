package garaje_hash.controller;

import java.util.Enumeration;
import java.util.Hashtable;

public class Garaje {

    private Hashtable<String,Object[]> listaCoche;

    public Garaje(){
        listaCoche = new Hashtable<>();
    }

    public void agregarCoche(){
        Object[] coche1 = {"1234A","Mercedes", "ClaseA", 10000, 150};
        Object[] coche2 = {"2345B","Mercedes", "ClaseB", 20000, 250};
        Object[] coche3 = {"3456C","Mercedes", "ClaseC", 30000, 350};
        Object[] coche4 = {"4567D","Mercedes", "ClaseD", 40000, 450};

        listaCoche.put(String.valueOf(coche1[0]),coche1);
        listaCoche.put(String.valueOf(coche2[0]),coche2);
        listaCoche.put(String.valueOf(coche3[0]),coche3);
        listaCoche.put(String.valueOf(coche4[0]),coche4);
    }
    public void getCoche(String matricula){
        Object[] cocheEncontrado = listaCoche.get(matricula);
        if (listaCoche.containsKey(matricula)){
            System.out.println(cocheEncontrado[2]);
        }
    }

    public void borrarCoche(String matricula){
        listaCoche.remove(matricula);
    }
    public void modificarCoche(String matricula){
        //Object[] coche = listaCoche.get(matricula);
        //coche[3] = Integer.valueOf(coche[3].toString()) + 20000;
    }
    public void recorrerCocheKey(){
        Enumeration<String> keys = listaCoche.keys();
        while (keys.hasMoreElements()){
            String key = keys.nextElement();
            getCoche(key);
        }
    }
    public void recorrerCochesElement(){
        Enumeration<Object[]> coches = listaCoche.elements();
        while (coches.hasMoreElements()){
            Object[] coche = coches.nextElement();
            getCoche(coche[0].toString());
        }
    }
}
