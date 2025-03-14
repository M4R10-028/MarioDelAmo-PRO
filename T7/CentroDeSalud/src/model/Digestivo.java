package model;

public class Digestivo extends Doctor implements Especialidad{
    private int anosExperiencia;

    public Digestivo() {
    }

    public Digestivo(String nombre, String apellido, int numeroColegiado, int anosExperiencia) {
        super(nombre, apellido, numeroColegiado);
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("anosExperiencia = " + anosExperiencia);
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
}
