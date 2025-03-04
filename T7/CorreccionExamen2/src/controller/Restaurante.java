package controller;

import model.Cliente;
import model.Consumicion;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurante {
    static Scanner sc = new Scanner(System.in);
    private ArrayList<Cliente> listaClientes;
    private double caja;

    public Restaurante(){
        listaClientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        if (listaClientes.isEmpty()) {
            System.out.println("Bienvenido al restaurante");
            listaClientes.add(cliente);
        } else {
            if (buscarCliente(cliente.getNombre()) != null) {
                System.out.println("Este cliente ya esta en el restaurante");
            } else {
                System.out.println("Bienvenido al restaurante");
                listaClientes.add(cliente);
            }
        }
    }

    public void mostrarCliente(){
        for ( Cliente cliente : listaClientes ) {
            cliente.mostrarDatos();
        }
    }

    private boolean estaConsumicion(String nombre, Cliente cliente){
        for (Consumicion consumicion : cliente.getConsumiciones()) {
            if (consumicion.getNombre().equals(nombre)){
                return true;
            }
        }
        return false;
    }

    public void agregarPedido(Consumicion consumicion, String nombre){
        Cliente cliente = buscarCliente(nombre);
        if (!estaConsumicion(consumicion.getNombre(), cliente)){
            agregarConsumicion(cliente,consumicion);

        } else {
            System.out.println("Veo que ya tienes una consumicion de este tipo, quieres repetir?");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("si")){
                System.out.println("Cuantas consumiciones quieres de mas");
                int numeroConsumiciones = sc.nextInt();

                if (numeroConsumiciones > 0){
                    for (int i = 0; i < numeroConsumiciones; i++) {
                        agregarConsumicion(cliente,consumicion);
                    }
                } else {
                    System.out.println("No puedes pedir esa cantidad");
                }

            } else {
                agregarConsumicion(cliente,consumicion);
            }
        }
    }
    private void agregarConsumicion(Cliente cliente, Consumicion consumicion){
        cliente.getConsumiciones().add(consumicion);
        cliente.incrementarFactura(consumicion.getPrecio());
    }

    private Cliente buscarCliente(String nombre){
        for (Cliente clientes : listaClientes) {
            if (clientes.getNombre().equalsIgnoreCase(nombre)){
                return clientes;
            }
        } return null;
    }

    public void mostrarDatosCliente(String nombre){
        Cliente cliente = buscarCliente(nombre);
        if (cliente == null){
            System.out.println("No se encuentra este cliente en la lista");
        } else {
            System.out.println("Sus consumiciones son");
            for (Consumicion consumicion : cliente.getConsumiciones()) {
                consumicion.mostrarDatos();
            }
        }
    }

    public void pedirCuenta(String nombre){
        Cliente cliente = buscarCliente(nombre);
        if (cliente == null){
            System.out.println("No se encuentra este cliente en la lista");
        } else {
            caja += cliente.getTotalFactura();
            System.out.println();
        }
    }

    public void mostrarCajaRestaurante(){
        System.out.println(caja);
    }
}
