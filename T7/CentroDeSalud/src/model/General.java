package model;

public class General extends Doctor implements Especialidad{
    private Tipo tipo;

    public General() {
    }

    public General(String nombre, String apellido, int numeroColegiado, Tipo tipo) {
        super(nombre, apellido, numeroColegiado);
        this.tipo = tipo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo: " + tipo);
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
