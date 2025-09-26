package model;

import java.util.ArrayList;
import java.util.Arrays;

abstract public class Tarea {

    //una tarea tiene asociadas una serie de personas
    //cuando se crea la tarea es necesario pedir cuantas personas (NO QUE PERSONAS)
    //encargaran de la tarea

    //crear el metodo que permite agregar un encargo
        //los encargos deben tener un id unico -> PONER AVISOS
    //crear un metodo para eliminar un encargo
        //para ello se pide al usuario el id del encargo y se quita de la lista -> PONER AVISOS

    //variables
    private String titulo, descripcion;
    private boolean prioritario, completada;
    private Persona[] personas;
    private int huecos;

    private ArrayList<Encargo> listaTareas;

    //contructores

    public Tarea() {
    }

    public Tarea(String titulo, String descripcion, boolean prioritario, int encargados) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioritario = prioritario;
        personas = new Persona[encargados];
        listaTareas = new ArrayList<>();
        //completada = false ya que un boolean no puede ser nulo se pone automaticamente como false
    }

    public Tarea(String titulo, String descripcion, int encargados) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        personas = new Persona[encargados];
        listaTareas = new ArrayList<>();
    }

    public abstract void enviarRecordatorio();

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

    private Encargo estaId (int id){
        if (listaTareas.isEmpty()){
            return null;
        }
        for (Encargo encargo : listaTareas) {
            if (encargo.getId() == id){
                return encargo;
            }
        }

        return null;
    }

    public void agregarEncargo(Encargo encargo) {
        if (estaId(encargo.getId()) != null){
            System.out.println("En la lista ya hay un encargo con este id");
        } else {
            listaTareas.add(encargo);
            System.out.println("El encargo ha sido añadido correctamente");
        }
    }

    public void eliminarEncargo(int id) {
        if (estaId(id) == null){
            System.out.println("En la lista no habia ninguno con ese id, la lista no ha sido modificada");
        } else {
            listaTareas.remove(estaId(id));
            System.out.printf("El encargo con id %d ha sido eliminado%n", id);
        }
    }

    /*
    Listar todos los encargos de una tarea
    */

    public void mostrarEncargos() {
        for (Encargo encargo : listaTareas) {
            System.out.println(encargo.toString());
        }
    }

    /*
    Buscar un encargo por id
    */

    public void buscarEncargoId(int id) {
        if (estaId(id) != null){
            System.out.println(estaId(id).toString());
        }
        else {
            System.out.println("Este encargo no esta");
        }
    }

    /*
    Completar un encargo -> pasar su variable completada a true
    */

    public void completarEncargo(int id){
        if (estaId(id) != null && !estaId(id).isCompleta()){
            estaId(id).setCompleta(true);
            System.out.println("Encargo completado");
        } else {
            System.out.println("Ese encargo no existe, no esta en la lista o ya esta completado");
        }
    }

    /*
    Mostrar encargos que estan completados
    */

    public void mostrarCompletados() {
        for (Encargo encargo : listaTareas) {
            if (encargo.isCompleta()){
                System.out.println(encargo.toString());
            }
        }
    }

    /*
    Completar una tarea -> Una tarea quedara como completa si todos sus encargos
    estan completados
    */

    public void completarTarea (Tarea tarea) {
        for (Encargo encargo : listaTareas) {
            if (!encargo.isCompleta()){
                System.out.println("No se puede completar la tarea, hay encargos sin completar");
                return;
            }
        }
        tarea.setCompletada(true);
        System.out.println("La tarea ha sido completada");
    }
    /*
    Crear los metodos de:
    asignar un encargo
     */



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

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    public ArrayList<Encargo> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(ArrayList<Encargo> listaTareas) {
        this.listaTareas = listaTareas;
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