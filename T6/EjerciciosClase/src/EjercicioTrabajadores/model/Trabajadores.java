package EjercicioTrabajadores.model;

abstract public class Trabajadores extends Persona{
    private double salario;

    public Trabajadores() {
    }

    public Trabajadores(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
    }

    public Trabajadores(String nombre, String apellido, String dni, double salario) {
        super(nombre, apellido, dni);
        this.salario = salario;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("salario = " + salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
