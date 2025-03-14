package model;

public class Cita {
    private String fechaCita;
    private String especialidadCita;
    private Doctor doctor;
    private Paciente paciente;

    public Cita() {
    }

    public Cita(String fechaCita, String especialidadCita, Doctor doctor, Paciente paciente) {
        this.fechaCita = fechaCita;
        this.especialidadCita = especialidadCita;
        this.doctor = doctor;
        this.paciente = paciente;
    }

    public void mostrarDatosCita(){
        System.out.println("fechaCita = " + fechaCita);
        System.out.println("especialidadCita = " + especialidadCita);
        System.out.println("doctor = " + doctor);
        System.out.println("paciente = " + paciente);
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getEspecialidadCita() {
        return especialidadCita;
    }

    public void setEspecialidadCita(String especialidadCita) {
        this.especialidadCita = especialidadCita;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
