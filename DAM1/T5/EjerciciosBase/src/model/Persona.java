package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Persona {
    static Scanner sc = new Scanner(System.in);

    private String nombre, apellido, dni, genero;
    private int edad;
    private double peso, altura, IMC;

    public Persona() {
        this.nombre = "dato por defecto";
        this.apellido = "dato por defecto";
        this.dni = "11111111X";
    }

    public Persona(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = "11111111X";
    }

    public Persona(String nombre, String apellido, String dni, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public void mostrarDatos() {
            System.out.printf("Nombre: %s \n" +
                    "Apellido: %s\n" +
                    "DNI: %s\n" +
                    "Edad: %d\n" +
                    "Peso: %.2f\n" +
                    "Altura: %.2f", nombre, apellido, dni, edad, peso, altura);
        System.out.println();
    }

    public void incrementarEdad(int numero){
        this.edad += numero;
    }

    public double calcularIMC(){
        IMC = peso / Math.pow(this.altura, 2);
        return IMC;
    }

    public void estadoFisico(){
        System.out.println("La persona es hombre o mujer (h / m)");
        String genero = sc.next();
        if (genero.equalsIgnoreCase("m")){
            if (calcularIMC() < 20){
                System.out.println("Peso inferior a lo normal");
            } else if (calcularIMC() >= 20 && calcularIMC() < 27){
                System.out.println("Peso normal");
            } else if (calcularIMC() >= 27 && calcularIMC() < 30){
                System.out.println("Sobrepeso");
            } else if (calcularIMC() >= 30 && calcularIMC() < 40){
                System.out.println("Obesidad");
            } else {
                System.out.println("Obesidad Mórbida");
            }
        } else {
            if (calcularIMC() < 20){
                System.out.println("Peso inferior a lo normal");
            } else if (calcularIMC() >= 20 && calcularIMC() < 25){
                System.out.println("Peso normal");
            } else if (calcularIMC() >= 25 && calcularIMC() < 30){
                System.out.println("Sobrepeso");
            } else if (calcularIMC() >= 30 && calcularIMC() < 40) {
                System.out.println("Obesidad");
            } else {
                System.out.println("Obesidad Mórbida");
            }
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
