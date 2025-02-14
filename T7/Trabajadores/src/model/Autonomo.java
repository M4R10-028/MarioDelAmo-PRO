package model;

public class Autonomo extends Trabajador{

    private int cuotas;

    public Autonomo() {
    }

    public Autonomo(String nombre, String apellido, int numeroSSocial, int salario) {
        super(nombre, apellido, numeroSSocial, salario);
    }

    public Autonomo(String nombre, String apellido, int numeroSSocial, int salario, int cuotas) {
        super(nombre, apellido, numeroSSocial, salario);
        this.cuotas = cuotas;
    }

    @Override
    public void calcularSalarioMes() {
        double salarioMes = getSalario() - (cuotas*12);
        System.out.println("El salario mensual es: " + salarioMes);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("cuotas = " + cuotas);
    }

    public double getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }
}
