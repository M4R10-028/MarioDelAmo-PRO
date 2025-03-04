package model;

abstract public class Consumicion {
    private String nombre;
    private int precio;

    public Consumicion(){}

    public Consumicion(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    abstract public void calculoEnergetico();

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("precio = " + precio);

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
