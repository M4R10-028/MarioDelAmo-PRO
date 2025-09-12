package Ejercicio1.model;

public class Audio extends Elemento{
    private double duracion;
    private String soporte;

    public Audio(){}

    public Audio(String identificador, String titulo, String formato, Persona autor, int tamanio, double duracion, String soporte) {
        super(identificador, titulo, formato, autor, tamanio);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Duración: " + duracion + " segundos");
        System.out.println("Soporte: " + soporte);
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}
