package model;

import java.util.Arrays;

public class Tarea {

    //una tarea tiene asociadas una serie de personas
    //cuando se crea la tarea es necesario pedir cuantas personas (NO QUE PERSONAS)
    //encargaran de la tarea

    //variables
    private String titulo, descripcion;
    private boolean prioritario, completada;
    private Persona[] personas;
    private int huecos;
    //contructores

    public Tarea() {
    }

    public Tarea(String titulo, String descripcion, boolean prioritario, int encargados) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioritario = prioritario;
        personas = new Persona[encargados];
        //completada = false ya que un boolean no puede ser nulo se pone automaticamente como false
    }

    public Tarea(String titulo, String descripcion, int encargados) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        personas = new Persona[encargados];
    }

    //cada tarea puede asignar una persona
    //solo se podra asignar una persona si hay hueco disponible
    //cada vez que se asigne una persona, se debera colocar en el primer hueco

    public void asignarPersona(Persona persona){
        for (int i = 0; i < personas.length; i++) {

            if (personas[i] == null && !estaDNI(persona.getDni())) {

                    personas[i] = persona;
                    System.out.println("La persona " + persona.getNombre() + " ha sido asignada para esta tarea");
                    return;

            }
        }

        System.out.println("Esta tarea ya esta llena o ya tiene el mismo dni de " + persona.getNombre() + " y no se ha podido añadir");

    }

    public void quitarResponsable(String dni){
        for (int i = 0; i < personas.length; i++) {
            if (personas[i]!= null && personas[i].getDni().equalsIgnoreCase(dni)) {
                personas[i] = null;
                System.out.println("La persona se ha borrado");
                return;
            }
        }
        System.out.println("No habia ninguna persona con el DNI " + dni);
    }

    public void mostrarResponsables() {
        for (int i = 0; i < personas.length; i++) {

            if (personas[i] != null){

                System.out.println("Encargado "+ (i+1) +" "+ personas[i].toString());
                System.out.println("----------------------------------------------------");

            } else {

                huecos++;

            }

        }
        if (huecos == personas.length) {
            System.out.println("En la tarea no hay gente asignada");

        } else if ( huecos < personas.length ){
            System.out.println("Hay " + huecos + " huecos disponibles");

        } else {
            System.out.println("La tarea esta llena");

        }
    }

    private boolean estaDNI(String dni) {
        for (int i = 0; i < personas.length; i++) {

            if (personas[i] != null){

                if (personas[i].getDni().equalsIgnoreCase(dni)){
                    return true;

                }
            }
        }

        return false;

    }

    //metodos -> getter/setter


    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isPrioritario() {
        return prioritario;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrioritario(boolean prioritario) {
        this.prioritario = prioritario;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", prioritario=" + prioritario +
                ", completada=" + completada +
                ", personas=" + Arrays.toString(personas) +
                '}';
    }
}