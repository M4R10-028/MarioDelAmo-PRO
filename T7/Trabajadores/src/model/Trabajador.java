package model;

abstract public class Trabajador {
    private String nombre, apellido;
    private int numeroSSocial, salario;

    public Trabajador() {
    }

    public Trabajador(String nombre, String apellido, int numeroSSocial, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSSocial = numeroSSocial;
        this.salario = salario;
    }

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("numeroSSocial = " + numeroSSocial);
        System.out.println("salario = " + salario);
    }

    public abstract void calcularSalarioMes();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroSSocial() {
        return numeroSSocial;
    }

    public void setNumeroSSocial(int numeroSSocial) {
        this.numeroSSocial = numeroSSocial;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
