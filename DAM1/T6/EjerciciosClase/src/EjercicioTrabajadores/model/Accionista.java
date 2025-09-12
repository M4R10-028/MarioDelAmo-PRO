package EjercicioTrabajadores.model;

public class Accionista extends Persona implements Beneficiario{
    private int acciones;

    public Accionista() {
    }

    public Accionista(String nombre, String apellido, String dni, int acciones) {
        super(nombre, apellido, dni);
        this.acciones = acciones;
    }

    @Override
    public void repartirBeneficios(int beneficio) {
        double beneficioTotal = beneficio * acciones;
    }
}
