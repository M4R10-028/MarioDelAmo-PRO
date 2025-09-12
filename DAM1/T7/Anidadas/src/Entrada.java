import model.ClasePadre;

public class Entrada {
    public static void main(String[] args) {
        ClasePadre clasepadre = new ClasePadre("Borja", "Martín", "Borja@gmail.com",40, null);
        clasepadre.mostrarDatos();
        System.out.println("------------------------------------------------");
        ClasePadre.ClaseHija claseHija = clasepadre.new ClaseHija("Celia", "Martín", "Celia@gmail.com", 10);
        //clasepadre.setHija(claseHija);
        clasepadre.mostrarDatos();
    }
}
