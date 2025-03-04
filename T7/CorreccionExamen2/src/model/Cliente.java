package model;

import java.util.ArrayList;

final public class Cliente {
    private String nombre;
    private ArrayList<Consumicion> consumiciones;
    private double totalFactura;

    public Cliente(){
        this.consumiciones = new ArrayList<>();
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.consumiciones = new ArrayList<>();
    }

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("La factura a pagar es = " + totalFactura);
        for ( Consumicion consumicion : consumiciones ) {
            if (consumiciones.isEmpty()){
                System.out.println("Aun no ha pedido nada");
            } else {
                System.out.println(consumicion.getNombre() + " - " + consumicion.getPrecio());
            }
        }
    }

    public void incrementarFactura(double precio){
        this.totalFactura += precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(double totalFactura) {
        this.totalFactura = totalFactura;
    }

    public ArrayList<Consumicion> getConsumiciones() {
        return consumiciones;
    }

    public void setConsumiciones(ArrayList<Consumicion> consumiciones) {
        this.consumiciones = consumiciones;
    }
}
