package Ejercicio1.model;

public class Persona {

    private String nombre, dni;

    public Persona(){}
    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void mostrarDatos(){
        System.out.println("Esta persona se llama: " + nombre);
        System.out.println("Su dni es: " + dni);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
