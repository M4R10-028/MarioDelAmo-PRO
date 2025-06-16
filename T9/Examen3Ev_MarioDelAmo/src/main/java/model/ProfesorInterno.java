package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProfesorInterno extends Profesor{
    private int complementoFijoAnual;

    public ProfesorInterno(String nombre, String dni, int salarioTotal, int salarioBase) {
        super(nombre, dni, salarioTotal, salarioBase);
        calcularSalario();
    }

    public void calcularSalario(){
        setSalarioTotal((complementoFijoAnual * 12) + getSalarioBase());
    }
}
