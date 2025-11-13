package org.example.pizzeriaapp.model;

public class Pizza {
    private String nombre, tamano;
    private int precio;

    public Pizza() {
    }

    public Pizza(String nombre, String tamano, int precio) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
    }
}
