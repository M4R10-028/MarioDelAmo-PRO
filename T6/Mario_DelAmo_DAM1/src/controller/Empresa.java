package controller;

import model.Bici;
import model.Coche;
import model.Moto;
import model.Vehiculo;

import javax.swing.*;
import java.util.ArrayList;

public class Empresa {
    private ArrayList<Vehiculo> stock = new ArrayList<>();
    private double precioCaja;

    public Empresa(){}

    public void anadirVehiculo(Vehiculo vehiculo){
        if (stock.isEmpty()){
            stock.add(vehiculo);
            System.out.println("El vehiculo ha sido añadido al stock");
        } else {
            for ( Vehiculo item : stock) {
                if (item.getNumeroSerie() == vehiculo.getNumeroSerie()){
                    System.out.println("Este vehiculo ya esta añadido");
                    return;
                }
            }
            stock.add(vehiculo);
            System.out.println("El vehiculo ha sido añadido");
        }
    }

    public void venderVehiculo(int numeroSerie){
        for ( Vehiculo item : stock ) {
            if (item.getNumeroSerie() == numeroSerie){
                precioCaja += item.getPrecioVenta();
                stock.remove(item);
                System.out.println("El vehiculo se ha vendido");
                return;
            }
        }
        System.out.println("El vehiculo no se ha podido vender ya que no esta en el stock.");
    }

    public void repararVehiculo(Vehiculo vehiculo){
        if (vehiculo instanceof Coche || vehiculo instanceof Moto){
            System.out.println("El vehiculo no puede ser reparado debido a nuestras capacidades");
        } else {
            if (vehiculo instanceof Bici){
                vehiculo.setPrecioVenta(vehiculo.getPrecioVenta() * 1.05);
                System.out.println("El vehiculo ha sido reparado");
                anadirVehiculo(vehiculo);
            } else {
                vehiculo.setPrecioVenta(vehiculo.getPrecioVenta() * 1.1);
                System.out.println("El vehiculo ha sido reparado");
                anadirVehiculo(vehiculo);
            }
        }
    }

    public void buscarVehiculo(int numeroSerie){
        for ( Vehiculo item : stock ) {
            if (item.getNumeroSerie() == numeroSerie){
                item.mostrarDatos();
                return;
            }
        }
        System.out.println("El vehiculo no está en el stock");
    }

    public double getPrecioCaja() {
        return precioCaja;
    }

    public void setPrecioCaja(double precioCaja) {
        this.precioCaja = precioCaja;
    }
}
