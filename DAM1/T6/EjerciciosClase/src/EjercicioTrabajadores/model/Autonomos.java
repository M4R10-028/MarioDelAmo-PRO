package EjercicioTrabajadores.model;

final public class Autonomos extends Trabajadores {
    private boolean contratado;

    public Autonomos() {
    }

    public Autonomos(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
    }

    public Autonomos(String nombre, String apellido, String dni, double sueldo, boolean contratado) {
        super(nombre, apellido, dni, sueldo);
        this.contratado = contratado;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("contratado = " + contratado);
    }

    public boolean isContratado() {
        return contratado;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }
}
