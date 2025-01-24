package controller;

import model.Coche;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Carrera {

    static Scanner sc = new Scanner(System.in);

    private boolean apto, desinscrito = false;
    private int vueltas, cv;
    private String nombre, marca, modelo, matricula;
    private Coche ganador;
    private ArrayList<Coche> participantes;

    public Carrera(int vueltas, String nombre){
        this.nombre = nombre;
        this.vueltas = vueltas;
        participantes = new ArrayList<>();
    }

    public void inscribirParticipante(String marca, String modelo, String matricula, int cv){
        Coche coche = new Coche(marca, modelo, matricula,cv);
        if (!participantes.isEmpty()) {
            for (int i = 0; i < participantes.size(); i++) {
                apto = true;
                if (participantes.size() > 8) {
                    System.out.println("La carrera ya está llena");
                    apto = false;
                    break;
                } else if (participantes.get(i).getMatricula().equalsIgnoreCase(matricula)) {
                    System.out.println("Este coche ya está inscrito");
                    apto = false;
                    break;
                } else if (cv > 300) {
                    System.out.println("El coche supera los cavallos máximos permitivos");
                    apto = false;
                    break;
                }
            }
            if (apto){
                participantes.add(coche);
                System.out.println("Coche añadido correctamente");
            } else {
                System.out.println("El coche no es apto para la inscripción");
            }
        } else {
            participantes.add(coche);
        }
    }

    public void desinscribirParticipante(String matricula){
        for (Coche coche : participantes) {
            if (coche.getMatricula().equalsIgnoreCase(matricula)){
                participantes.remove(coche);
                System.out.println("El participante con la matricula " + matricula + " ha sido desinscrito.");
                desinscrito = true;
                break;
            }
        }
        if (!desinscrito){
            System.out.println("El participante con matricula " + matricula + " no estaba incrito.");
        }
    }

    public void mostrarParticipantes(){
        int i = 1;
        for (Coche coche : participantes) {
            System.out.println(i + " " + coche.getMarca() + " " + coche.getMatricula() + " " + coche.getCv());
            i++;
        }
    }

    public void iniciarCarrera(){
        if (participantes.size() == 8){
            for (int i = 0; i < vueltas; i++) {
                for ( Coche coche : participantes ) {
                    int aleatorio = (int) ((Math.random() * 26) + 50);
                    coche.settKm(aleatorio);
                    coche.setKm(aleatorio);
                }
                System.out.println("La clasificacion en la vuelta " + (i + 1) + " ha sido así: ");

                ordenarLista();

                int j = 1;
                for ( Coche coche : participantes ) {
                    System.out.println(j + ". " + coche.getMarca() + " " + coche.getMatricula() + " " + coche.gettKm());
                    j++;
                    try{
                        Thread.sleep(3000);
                    } catch (InterruptedException e){
                        throw new RuntimeException(e);
                    }
                }
            }
        }

    }

    private void ordenarLista(){
        participantes.sort(new Comparator<Coche>() {
            @Override
            public int compare(Coche o1, Coche o2) {
                if (o1.getKm() > o2.getKm()){
                    return -1;
                } else if (o1.getKm() < o2.getKm()) {
                    return 1;
                }
                return 0;
            }
        });
    }

    public void mostrarGanador(){
        ordenarLista();
        System.out.println("El ganador ha sido el participante del coche " + participantes.get(0).getMarca() + " " + participantes.get(0).getMatricula() + " " + participantes.get(0).getKm());
    }

    public void mostrarClasificacion(){
        ordenarLista();
        int i = 1;
        for ( Coche coche : participantes ) {
            System.out.println(i + ". " + coche.getMarca() + " " + coche.getModelo() + " " + coche.getMatricula() + " " + coche.getKm());
            i++;
        }
    }




}
