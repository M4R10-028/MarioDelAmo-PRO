import model.Inventario;
import model.Producto;

public class Entrada {
    public static void main(String[] args) {
        OperacionesFicheros operacionesFicheros = new OperacionesFicheros();
        //operacionesFicheros.leerFicheroE1("src/recursos/ejercicio1.txt");
        //operacionesFicheros.leerFicheroE2("src/recursos/ejercicio2.txt");
        //operacionesFicheros.leerUsuario("src/recursos/ejercicio3.obj");
        Inventario<Producto> inventario = new Inventario<>();
        Producto producto1 = new Producto("Manzana", 1.23,13);
        Producto producto2 = new Producto("Platano", 2.11,21);
        Producto producto3 = new Producto("Arananos", 1.33,33);
        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);
        inventario.agregarProducto(producto3);
        inventario.mostrarProdutos();
    }
}
