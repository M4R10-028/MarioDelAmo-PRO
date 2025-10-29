package org.example.formularioapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {

    private String nombre, correo, localizacion, genero;
    private int edad;
    private boolean disponibilidad;

    public Usuario(String nombre, String correo, String localizacion, String genero, int edad, boolean disponibilidad) {
        this.nombre = nombre;
        this.correo = correo;
        this.localizacion = localizacion;
        this.genero = genero;
        this.edad = edad;
        this.disponibilidad = disponibilidad;
    }
}
