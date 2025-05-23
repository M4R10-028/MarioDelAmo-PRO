package model;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Pasajeros implements Serializable {
    private int id, edad, peso, id_coche;
    private String nombre;
}
