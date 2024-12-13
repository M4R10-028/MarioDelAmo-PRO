package agenda_arraylist.controller;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    static Scanner scanner = new Scanner(System.in);
    private ArrayList <Object[]> listaContactos;

    //constructor
    public Agenda(){
        listaContactos = new ArrayList<>();
    }
    public boolean agregarPersona(String nombre, String apellido, int telefono, String dni){
        Object[] persona = {nombre, apellido, telefono, dni};
        if (estaPersona(dni) == null){
            listaContactos.add(persona);
            return true;
        }
        return false;
    }
    private Object[] estaPersona(String dni){
        for ( Object[] persona : listaContactos ) {
            if (String.valueOf(persona[3]).equalsIgnoreCase(dni)){
                //esta en la lista
                return persona;
            }
        }
        //no esta en la lista
        return null;
    }
    public int buscarPersonas(String dni){
        Object[] persona = estaPersona(dni);
        if (listaContactos.isEmpty()){
            return 1;
        } else if (estaPersona(dni) == null){
            return 2;
        } else {
            System.out.println(listaContactos);
            for ( Object item : persona ) {
                System.out.print(item + " - ");
            }
            System.out.println();
        }
        return 3;
    }

}
