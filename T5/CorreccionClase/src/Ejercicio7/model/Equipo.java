package Ejercicio7.model;

import java.util.ArrayList;

public class Equipo {
    private ArrayList<Jugador> plantilla;
    private String nombre;
    private int nivelAtaque, nivelCentro, nivelDefensa, goles;

    public Equipo(){}

    public Equipo(String nombre){
        this.nombre = nombre;
        this.nivelAtaque = (int)(Math.random()*101);
        this.nivelCentro = (int)(Math.random()*101);
        this.nivelDefensa = (int)(Math.random()*101);
        this.plantilla = new ArrayList<>();
    }

    public Equipo(String nombre, int ataque, int centro, int defensa){
        this.nombre = nombre;
        this.nivelAtaque = ataque;
        this.nivelCentro = centro;
        this.nivelDefensa = defensa;
        this.plantilla = new ArrayList<>();
    }

    public boolean atacar(){
        if (((nivelAtaque * (Math.random() * 2) + (nivelCentro * Math.random() * 2)) / 2) > 80){
            this.goles++;
            return true;
        } return false;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: " + this.nombre + "\n" +
                "Ataque: " + this.nivelAtaque + "\n" +
                "Centro: " + this.nivelCentro + "\n" +
                "Defensa: " + this.nivelDefensa + "\n" +
                "Goles: " + this.goles + "\n");
    }

    public void ficharJugador(Jugador jugador){
        this.plantilla.add(jugador);
    }

    public void listarDelanteros(){
        for (Jugador item : this.plantilla){
            if (item.getPosicion().equalsIgnoreCase("delantero")){
                item.mostrarDatos();
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(int nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public int getNivelCentro() {
        return nivelCentro;
    }

    public void setNivelCentro(int nivelCentro) {
        this.nivelCentro = nivelCentro;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public void setNivelDefensa(int nivelDefensa) {
        this.nivelDefensa = nivelDefensa;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
}
