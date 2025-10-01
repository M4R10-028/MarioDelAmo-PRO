import controller.Plataforma;
import model.ClasificacionEdad;
import model.VideojuegoAccion;
import model.VideojuegoEstrategia;
import model.VideojuegoRPG;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();

        plataforma.agregarJuego(new VideojuegoAccion("Accion1", "Desarrolladora1", 2020, 59.99, ClasificacionEdad.PEGI3, 2, false, 60));
        plataforma.agregarJuego(new VideojuegoAccion("Accion2", "Desarrolladora2", 2023, 79.99, ClasificacionEdad.PEGI16, 4, true, 85));
        plataforma.agregarJuego(new VideojuegoEstrategia("Estrategia1", "Desarrolladora2", 2019, 49.99, ClasificacionEdad.PEGI7, 3, 40, 45.8));
        plataforma.agregarJuego(new VideojuegoEstrategia("Estrategia2", "Desarrolladora 1", 2021, 39.99, ClasificacionEdad.PEGI16, 2, 25, 37.65));
        plataforma.agregarJuego(new VideojuegoRPG("RPG1", "Desarrolladora3", 2017, 59.99, ClasificacionEdad.PEGI18, true, 35, 67.80));
        plataforma.agregarJuego(new VideojuegoRPG("RPG2", "Desarrolladora1", 2018, 79.99, ClasificacionEdad.PEGI16, false, 42, 89.50));

        int opcion = 0;
        do {
            System.out.println("1. Ver juegos disponibles");
            System.out.println("2. Filtrar Juegos por tipo (Accion / Estrategia / RPG)");
            System.out.println("3. Filtrar Juegos por Clasificacion de Edad PEGI (3 / 7 / 16 / 18)");
            System.out.println("4. Ver detalles de un Juego en especifico");
            System.out.println("5. Calcular tiempo de descarga");
            System.out.println("6. Calcular precio total de los juegos");
            System.out.println("7. Añadir juego a carrito de compra");
            System.out.println("8. Mostrar total carrito");
            System.out.println("9. Salir");
            System.out.println("Selecciona una opcion: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    plataforma.mostrarJuegos();
                    break;
                case 2:
                    System.out.println("Que tipo de juegos quieres filtrar");
                    String tipo = sc.next();
                    plataforma.filtrarPorTipo(tipo);
                    break;
                case 3:
                    System.out.println("Introduce la clasificacion");
                    String clasificacionEdad = sc.next();
                    if (clasificacionEdad == "PEGI3"){
                        plataforma.filtrarClasificacionEdad(ClasificacionEdad.PEGI3);
                    }
                    if (clasificacionEdad == "PEGI7") {
                        plataforma.filtrarClasificacionEdad(ClasificacionEdad.PEGI7);
                    }
                    if (clasificacionEdad == "PEGI16") {
                        plataforma.filtrarClasificacionEdad(ClasificacionEdad.PEGI16);
                    }
                    if (clasificacionEdad == "PEGI18") {
                        plataforma.filtrarClasificacionEdad(ClasificacionEdad.PEGI18);
                    }

                    break;
                case 4:

                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                default:
                    break;
            }

        } while(opcion != 9);
    }
}
