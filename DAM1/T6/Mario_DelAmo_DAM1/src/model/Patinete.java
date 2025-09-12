package model;

public class Patinete extends Vehiculo{
    protected int autonomia;

    public Patinete(){}

    public Patinete(int numeroSerie, String marca, String modelo, String estado, double precioVenta, int autonomia){
        super(numeroSerie, marca, modelo, estado, precioVenta);
        this.autonomia = autonomia;
    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println(" - " + autonomia);
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }
}
