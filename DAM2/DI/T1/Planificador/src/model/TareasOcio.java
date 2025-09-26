package model;

public class TareasOcio extends Tarea{
    private String ubicacion;
    private double presupuesto;

    public TareasOcio() {
    }

    public TareasOcio(int id, String titulo, String descripcion, String fecha, Prioridad prioridad, String ubicacion, double presupuesto) {
        super(id, titulo, descripcion, fecha, prioridad);
        this.ubicacion = ubicacion;
        this.presupuesto = presupuesto;
    }
}
