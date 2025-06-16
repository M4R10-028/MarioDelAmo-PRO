package model;

import lombok.*;

import java.io.Serializable;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Profesor implements Serializable {
    private String nombre, dni;
    private int salarioTotal, salarioBase;

    public Profesor(String nombre, String dni, int salarioBase) {
        this.nombre = nombre;
        this.dni = dni;
        this.salarioBase = salarioBase;
        this.salarioTotal = 0;
    }

    public String mostrarDatosCSV(){
        return getNombre()+","+getDni()+","+getSalarioTotal();
    }
}
