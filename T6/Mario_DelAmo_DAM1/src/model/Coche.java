package model;

public class Coche extends Vehiculo{
    protected int cv, cc;

    public Coche(){}

    public Coche(int numeroSerie, String marca, String modelo, String estado, double precioVenta,int cv, int cc){
        super(numeroSerie, marca, modelo, estado, precioVenta);
        this.cv = cv;
        this.cc = cc;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println(" - " + this.cv + " - " + this.cc);
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
}
