package model;

public class Moto extends Vehiculo {
    protected double peso;
    protected String transmision;

    public Moto(){}

    public Moto(int numeroSerie, String marca, String modelo, String estado, double precioVenta,double peso, String transmision){
        super(numeroSerie,marca,modelo,estado,precioVenta);
        this.peso = peso;
        this.transmision = transmision;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(" - " + this.peso + " - " + this.transmision);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
}
