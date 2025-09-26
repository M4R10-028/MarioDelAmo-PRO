package model;

public class TareasTrabajo extends Tarea{
    private String proyecto;

    public TareasTrabajo() {
    }

    public TareasTrabajo(int id, String titulo, String descripcion, String fecha, Prioridad prioridad, String proyecto) {
        super(id, titulo, descripcion, fecha, prioridad);
        this.proyecto = proyecto;
    }
}
