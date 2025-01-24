import controller.Carrera;

import java.util.Scanner;

public class Entrada {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int vueltas;
        String nombreCarrera;

        System.out.println("Dime el nombre de la carrera");
        nombreCarrera = sc.next();

        System.out.println("Dime las vueltas de la carrera");
        vueltas = sc.nextInt();
        Carrera carrera1 = new Carrera(3, "nurburing");

        carrera1.inscribirParticipante("Ford", "Focus", "1234A", 200);
        carrera1.inscribirParticipante("Ford", "Focus", "1234A", 200);
        carrera1.inscribirParticipante("Ford", "Focus", "1234C", 200);
        carrera1.inscribirParticipante("Ford", "Focus", "1234D", 200);
        carrera1.inscribirParticipante("Ford", "Focus", "1234E", 200);
        carrera1.inscribirParticipante("Ford", "Focus", "1234F", 200);
        carrera1.inscribirParticipante("Ford", "Focus", "1234G", 200);
        carrera1.inscribirParticipante("Ford", "Focus", "1234H", 200);
        carrera1.inscribirParticipante("Ford", "Focus", "1234I", 200);

        carrera1.desinscribirParticipante("1234F");

        carrera1.mostrarParticipantes();

        carrera1.iniciarCarrera();

        carrera1.mostrarGanador();

        carrera1.mostrarClasificacion();
    }
}
