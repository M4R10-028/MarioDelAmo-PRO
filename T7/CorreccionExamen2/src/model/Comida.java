package model;

public class Comida extends Consumicion implements Inventariable{
    private int calorias;

    public Comida(){}

    @Override
    public void calculoEnergetico() {
        System.out.println("El calculo energetico de la comida es " + this.calorias);
    }

    public Comida(String nombre, int precio, int calorias) {
        super(nombre, precio);
        this.calorias = calorias;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("calorias = " + calorias);
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public void almacenar() {
        System.out.println("La comida se almacena en el frigo");
    }
}
