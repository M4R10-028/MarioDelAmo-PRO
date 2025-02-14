import controller.Coleccion;
import model.Elemento;
import model.Libro;
import model.Persona;
import model.Video;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        String objeto;
        String id;
        Coleccion coleccion = new Coleccion();
        String nombre, dni, dnia, nombrea, titulo, formato, dniAutor;
        ArrayList <Persona> actores = new ArrayList<>();
        int nActores, tamanio, npag, listar;
        Persona persona = new Persona();
        Elemento elemento = new Elemento();
        String autor, ISBN;


        do {
            System.out.println("1. Añadir a la colección");
            System.out.println("2. Eliminar de la colección");
            System.out.println("3. Listar Colección");
            System.out.println("4. Salir");
            System.out.println("Dime la opcion que quieres ejecutar");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Que elemento quieres añadir(video / libro / audio)");
                    objeto = sc.next();
                    if (objeto.equalsIgnoreCase("video")) {
                        System.out.println("Dime el identificador del video");
                        id = sc.next();
                        System.out.println("Dime el nombre del director del video");
                        nombre = sc.next();
                        System.out.println("Dime el dni del director del video");
                        dni = sc.next();
                        System.out.println("Cuantos actores hay en el video");
                        nActores = sc.nextInt();
                        for (int i = 0; i < nActores; i++) {
                            System.out.println("Dime el dni del actor que quieres guardar");
                            dnia = sc.next();
                            System.out.println("Dime el nombre del actor que quieres guardar");
                            nombrea = sc.next();
                            actores.add(new Persona(dnia,nombrea));
                        }
                        System.out.println("Dime el titulo del video");
                        titulo = sc.next();
                        System.out.println("Dime el formato del video");
                        formato = sc.next();
                        System.out.println("Dime el tamaño que ocupa tu video");
                        tamanio = sc.nextInt();
                        System.out.println("Dime el nombre del autor del video");
                        autor = sc.next();
                        System.out.println("Dime el dni del autor del video");
                        dniAutor = sc.next();
                        coleccion.agregarElemento(new Video(id,titulo,formato,new Persona(autor,dniAutor),tamanio, new Persona(nombre,dni),actores));
                        break;
                    } else if (objeto.equalsIgnoreCase("libro")) {
                        System.out.println("Dime el identificador del libro");
                        id = sc.next();
                        System.out.println("Cuanto ocupa tu libro");
                        tamanio = sc.nextInt();
                        System.out.println("Dime el nombre del director del libro");
                        ISBN = sc.next();
                        System.out.println("Dime el titulo del libro");
                        titulo = sc.next();
                        System.out.println("Dime el formato del libro");
                        formato = sc.next();
                        System.out.println("Dime el numero de paginas que tiene tu libro");
                        npag = sc.nextInt();
                        System.out.println("Dime el nombre del autor del video");
                        autor = sc.next();
                        System.out.println("Dime el dni del autor del video");
                        dniAutor = sc.next();
                        coleccion.agregarElemento(new Libro(id,titulo,formato,new Persona(autor,dniAutor),tamanio,ISBN,npag));
                        break;
                    } else if (objeto.equalsIgnoreCase("audio")) {

                    } else {
                        System.out.println("Ese no es un objeto válido");
                    }
                    break;
                case 2:
                    System.out.println("Dime el identificador del elemento que quieres eliminar");
                    id = sc.next();
                    coleccion.eliminarElemento(id);
                    break;
                case 3:
                    System.out.println("Dime que tipo de elementos quieres que te muestre (Libro:0 / Audio:1 / Video:2 / Todos:3 )");
                    listar = sc.nextInt();
                    coleccion.listarElementos(listar);
                    break;
                default:
                    System.out.println("Esa no es una opcion valida");
                    break;
            }
        } while (opcion != 4);
    }
}
