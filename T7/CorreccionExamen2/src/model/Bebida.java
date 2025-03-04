package model;

public class Bebida extends Consumicion{
    private int minilitros;

    public Bebida(){}

    public Bebida(String nombre, int precio, int minilitros) {
        super.setNombre(nombre);
        super.setPrecio(precio);
        this.minilitros = minilitros;
    }

    @Override
    public void calculoEnergetico() {
        System.out.println("El calculo energetico de la comida es " + (minilitros * 3));
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("minilitros = " + minilitros);
    }

    public int getMinilitros() {
        return minilitros;
    }

    public void setMinilitros(int minilitros) {
        this.minilitros = minilitros;
    }
}
