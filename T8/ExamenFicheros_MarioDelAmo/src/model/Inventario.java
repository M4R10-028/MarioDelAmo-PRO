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
}
