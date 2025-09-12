package Ejercicio7.model;

public class Equipo {
    private String nombre;
    private int nivelAtaque, nivelDefensa, nivelCentro, goles;

    public Equipo(){}

    public Equipo(String nombre){
        this.nombre = nombre;
        this.nivelAtaque = (int)(Math.random()*101);
        this.nivelCentro = (int)(Math.random()*101);
        this.nivelDefensa = (int)(Math.random()*101);
        this.goles = 0;
    }

    public Equipo(String nombre, int nivelAtaque, int nivelDefensa, int nivelCentro){
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelDefensa = nivelDefensa;
        this.nivelCentro = nivelCentro;
        this.goles = 0;
    }

    public boolean atacar(){
        if ((nivelAtaque* Math.random() + nivelCentro * Math.random() / 2) >90){
            goles++;
            return true;
        }return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
}
