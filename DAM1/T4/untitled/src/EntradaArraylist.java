import java.util.ArrayList;

public class EntradaArraylist {
    public static void main(String[] args) {
        ArrayList <Integer> lista = new ArrayList();

        lista.add(20);
        lista.add(3);

        //lista.set("posición","int")
        lista.set(1,80);

        /* 1. Se borra la posición puesta

        * Ejemplo:
        * [20,80]
        * lista.remove(0) -> [80]
        * El numero que estaba en la posicion 1 ha pasado a la posición 0 porque hemos borrado el numero de la derecha.

         2. Borro directamente el objeto

         Ejemplo:
         ["Hola", "Adios", "dia"]
         lista.remove("dia")
         ["Hola","Adios"]

         < Si estamos en el caso de que la lista es Integer, lista.remove(2) borrara la posición en vez del numero 2 >*/
        lista.remove(0);

        //Para sacar un numero
        lista.get(0);

        //Para ver si esta un elemento dentro de la lista
        lista.contains(80);

        //Para saber la longitud de la lista
        lista.size();
        //(Tmabién sirve para comprobar si tiene algún valor dentro) Aunque también se puede comprobar eso con:
        lista.isEmpty();

        //Para borrar la lista entera
        lista.clear();

    }
}
