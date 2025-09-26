package controller;

import model.Prioridad;
import model.Tarea;
import model.TareasTrabajo;

import java.util.ArrayList;
import java.util.Scanner;

public class Planificador {
    Scanner sc = new Scanner(System.in);

    ArrayList<Tarea> listaTareas;

    public Planificador() {
        this.listaTareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea){
        if (!estaId(tarea.getId())){
            listaTareas.add(tarea);
            System.out.println("Lista agregada correctamente");
        } else {
            System.out.println("Ya hay una tarea con ese id");
        }
    }

    private boolean estaId(int id){
        for (Tarea tarea : listaTareas) {
            if (id == tarea.getId()){
                return true;
            }
        } return false;
    }

    private Tarea buscarTareaId(int id){
        for (Tarea tarea : listaTareas) {
            if (tarea.getId() == id){
                return tarea;
            }
        }
        System.out.println("No hay una tarea con ese id en la lista");
        return null;
    }

    public void modificarTarea(int id, int cambio){
            if (!estaId(id)){
                System.out.println("La tarea no esta agregada");
            } else {
                switch (cambio){
                    case 1:
                        System.out.println("Introduce el nuevo titulo");
                        buscarTareaId(id).setTitulo(sc.next());
                        System.out.println("Titulo cambiado");
                        break;
                    case 2:
                        System.out.println("Introduce la nueva descripcion");
                        buscarTareaId(id).setDescripcion(sc.nextLine());
                        System.out.println("Descripcion cambiada");
                        break;
                    case 3:
                        System.out.println("Introduce la nueva fecha");
                        buscarTareaId(id).setFecha(sc.next());
                        System.out.println("Fecha cambiada");
                        break;
                    case 4:
                        int prioridad;
                        System.out.println("Introduce la nueva prioridad (1-Baja / 2-Media / 3-Alta)");
                        prioridad = sc.nextInt();
                        if (prioridad == 1){
                            buscarTareaId(id).setPrioridad(Prioridad.Baja);
                        } else if (prioridad == 2){
                            buscarTareaId(id).setPrioridad(Prioridad.Media);
                        } else if (prioridad == 3) {
                            buscarTareaId(id).setPrioridad(Prioridad.Alta);
                        } else {
                            System.out.println("Al no haber elegido una opcion de las posibles se establece por defecto prioridad media");
                            buscarTareaId(id).setPrioridad(Prioridad.Media);
                        }
                        System.out.println("Prioridad cambiada");
                        break;
                    case 5:
                        if (buscarTareaId(id) instanceof TareasTrabajo){
                            System.out.println("Esta tarea es de trabajo, no tiene ubicacion");
                            return;
                        } else {

                        }
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Esta no es una caracteristica de una tarea");
                }
            }
    }

    public ArrayList<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(ArrayList<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }
}
