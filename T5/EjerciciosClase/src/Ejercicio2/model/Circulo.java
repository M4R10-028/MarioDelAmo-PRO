package Ejercicio2.model;

public class Circulo {
    private double radio,diametro,area;

    public Circulo(){}

    public Circulo(double radio){
        this.radio = radio;
    }

    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularDiametro(){
        return radio * 2;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
