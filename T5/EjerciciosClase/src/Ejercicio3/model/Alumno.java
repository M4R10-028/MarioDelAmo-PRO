package Ejercicio3.model;

import Ejercicio3.model.Asignatura;

public class Alumno {

    private Asignatura asignatura1, asignatura2, asignatura3;

    public Alumno(){}

    public Alumno(Ejercicio3.model.Asignatura asignatura1, Ejercicio3.model.Asignatura asignatura2, Ejercicio3.model.Asignatura asignatura3){
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }

    public Alumno(int id1, int id2, int id3){
        //this.variableClase = id1
        //this.variable = valor por defecto
        //this.variable = calculo * 2 / 6
        this.asignatura1 = new Ejercicio3.model.Asignatura(id1);
        this.asignatura2 = new Ejercicio3.model.Asignatura(id2);
        this.asignatura3 = new Ejercicio3.model.Asignatura(id3);
    }

    public Ejercicio3.model.Asignatura getAsignatura1() {
        return asignatura1;
    }

    public void setAsignatura1(Ejercicio3.model.Asignatura asignatura1) {
        this.asignatura1 = asignatura1;
    }

    public Ejercicio3.model.Asignatura getAsignatura2() {
        return asignatura2;
    }

    public void setAsignatura2(Ejercicio3.model.Asignatura asignatura2) {
        this.asignatura2 = asignatura2;
    }

    public Ejercicio3.model.Asignatura getAsignatura3() {
        return asignatura3;
    }

    public void setAsignatura3(Ejercicio3.model.Asignatura asignatura3) {
        this.asignatura3 = asignatura3;
    }
}
