import model.Persona;
import model.Tarea;

public class Main {
    public static void main(String[] args) {
        Tarea tarea = new Tarea("Practica 01", "Este practica de DI es de hacer un programa todolist", 6);

        tarea.asignarPersona(new Persona("Alejandro","Cano Caballero","1234A",19));
        tarea.asignarPersona(new Persona("Daniel","Cano Caballero","1234B",17));
        tarea.asignarPersona(new Persona("Pilar","Cano Caballero","1234C",14));
        tarea.quitarResponsable("1234B");
        tarea.mostrarResponsables();
    }
}
