package model;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Coches implements Serializable {
    private int id, precio, plazas;
    private String marca, modelo, matricula, color;

    public Coches(int precio, int plazas, String marca, String modelo, String matricula, String color) {
        this.precio = precio;
        this.plazas = plazas;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.color = color;
    }

    public String getCoche(){
        return (getMarca() + "," + getModelo() + "," + getMatricula() + "," + getColor() + "," + getPrecio() + "," + getPlazas());
    }
}
