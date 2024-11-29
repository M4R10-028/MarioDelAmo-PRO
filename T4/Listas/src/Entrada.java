import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Entrada {
    private static ArrayList <Integer> listaNumeros = new ArrayList<>();
    private static ArrayList <String> listaPalabras = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*System.out.println("Utilizando listas");
        System.out.println("El tamaño inicial de la lista es: " + listaNumeros.size());

        anadirNumero(13);
        anadirNumero(23);
        anadirNumero(98);
        anadirNumero(23);

        obtenerDatos();*/
        listaPalabras.add("Palabra 1");
        listaPalabras.add("Palabra 2");
        listaPalabras.add("Palabra 3");
        listaPalabras.add("Palabra 4");
        listaPalabras.add("Palabra 51");
        listaPalabras.add("Palabra 52");
        listaPalabras.add("Palabra 53");
        listaPalabras.add("Palabra 54");

        listaPalabras.set(3,"Palabra 41");
        listaPalabras.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                /*if (s.contains("5")){
                    return true;
                } else {
                    return false;
                }*/
                return s.contains("5");
            }
        });

        for ( String item : listaPalabras ) {
            System.out.print(item + "   ");
        }
    }
    public static void obtenerDatos(){
        //System.out.println("El último numero de la lista es: " + listaNumeros.get(listaNumeros.size() - 1));
        System.out.println("Todos los elementos del array");
        for ( int item : listaNumeros ) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    public static void anadirNumero(int numero){
        if (listaNumeros.contains(numero) == true){
            System.out.println("El numero ya está en la lista, estas seguro que quieres añadirlo");
            String respuesta = scanner.next();

            if (respuesta.equalsIgnoreCase("si")){
                listaNumeros.add(numero);
            } else {
                System.out.println("Numero no añadido");
            }
        } else {
            listaNumeros.add(numero);
            System.out.println("Numero añadido correctamente");
        }
    }

    //TODO cambiar el retorno al indice donde está el repetido
    public static int encontrarNumero(int numero){
        for (int i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i) == numero){
                return i;
            }
        }
        return -1;
    }
}
