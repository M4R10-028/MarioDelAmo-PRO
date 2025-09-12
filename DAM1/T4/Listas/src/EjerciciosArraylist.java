import java.lang.reflect.Array;
import java.util.*;

public class EjerciciosArraylist {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList <String> listaPalabras = new ArrayList<>();
    private static ArrayList <Integer> listaNumeros = new ArrayList<>();

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        
    }
    public static void ejercicio1(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Dime la " + ( i + 1 ) + " palabra que quieres guardar");
            listaPalabras.add(scanner.next());
        }
        imprimir(listaPalabras);
    }
    public static void ejercicio2(){
        int sumatorio = 0;
        int mayor = 0;
        int menor = 100;
        for (int i = 0; i < 5; i++) {
            listaNumeros.add((int)(Math.random() * 101));

            if (listaNumeros.get(i) > mayor ){
                mayor = listaNumeros.get(i);
            }

            if (listaNumeros.get(i) <= menor){
                menor = listaNumeros.get(i);
            }

            sumatorio += listaNumeros.get(i);
        }
        System.out.println("El sumatorio es " + sumatorio);
        System.out.println("La media es " + sumatorio / listaNumeros.size());
        System.out.println("El numero mayor de la lista es " + mayor);
        System.out.println("El numero menor de la lista es " + menor);
    }
    public static void ejercicio3(){
        ArrayList <String> listaCompaneros = new ArrayList<>();

        listaCompaneros.add("Manuel");
        listaCompaneros.add("Sandra");
        listaCompaneros.add("María");
        listaCompaneros.add("Ángel");
        listaCompaneros.add("Jesús");

        System.out.println(listaCompaneros.get((int) (Math.random()*listaCompaneros.size())));
    }
    public static void ejercicio4(){
        ArrayList <Integer> listaN1 = new ArrayList<>();
        ArrayList <Integer> listaN2 = new ArrayList<>();
        ArrayList <Integer> numeros = new ArrayList<>();
        ArrayList <Integer> posicion = new ArrayList<>();

        rellenarArray(listaN1,20);
        rellenarArray(listaN2,20);

        for (int i = 0; i < 20; i++) {
            if (listaN1.get(i) == listaN2.get(i)){
                numeros.add(listaN1.get(i));
                posicion.add(i);
            }
        }
        System.out.println("Los numeros que se repiten");
        imprimir(numeros);
        System.out.println();
        System.out.println("Las posiciones en las que se repiten");
        imprimir(posicion);
    }
    //TODO el ejercicio no da lo que realmente tendría que dar
    public static void ejercicio5(){
        ArrayList <String> palabras = new ArrayList<>();

        palabras.add("Hola");
        palabras.add("Adios");
        palabras.add("Que");
        palabras.add("Muchachos");
        palabras.add("guay");
        palabras.add("Bien");
        palabras.add("Buena");
        palabras.add("Chulísimo");
        palabras.add("Increible");
        palabras.add("Fantástico");

        String mayor = palabras.get(0);
        String menor = palabras.get(0);

        for (int i = 0; i < palabras.size(); i++) {
            if (palabras.get(i).length() <= menor.length()){
                menor = palabras.get(i);
            }
            if (palabras.get(i).length() >= mayor.length()){
                mayor = palabras.get(i);
            }
        }
        for ( String item : palabras ) {
            int i = 1;
            System.out.print("Longitud de la palabra " + i );
            i++;
            System.out.println(" " + item.length());
        }

        ordenarLista(palabras);

        for ( String item : palabras ) {
            System.out.println(palabras);
        }

        System.out.println("La palabra con mas letras es " + mayor);
        System.out.println("La palabra con menos letras es " + menor);
    }

    public static void rellenarArray(ArrayList <Integer> lista, int numero){
        for (int i = 0; i < numero; i++) {
            lista.add(( int )( Math.random() * (numero + 1) ));
        }
    }

    public static void imprimir(ArrayList objetos){
        for ( Object item : objetos ) {
            System.out.print(item + "   ");
        }
    }

    public static int repetidos (ArrayList <Integer> lista1, ArrayList <Integer> lista2) {
        int repetidos = 0;
        for (int i = 0; i < lista1.size(); i++) {
            if (lista1.get(i) == lista2.get(i)){
                repetidos++;
            }
        }
        return repetidos;
    }
    public static void ordenarLista(ArrayList <String> lista){
        Collections.sort(lista);//ordenados alfabeticamente
        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()){
                return 1;
                }if (o1.length() < o2.length()){
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }
}
