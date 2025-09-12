package model;

public class Traumatologia extends Doctor implements Especialidad{
    public Traumatologia() {
    }

    public Traumatologia(String nombre, String apellido, int numeroColegiado) {
        super(nombre, apellido, numeroColegiado);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }


}
