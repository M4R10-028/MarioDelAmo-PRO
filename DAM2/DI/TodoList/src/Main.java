import model.Encargo;
import model.Persona;
import model.Tarea;

public class Main {
    public static void main(String[] args) {
        Tarea tarea = new Tarea("Practica 01", "Este practica de DI es de hacer un programa todolist", 6);

        //tarea.asignarPersona(new Persona("Alejandro","Cano Caballero","1234A",19));
        //tarea.asignarPersona(new Persona("Daniel","Cano Caballero","1234B",17));
        //tarea.asignarPersona(new Persona("Pilar","Cano Caballero","1234C",14));
        //tarea.quitarResponsable("1234B");
        //tarea.mostrarResponsables();

        tarea.agregarEncargo(new Encargo("Planificar entrega",1));
        tarea.agregarEncargo(new Encargo("Codificar la entrega",2));
        tarea.agregarEncargo(new Encargo("Grabar video",3));
        tarea.agregarEncargo(new Encargo("Subir entrega",4));
        tarea.eliminarEncargo(4);
        tarea.agregarEncargo(new Encargo("Subir entrega",4));
        tarea.mostrarEncargos();
        tarea.buscarEncargoId(2);
        tarea.completarEncargo(1);
        tarea.completarEncargo(2);
        tarea.completarEncargo(3);
        tarea.mostrarCompletados();
        tarea.completarEncargo(4);
        tarea.completarTarea(tarea);


    }
}
