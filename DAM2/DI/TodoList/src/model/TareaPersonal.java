package model;

public class TareaPersonal extends Tarea{

    private String ubicacion;

    public TareaPersonal() {
    }

    @Override
    public void enviarRecordatorio() {
        System.out.println("Enviar un recordatorio a " + ubicacion);
    }

    public TareaPersonal(String titulo, String descripcion, boolean prioritario, int encargados, String ubicacion) {
        super(titulo, descripcion, prioritario, encargados);
        this.ubicacion = ubicacion;
    }

    public TareaPersonal(String titulo, String descripcion, int encargados, String ubicacion) {
        super(titulo, descripcion, encargados);
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return super.toString() + "TareaPersonal{" +
                "ubicacion='" + ubicacion + '\'' +
                '}';
    }
}
