package controller;

import model.Audio;
import model.Elemento;
import model.Libro;
import model.Video;

import javax.swing.border.LineBorder;
import java.util.ArrayList;

public class Coleccion {
    private ArrayList<Elemento> elementos;

    public Coleccion() {
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(Elemento elemento) {
        elementos.add(elemento);
    }

    public void eliminarElemento(String id) {
        for (Elemento elemento : elementos) {
            if (elemento.getIdentificador().equalsIgnoreCase(id)) {
                elementos.remove(elemento);
                System.out.println("El elemento ha sido borrado");
                return;
            }
        }
        System.out.println("El elemento no estaba en la lista");
    }

    public void buscarElemento(String id){
        for (Elemento elemento : elementos) {
            if (elemento.getIdentificador().equals(id)){
                System.out.println("El elemento está guardado.");
                return;
            }
        }
        System.out.println("El elemento no está guardado.");
    }

    public void listarElementos(int tipo){
        System.out.println("Listado de elementos:");
        for (Elemento elemento : elementos) {
            switch (tipo){
                case 0:
                    if (elemento instanceof Libro){
                        elemento.mostrarDatos();
                    }
                    break;
                case 1:
                    if (elemento instanceof Audio){
                        elemento.mostrarDatos();
                    }
                    break;
                case 2:
                    if (elemento instanceof Video){
                        elemento.mostrarDatos();
                    }
                    break;
                case 3:
                    elemento.mostrarDatos();
                    break;
            }
        }
        System.out.println();
    }

    public ArrayList<Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<Elemento> elementos) {
        this.elementos = elementos;
    }
}
