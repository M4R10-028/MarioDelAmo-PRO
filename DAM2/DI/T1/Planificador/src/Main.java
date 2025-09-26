import controller.Planificador;
import model.Prioridad;
import model.Tarea;
import model.TareasOcio;
import model.TareasTrabajo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        Planificador planificador = new Planificador();

        do {
            System.out.println("Elige una opcion:");
            System.out.println("1. Registrar Tarea");
            System.out.println("2. Modificar Tarea");
            System.out.println("3. Listar Tareas");
            System.out.println("4. Completar Tarea");
            System.out.println("5. Listar Completas");
            System.out.println("6. Listar Incompletas");
            System.out.println("7. Salir");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    int idT, prioridadT;
                    String tituloT, descripcionT, fechaT, ubicacionT, proyectoT;
                    double presupuestoT;
                    Prioridad prio;


                    int opTarea;
                    System.out.println("Quieres crear una tarea ocio (1) / tarea trabajo (2)");
                    opTarea = sc.nextInt();

                    System.out.println("Introduce id");
                    idT = sc.nextInt();
                    System.out.println("Introduce el titulo");
                    tituloT = sc.next();
                    System.out.println("Introduce la descripcion");
                    descripcionT = sc.nextLine();
                    System.out.println("Introduce la fecha");
                    fechaT = sc.next();
                    System.out.println("Introduce la prioridad (Baja(1) / Media(2) / Alta(3))");
                    prioridadT = sc.nextInt();
                    if (prioridadT == 1){
                        prio = Prioridad.Baja;
                    } else if (prioridadT == 2) {
                        prio = Prioridad.Media;
                    } else if (prioridadT == 3) {
                        prio = Prioridad.Alta;
                    } else {
                        System.out.println("Como esa prioridad no existe se pone automaticamente de prioridad media");
                        prio = Prioridad.Media;
                    }

                    if (opTarea == 1){
                        System.out.println("Introduce la ubicacion");
                        ubicacionT = sc.next();
                        System.out.println("Introduce el presupuesto");
                        presupuestoT = sc.nextDouble();

                        planificador.agregarTarea(new TareasOcio(idT,tituloT,descripcionT,fechaT,prio,ubicacionT,presupuestoT));

                    } else if (opTarea == 2){
                        System.out.println("Introduce el proyecto");
                        proyectoT = sc.nextLine();

                        planificador.agregarTarea(new TareasTrabajo(idT,tituloT,descripcionT,fechaT,prio,proyectoT));
                    }
                    break;
                case 2:
                    int id, cambio;
                    System.out.println("Introduce el id de la tarea que quieres modificar");
                    id = sc.nextInt();

                    System.out.println("Que campo quieres modificar (Titulo (1) / Descripcion (2) / Fecha (3) / Prioridad (4) / Ubicacion (5) / Presupuesto (6) / Proyecto (7))");
                    cambio = sc.nextInt();


                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    break;
            }
        } while(opcion != 7);
    }
}
