package Ejercicio2.model;

public class Cuadrado {
    private int base, altura;
    private double area, perimetro;

    public Cuadrado(){}

    public Cuadrado(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        return area = base * altura;
    }

    public double calcularPerimetro(){
        return perimetro = (2 * base) + (2 * altura);
    }
}
