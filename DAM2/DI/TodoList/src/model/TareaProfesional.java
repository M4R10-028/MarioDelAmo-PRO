package model;

import java.util.Date;

public class TareaProfesional extends Tarea{
    private int presupuesto;
    private Date fechaLimite;

    public TareaProfesional() {}

    public TareaProfesional(String titulo, String descripcion, int encargados, int presupuesto, Date fechaLimite) {
        super(titulo, descripcion, encargados);
        this.presupuesto = presupuesto;
        this.fechaLimite = fechaLimite;
    }

    public TareaProfesional(String titulo, String descripcion, boolean prioritario, int encargados, int presupuesto, Date fechaLimite) {
        super(titulo, descripcion, prioritario, encargados);
        this.presupuesto = presupuesto;
        this.fechaLimite = fechaLimite;
    }

    @Override
    public void enviarRecordatorio() {
        for (int i = 0; i < getPersonas().length - 1; i++) {
            System.out.println(getPersonas()[i].getNombre() + ", recuerda que tienes esta tarea");
        }
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    @Override
    public String toString() {
        return super.toString() + "TareaProfesional{" +
                "presupuesto=" + presupuesto +
                ", fechaLimite=" + fechaLimite +
                '}';
    }
}
