package Ejercicio1.model;

public class Garaje {
    private Coche coche;
    private String averia;
    private int cochesAtendidos;
    private boolean estaCoche;

    public Garaje(){}

    public boolean aceptarCoche(Coche coche, String averia){
        if (this.coche == null){
            this.coche = coche;
            this.averia = averia;
            coche.acumularAveria((Math.random()*401) + 100,averia);
            cochesAtendidos++;
            return true;
        }
        return false;
    }
    public void devolverCoche(){
        this.coche = null;
        this.averia = null;
    }
}
