package model;

public class Asalariado extends Trabajador implements Empleador, Sindicador {

    private double retencion;
    private int numeroPagas;

    public Asalariado() {
    }

    public Asalariado(String nombre, String apellido, int numeroSSocial, int salario) {
        super(nombre, apellido, numeroSSocial, salario);
        this.retencion = 0.02;
        this.numeroPagas = 12;
    }

    public Asalariado(String nombre, String apellido, int numeroSSocial, int salario, double retencion, int numeroPagas) {
        super(nombre, apellido, numeroSSocial, salario);
        this.retencion = retencion;
        this.numeroPagas = numeroPagas;
    }

    @Override
    public void calcularSalarioMes() {
        double salarioMes = (getSalario() - (getSalario() * retencion)) / numeroPagas;
        System.out.println("El salario mensual es: " + salarioMes);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("retencion = " + retencion);
        System.out.println("numeroPagas = " + numeroPagas);
    }

    public double getRetencion() {
        return retencion;
    }

    public void setRetencion(double retencion) {
        this.retencion = retencion;
    }

    public int getNumeroPagas() {
        return numeroPagas;
    }

    public void setNumeroPagas(int numeroPagas) {
        this.numeroPagas = numeroPagas;
    }

    @Override
    public boolean realizarTrabajo(int numeroHoras) {
        System.out.println("El asalariado se dispone a realizar el trabajo");
        return true;
    }

    @Override
    public void realizarHuelga() {
        if (realizarTrabajo((int) (Math.random() * 10))){
            System.out.println("El asalariado no ha realizado la huelga");
        } else {
            System.out.println("El asalariado ha empezado la huelga");
        }
    }
}
