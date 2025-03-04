package EjercicioTrabajadores.controller;

import EjercicioTrabajadores.model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
    Scanner sc = new Scanner(System.in);
    private int beneficio;
    private ArrayList<Persona> listaPersona;

    public Empresa(int beneficio) {
        this.beneficio = beneficio;
        listaPersona = new ArrayList<>();
    }

    public Empresa() {
        listaPersona = new ArrayList<>();
    }

    public void registrarTrabajador(Trabajadores trabajador) {
        //comprobar si el dni existe
        //si intentas meter un jefe , le empresa no debe tener jefe
        if (trabajador instanceof Jefe){
            if (existeJefe()){
                System.out.println("No puedes, la empresa ya tiene un jefe");
            } else {

            }
        }
    }

    private boolean existeJefe(){
        for ( Persona persona : listaPersona ) {
            if (persona instanceof Jefe){
                return true;
            }
        }return false;
    }

    public Trabajadores buscarTrabajador(String dni){
        for (Persona persona: listaPersona) {
            if (persona.getDni().equalsIgnoreCase(dni) && persona instanceof Trabajadores){
                return persona;
            }
        }return null;
    }

    public void despedirTrabajador(String dniJefe, String dni){
        for (Persona t : listaPersona) {
            if (t instanceof Jefe){
                if (t.getDni().equalsIgnoreCase(dniJefe)){
                    for (Persona trabajador : listaPersona) {

                    }
                }
            }
        }
    }
}
