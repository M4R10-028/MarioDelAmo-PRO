package Ejercicio7.model;

public class Jugador {
    private String nombre, posicion;
    private int calidad;
    private boolean estrella;

    public Jugador(String nombre, int calidad, String posicion){
        this.nombre = nombre;
        this.calidad = calidad;
        this.posicion = posicion;
        this.estrella = calidad > 90;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Posición: " + posicion);
        System.out.println("Calidad: " + calidad);
        System.out.println("Estrella: " + (estrella? "Si" : "No"));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    public boolean isEstrella() {
        return estrella;
    }

    public void setEstrella(boolean estrella) {
        this.estrella = estrella;
    }
}
