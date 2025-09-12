package model;

public class Bici extends Vehiculo{
    protected String tipo;

    public Bici(){}

    public Bici(int numeroSerie, String marca, String modelo, String estado, double precioVenta, String tipo){
        super(numeroSerie, marca, modelo, estado, precioVenta);
        this.tipo = tipo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(" - " + this.tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
