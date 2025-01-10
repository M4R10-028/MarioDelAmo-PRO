import model.Coche;

public class Entrada {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Coche coche2 = new Coche("Ford","Focus","Gris");
        Coche coche3 = new Coche("Opel","Corsa","Negro");
        Coche coche4 = new Coche("Mercedes","GLC","Gris", "1234A", 230, 30000, "A123");

        //quiero sacar solo la marca del coche 3
        System.out.println("La marca del coche 3 es: " + coche3.getMarca() + "\n");

        System.out.println("Datos del coche 1:");
        coche1.mostrarDatos();
        coche1.setMarca("Seat");
        coche1.mostrarDatos();
        System.out.println();
        System.out.println("Datos del coche 2:");
        coche2.mostrarDatos();
        System.out.println();
        System.out.println("Datos del coche 3:");
        coche3.mostrarDatos();
        System.out.println("\nDatos del coche 4:");
        coche4.mostrarDatos();

    }
}
