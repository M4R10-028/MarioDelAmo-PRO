import java.util.Scanner;

public class Ejercicio2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean calif = false;
        int opcion;
        int num, suspenso = 0;
        String guardar;
        int guardado;
        System.out.println("Dime cuantos alumnos hay en la clase");
        num = scanner.nextInt();

        Object[][] alumnos = new Object[num][2];

        for (int i = 0; i < num; i++) {
            System.out.println("Dime el nombre del alumno " + (i + 1));
            alumnos[i][0] = scanner.next();
        }

        while (calif != true){
            System.out.println("Quieres empezar a calificar a los alumnos");
            calif = scanner.nextBoolean();

            if (calif){
                for (int i = 0; i < num; i++) {
                    alumnos[i][1] = (int)(Math.random() * 11);
                }
            } else {
                System.out.println("No se está calificando");
            }
        }

        do {
            System.out.println("1. Ver suspensos");
            System.out.println("2. Ver Calificaciones");
            System.out.println("3. Salir");
            System.out.println("Que opcion quieres realizar");
            opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    for (int i = 0; i < num; i++) {
                        if ((int)alumnos[i][1] < 5){
                            System.out.println(alumnos[i][0] + " -> " + alumnos[i][1]);
                            suspenso += 1;
                        }
                    }
                    if (suspenso == 0){
                        System.out.println("No hay suspensos");
                    }
                    break;
                case 2:
                    for (int i = 0; i < num; i++) {
                        for (int j = 0; j < num-1; j++) {
                            if ((int)alumnos[j][1] > (int)alumnos[j + 1][1]){
                                guardar = (String)alumnos[j + 1][0];
                                guardado = (int)alumnos[j + 1][1];

                                alumnos[j + 1][0] = alumnos[j][0];
                                alumnos[j + 1][1] = alumnos[j][1];

                                alumnos[j][0] = guardar;
                                alumnos[j][1] = guardado;
                            }
                        }
                    }
                    for (int i = 0; i < num; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print(alumnos[i][j] + " - ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Esa no es una opcion");
                    break;
            }
        }while (opcion != 3);
    }
}
