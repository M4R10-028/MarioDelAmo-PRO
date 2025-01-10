package model;

public class Coche {

    //propiedades
    private String marca, modelo, color, matricula, bastidor;
    private double precio;
    private int cv, par;

    //constructores -> por defecto tengo el constructor vacio sin escribir nada
    public Coche(){
        //para iniciar el objeto y por ende todos los atributos de este
        matricula = "sin definir";
        modelo = "sin definir";
        marca = "sin definir";
        bastidor = "sin definir";
        color = "sin definir";
    }
    public Coche(String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        matricula = "sin definir";
        bastidor = "sin definir";
    }

    public Coche(String marca, String modelo, int cv){
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        par = (int) Math.pow(cv * 2, 2);
        color = "sin definir";
        matricula = "sin definir";
        bastidor = "sin definir";
    }

    //marca modelo color matricula cavallos precio
    // par se calcula
    // precio es lo que me dan mas el 15 por ciento
    public Coche(String marca, String modelo, String color, String matricula, int cv, double precio, String bastidor){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.cv = cv;
        this.precio = precio * 1.15;
        this.bastidor = bastidor;
        this.par = (int) Math.pow(cv * 2, 2);
    }

    //metodos
    public void mostrarDatos(){
        System.out.println("La marca es: " + marca);
        System.out.println("El modelo es: " + modelo);
        System.out.println("El color es: " + color);
        System.out.println("La matricula es: " + matricula);
        System.out.println("El bastidor es: " + bastidor);
        System.out.println("El precio es: " + precio);
        System.out.println("Los cavallos son: " + cv);
        System.out.println("El par es: " + par);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getPar() {
        return par;
    }

    public void setPar(int par) {
        this.par = par;
    }

    //metodos especiales
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
}
