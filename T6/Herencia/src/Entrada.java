import model.Coche;
import model.Motor;
import model.Vehiculo;

public class Entrada {
    public static void main(String[] args) {
        //Vehiculo vehiculo = new Vehiculo();
        Coche coche = new Coche(new Motor(200, 20), "XYZ789", "delantera");
        coche.mostrarDatos();
    }
}
