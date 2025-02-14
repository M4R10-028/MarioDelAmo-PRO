package model;

import java.util.ArrayList;

public class Video extends Elemento {
    private Persona director;

    private ArrayList<Persona> actores;

    public Video(){}



    public Video(String identificador, String titulo, String formato, Persona autor, int tamanio, Persona director, ArrayList<Persona> actores) {
        super(identificador, titulo, formato, autor, tamanio);
        this.director = director;
        this.actores = actores;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Director: " + director.getNombre() + " - " + director.getDni());
        for (Persona actor : actores) {
            System.out.println("Actor: " + actor.getNombre() + " - " + actor.getDni() + "\n");
        }
    }

    public Persona getDirector() {
        return director;
    }

    public void setDirector(Persona director) {
        this.director = director;
    }

    public ArrayList<Persona> getActores() {
        return actores;
    }

    public void setActores(ArrayList<Persona> actores) {
        this.actores = actores;
    }
}
