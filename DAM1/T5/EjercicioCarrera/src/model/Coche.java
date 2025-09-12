package model;

public class Coche {

    private String marca, modelo, matricula;
    private int cv, km, kmm;

    public Coche(){

    }
    public Coche(String marca, String modelo, String matricula, int cv){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getKm() {
        return km;
    }

    public int gettKm() { return kmm; }

    public void setKm(int km) {
        this.km += km;
    }
    public void settKm(int km) { this.kmm = km; }
}
