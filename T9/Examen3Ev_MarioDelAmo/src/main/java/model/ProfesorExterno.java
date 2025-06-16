package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProfesorExterno extends Profesor{
    private int numeroHoras, precioHora;

    public ProfesorExterno(String nombre, String dni, int salarioTotal, int salarioBase) {
        super(nombre, dni, salarioTotal, salarioBase);
        calcularSalario();
    }

    public void calcularSalario(){
        setSalarioTotal((numeroHoras * precioHora) + getSalarioBase());
    }
}
