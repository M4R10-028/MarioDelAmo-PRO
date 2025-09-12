package Ejercicio3.model;

public class Profesor {

    public Profesor(){}

    public void ponerNotas(Ejercicio3.model.Alumno alumno){
        alumno.getAsignatura1().setCalificacion(Math.random()*11);
        alumno.getAsignatura2().setCalificacion(Math.random()*11);
        alumno.getAsignatura3().setCalificacion(Math.random()*11);
    }
    public double calcularMedia(Ejercicio3.model.Alumno alumno){
        double nota1 = alumno.getAsignatura1().getCalificacion();
        double nota2 = alumno.getAsignatura2().getCalificacion();
        double nota3 = alumno.getAsignatura3().getCalificacion();

        return (nota1 + nota2 + nota3) / 3;
    }
}
