package Ejercicio2;

import Ejercicio2.model.Circulo;
import Ejercicio2.model.Cuadrado;
import Ejercicio2.model.Triangulo;

public class Entrada {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println("El área del círculo es: " + circulo.calcularArea());
        System.out.println("El diametro del círculo es: " + circulo.calcularDiametro());

        Cuadrado cuadrado = new Cuadrado(4,4);
        System.out.println("El área del cuadrado es: " + cuadrado.calcularArea());
        System.out.println("El perímetro del cuadrado es: " + cuadrado.calcularPerimetro());

        Triangulo triangulo = new Triangulo(3,4);
        System.out.println("El área del triángulo es: " + triangulo.calcularArea());
    }
}
