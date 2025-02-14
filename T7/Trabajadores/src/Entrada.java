import model.Asalariado;
import model.Autonomo;
import model.Trabajador;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        Asalariado asalariado = new Asalariado("Borja", "Martín",12345,30000, 0.21,14);
        Autonomo autonomo = new Autonomo("Alejandro","Cano",54321,30000,200);



        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        trabajadores.add(asalariado);
        trabajadores.add(autonomo);

        for ( Trabajador item : trabajadores ) {
            item.calcularSalarioMes();
        }
    }
}
