package model;

public class Vehiculo {
    protected int numeroSerie;
    protected String marca, modelo, estado;
    protected double precioVenta;

    public Vehiculo(){}

    public Vehiculo(int numeroSerie, String marca, String modelo, String estado, double precioVenta){
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
        if (estado.equalsIgnoreCase("nuevo")){
            this.precioVenta = precioVenta * 1.10;
        } else if (estado.equalsIgnoreCase("seminuevo")) {
            this.precioVenta = precioVenta * 1.05;
        } else {
            this.precioVenta = precioVenta;
        }
    }

    public void mostrarDatos(){
        System.out.print("Datos: " + this.numeroSerie + " - " + this.marca + " - " + this.modelo + " - " + this.precioVenta);
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
}
