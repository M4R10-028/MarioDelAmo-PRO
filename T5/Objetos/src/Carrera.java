import model.Coche;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Carrera {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion, cv, vueltas;
        String marca, modelo, matricula;


        ArrayList<Coche> listaCoches = new ArrayList<>();
/*

        listaCoches.add(new Coche("Ford","Focus","Plata"));
        listaCoches.add(new Coche("Seat","Ibiza","Blanco"));
        listaCoches.add(new Coche("Mercedes","C300",400));

        for ( Coche coche : listaCoches ) {
            coche.mostrarDatos();
            System.out.println();
        }
*/
        for (int i = 0; i < 6; i++) {
            System.out.println("Añade al participantes (6 participantes)");

            System.out.println("Dime la marca del coche");
            marca = sc.next();

            System.out.println("Dime el modelo del coche");
            modelo = sc.next();

            System.out.println("Dime la matricula del coche");
            matricula = sc.next();

            System.out.println("Dime los cavallos del coche");
            cv = sc.nextInt();

            listaCoches.add(new Coche(marca,modelo,matricula,cv));
        }

        System.out.println("Dime el numero de vueltas que va a tener la carrera");
        vueltas = sc.nextInt();

        for (int i = 0; i < vueltas; i++) {
            for (Coche coche : listaCoches) {
                coche.setKm((int) ((Math.random() * 25) + 50));
            }
        }

        listaCoches.sort(new Comparator<Coche>() {
            @Override
            public int compare(Coche o1, Coche o2) {
                if ((int) o1.getKm() > (int) o2.getKm()){
                    return 1;
                } else if ((int) o1.getKm() < (int) o2.getKm()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });



        for (Coche coche : listaCoches) {
            System.out.println(coche.getKm() + " - " + coche.getMarca() + " - " + coche.getModelo() + " - " + coche.getCv());

        }
    }
}

/*
* Un coche tiene un atributo Km, los cuales pueden decir la distancia que ha recorrido un coche
* Para poder hacer una carrera es necesario que se pida por consola los datos de 6 participantes donde
* de debe indicar la marca el modelo la matricula y los cv
* Una vez indicados todos los participantes, es necesario indicar cuantas vueltas consta la carrera*
* Una vez indicada el numero de vueltas la carrera comienza
* En cada vuelta cada coche recorre un numero de kilometros aleatorio entre (50 - 75)
*
* Una vez se terminan todas las vueltas el sistema mostrará
*
* El ganador es el coche XXXX XXXX XXXXX
* La clasificacion final es:
* 1 - XXXX XXXX XXXX XXXX
* 2 - XXXX XXXX XXXX XXXX
* (ordenando por kilometros)(El ganador es el coche que mas tiene)
*
*  */