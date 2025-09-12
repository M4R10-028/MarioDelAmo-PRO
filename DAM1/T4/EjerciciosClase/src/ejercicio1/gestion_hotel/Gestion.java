package ejercicio1.gestion_hotel;

import java.util.*;

public class Gestion {
    ArrayList <Object[]> listaHotel = new ArrayList<>();

    public void registroReserva(String dni, int numeroH, String nombre, int telefono, int numeroP){
        if (!estaPersona(dni) &&                  listaHotel.size() < 20){
            Object[] reserva = {dni, numeroH, nombre, telefono, numeroP};

            listaHotel.add(reserva);

            System.out.println("La reserva se ha realizado");
        } else {
            System.out.println("La reserva no se ha podido realizar");
        }
    }
    private boolean estaPersona(String dni){
        for (int i = 0; i < listaHotel.size(); i++) {
            if (listaHotel.get(i)[0].equals(dni)){
                return true;
            }
        }
        return false;
    }
    public void eliminarReserva(String dni){
        if (estaPersona(dni)){
            for (int i = 0; i < listaHotel.size(); i++) {
                if (listaHotel.get(i)[0].equals(dni)){
                    listaHotel.remove(i);
                }
            }
            System.out.println("Se ha eliminado la reserva");
        } else {
            System.out.println("No se ha podido eliminar la reserva porque no hay ninguna reserva con ese dni");
        }
    }
    public void mostrarReservas(){
        int i = 1;
        if (!listaHotel.isEmpty()){
            System.out.println("Mostrando reservas...");
            for ( Object[] reserva : listaHotel) {
                System.out.print(i + ". " + reserva[0] + " - " + reserva[1] + " - " + reserva[2] + " - " + reserva[4]);
                i++;
                System.out.println();
            }
        } else {
            System.out.println("No hay reservas aún");
        }
    }
    public void mostrarReservasOrdenadas(){
        Collections.sort(listaHotel, new Comparator<Object[]>() {
            @Override
            public int compare(Object[] o1, Object[] o2) {
                if (Integer.valueOf(o1[4].toString()) > Integer.valueOf(o2[4].toString()))
                    return 1;
                else if (Integer.valueOf(o1[4].toString()) < Integer.valueOf(o2[4].toString())) {
                    return -1;
                }
                return 0;
            }

        });
        for ( Object[] reserva : listaHotel ) {
            System.out.print(reserva[0] + " - " + reserva[1] + " - " + reserva[4]);
            System.out.println();
        }
    }
}
