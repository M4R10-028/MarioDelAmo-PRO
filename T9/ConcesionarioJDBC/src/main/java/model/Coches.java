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
}
