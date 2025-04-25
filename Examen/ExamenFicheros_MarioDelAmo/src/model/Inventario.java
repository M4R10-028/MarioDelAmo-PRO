package model;

import java.util.ArrayList;

public class Inventario <T>{
    protected ArrayList<T> items = new ArrayList<>();

    public void agregarProducto(T producto){
        this.items.add(producto);
    }

    public void mostrarProdutos(){
        for(T item : items){
            System.out.println(item.toString());
        }
    }

    /*
    public class Producto {
        private String nombre;
        private double precio;
        private int stock;

        public Producto() {
        }

        public Producto(String nombre, double precio, int stock) {
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }

        @Override
        public String toString() {
            return ("Nombre: " + nombre + " Precio: " + precio + " Stock: " + stock + "\n");
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }
    }

     */

}
