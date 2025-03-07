import controller.Restaurante;
import model.Bebida;
import model.Cliente;
import model.Comida;
import model.Racion;
import util.Proveedor;

import java.util.Scanner;

public class Entrada {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
/*
        Bebida bebida = new Bebida("Cerveza", 2, 300);
        Racion racion = new Racion("Patatas", 4, 1);
        Comida comida = new Comida("Bocadillo", 3, 450);

        bebida.mostrarDatos();
        racion.mostrarDatos();
        comida.mostrarDatos();
*/

        Restaurante restaurante = new Restaurante(Proveedor.COMIDASSL);
        restaurante.informacionProveedor();

        restaurante.agregarCliente(new Cliente("Borja"));
        restaurante.agregarCliente(new Cliente("Carlos"));
        restaurante.agregarCliente(new Cliente("Borja"));
        restaurante.agregarPedido(new Bebida("Cocacola",3,300),"Borja");
        restaurante.agregarPedido(new Racion("Cocacola",3,300),"Borja");
        restaurante.agregarPedido(new Comida("Bocata",5,600),"Carlos");
/*
        restaurante.pedirCuenta("Borja");
        restaurante.pedirCuenta("Carlos");
        restaurante.mostrarCliente();
        restaurante.mostrarCajaRestaurante()

*/


    }
}
