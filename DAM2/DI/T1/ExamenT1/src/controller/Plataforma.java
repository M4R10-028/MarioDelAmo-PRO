package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;

public class Plataforma {
    ArrayList<Videojuego> videojuegos;
    ArrayList<Videojuego> carrito;

    public Plataforma() {
        videojuegos = new ArrayList<>();
        carrito = new ArrayList<>();
    }

    public void agregarJuego(Videojuego videojuego) {
        if (videojuegos.isEmpty()){
            System.out.println("Videojuego añadido correctamente");
            videojuegos.add(videojuego);
        } else {
            for (Videojuego juego : videojuegos) {
                if (juego == videojuego){
                    System.out.println("El videojuego que quieres añadir ya esta en la lista");
                    return;
                }
            }
            System.out.println("Videojuego añadido correctamente");
            videojuegos.add(videojuego);
        }
    }

    public void borrarJuego(String titulo){
        for (Videojuego videojuego : videojuegos) {
            if (videojuego.getTitulo().equalsIgnoreCase(titulo)){
                videojuegos.remove(videojuego);
                System.out.println("Videojuego borrado correctamente");
                return;
            }
        }
        System.out.println("No hay ningun juego en la lista con ese titulo");
    }

    public void mostrarJuegos(){
        for (Videojuego videojuego : videojuegos) {
            System.out.println(videojuego.toString());
        }
    }

    public void mostrarJuegosPrecio(){
        videojuegos.sort(new Comparator<Videojuego>() {
            @Override
            public int compare(Videojuego o1, Videojuego o2) {
                if (o1.getPrecio() > o2.getPrecio()){
                    return 1;
                } else if (o1.getPrecio() < o2.getPrecio()){
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        for (Videojuego videojuego : videojuegos) {
            System.out.println(videojuego.toString());
        }
    }

    public void filtrarPorTipo(String tipo){
        if (tipo.equalsIgnoreCase("Accion")){
            for (Videojuego videojuego : videojuegos) {
                System.out.println("Listando");
                if (videojuego instanceof VideojuegoAccion){
                    System.out.println(videojuego.toString());
                }
            }
        } else if (tipo.equalsIgnoreCase("Estrategia")) {
            for (Videojuego videojuego : videojuegos) {
                System.out.println("Listando...");
                if (videojuego instanceof VideojuegoEstrategia){
                    System.out.println(videojuego.toString());
                }
            }
        } else if (tipo.equalsIgnoreCase("RPG")){
            for (Videojuego videojuego : videojuegos) {
                System.out.println("Listando...");
                if (videojuego instanceof VideojuegoRPG){
                    System.out.println(videojuego.toString());
                }
            }
        } else {
            System.out.println("Ese tipo no existe");
        }
    }

    public void filtrarClasificacionEdad(ClasificacionEdad clasificacionEdad){
        for (Videojuego videojuego : videojuegos) {
            if (videojuego.getClasificacionEdad() == clasificacionEdad){
                System.out.println(videojuego.toString());
            }
        }
    }

    public void calcularPrecioTotal(){
        double precioFinal = 0;
        for (Videojuego videojuego : videojuegos) {
            precioFinal += videojuego.getPrecio();
        }
        System.out.println("El precio total de todos los juegos de la lista es de " + precioFinal);
    }

    public void anadirCarrito (String titulo) {
        for (Videojuego videojuego : videojuegos) {
            if (videojuego.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Videojuego añadido correctamente al carrito");
                carrito.add(videojuego);
                return;
            }
        }
    }
}
