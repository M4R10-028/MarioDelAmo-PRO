package controller;

import dto.ProfesorDTO;
import model.Profesor;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ControladorProfesores {
    ArrayList<Profesor> centro = new ArrayList<>();
    ProfesorDTO profesorDTO;
    public void mostrarProfesoresBD(){
        if (!profesorDTO.mostrarProfesores()){
            System.out.println("No hay profesores en la base de datos");
        }
    }

    public void incorporarProfesorTemporal(Profesor profesor){
        if (profesorDTO.estaProfesor(profesor.getDni())){
            centro.add(profesor);
        } else {
            System.out.println("Ya hay un profesor con ese dni y no se puede añadir");
        }
    }

    public void darBajaProfesorTemporal (String dni){
        for (Profesor p : centro) {
            if (p.getDni().equalsIgnoreCase(dni)){
                centro.remove(p);
                return;
            }
        }
        System.out.println("No hay nongun profesor con ese dni");
    }

    public void exportarBD(){
        if (centro.isEmpty()){
            System.out.println("No hay profesores para añadir");
        } else {
            for (Profesor p : centro) {
                profesorDTO.ingresarProfesor(p);
            }
        }
    }

    public void exportarCSV(){

    }

    public void exportarOBJ(){
        File file = new File("resources/centro.obj");
        if (centro.isEmpty()){
            System.out.println("No hay profesores para importar");
        } else {
            for (Profesor p : centro) {
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
                    objectOutputStream.writeObject(p);
                } catch (IOException e) {
                    System.out.println("Error en la escritura");
                }
            }
        }
    }
}
