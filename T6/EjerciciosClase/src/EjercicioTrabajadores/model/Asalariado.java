package EjercicioTrabajadores.model;

final public class Asalariado extends Trabajadores{
    private int numeroPagas;
    private boolean contratado;

    public Asalariado() {
    }

    public Asalariado(String nombre, String apellido, String dni, double sueldo) {
        super(nombre, apellido, dni, sueldo);
    }

    public Asalariado(String nombre, String apellido, String dni, double sueldo, int numeroPagas, boolean contratado) {
        super(nombre, apellido, dni, sueldo);
        this.numeroPagas = numeroPagas;
        this.contratado = contratado;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("numeroPagas = " + numeroPagas);
        System.out.println("contratado = " + contratado);
    }

    public int getNumeroPagas() {
        return numeroPagas;
    }

    public void setNumeroPagas(int numeroPagas) {
        this.numeroPagas = numeroPagas;
    }

    public boolean isContratado() {
        return contratado;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }
}
