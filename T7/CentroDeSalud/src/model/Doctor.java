package model;

public class Doctor extends Persona{
    protected int numeroColegiado;

    public Doctor() {
    }

    public Doctor(String nombre, String apellido, int numeroColegiado) {
        super(nombre, apellido);
        this.numeroColegiado = numeroColegiado;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Número de colegiado: " + numeroColegiado);
    }

    public int getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(int numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }
}
