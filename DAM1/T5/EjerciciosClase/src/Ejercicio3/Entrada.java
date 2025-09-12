package Ejercicio3;

import Ejercicio3.model.Alumno;
import Ejercicio3.model.Asignatura;
import Ejercicio3.model.Profesor;

public class Entrada {
    public static void main(String[] args) {
        Asignatura programacion = new Asignatura(1);
        Asignatura sistemas = new Asignatura(2);
        Asignatura lenguaje = new Asignatura(3);

        Alumno alumno1 = new Alumno(1,2,3);
        Alumno alumno2 = new Alumno(1,2,3);

        Profesor profesor = new Profesor();

        profesor.ponerNotas(alumno1);
        profesor.ponerNotas(alumno2);
        System.out.println("La nota del alumno 1 en la asignatura programacion es " + alumno1.getAsignatura1().getCalificacion());
        System.out.println("La nota del alumno 2 en la asignatura programacion es " + alumno2.getAsignatura1().getCalificacion());

        System.out.println(profesor.calcularMedia(alumno1));
        System.out.println(profesor.calcularMedia(alumno2));


    }
}
