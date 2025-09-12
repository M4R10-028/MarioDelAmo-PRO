import model.*;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        Asalariado asalariado = new Asalariado("Borja", "Martín",12345,30000, 0.21,14);
        Autonomo autonomo = new Autonomo("Alejandro","Cano",54321,30000,200);
        Jefe jefe = new Jefe("Mario","DelAmo",21435,40000);


        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        trabajadores.add(asalariado);
        trabajadores.add(autonomo);

        for ( Trabajador item : trabajadores ) {
            item.calcularSalarioMes();
            if (item instanceof Empleador){
                if (((Empleador) item).realizarTrabajo(4)){
                    System.out.println("Trabajo realizado");
                } else {
                    System.out.println("Trabajo no realizado");
                }

            }
            if (item instanceof Sindicador){
                ((Sindicador) item).realizarHuelga();
            }
        }
    }
}
