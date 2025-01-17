import java.util.ArrayList;
import java.util.Comparator;

public class Controladora1 {
    private ArrayList <Object[]> listaProductos;

    public Controladora1(){
        listaProductos = new ArrayList<>();
    }

    public void agregarProducto(String nombre, double precio){
        Object[] productos =  new Object[]{nombre,precio};
        listaProductos.add(productos);
    }

    public void listarProductos(){
        for (Object[] item : listaProductos) {
            System.out.println(item[0] + " - " + item[1] + "€");
        }
    }

    public void listarPrecioMinimo(double precio){
        for (Object[] item : listaProductos) {
            if ((double)item[1] >= precio){
                System.out.println("El nombre es " + item[0] + " el precio es " + item[1]);
            }
        }
    }

    public void listarOrdenado(){
        listaProductos.sort(new Comparator<Object[]>() {
            @Override
            public int compare(Object[] o1, Object[] o2) {
                // condicion de ordenacion
                if ((double)o1[1] > (double)o2[1]){
                    return 1;
                } else if ((double)o1[1] < (double) o2[1]) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        listarProductos();
    }
}
