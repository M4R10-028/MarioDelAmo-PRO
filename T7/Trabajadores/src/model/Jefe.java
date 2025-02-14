package model;

public class Jefe extends Trabajador implements Empleador {

    public Jefe() {
    }

    public Jefe(String nombre, String apellido, int numeroSSocial, int salario) {
        super(nombre, apellido, numeroSSocial, salario);
    }

    @Override
    public void calcularSalarioMes() {
        System.out.println(getSalario());
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }

    @Override
    public void realizarTrabajo() {

    }
}
