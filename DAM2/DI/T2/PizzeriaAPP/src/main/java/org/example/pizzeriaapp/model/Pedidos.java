package org.example.pizzeriaapp.model;

public class Pedidos {
    private int id, telefono;
    private String nombre;
    private Pizza pizza;

    public Pedidos() {
    }

    public Pedidos(int id, int telefono, String nombre, Pizza pizza) {
        this.id = id;
        this.telefono = telefono;
        this.nombre = nombre;
        this.pizza = pizza;
    }
}
