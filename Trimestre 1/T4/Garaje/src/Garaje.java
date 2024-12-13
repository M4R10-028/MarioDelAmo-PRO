import java.util.ArrayList;

public class Garaje {

    private ArrayList <Object[]> listaCoches = new ArrayList<>();

    public void anadirCoche(String marca, String modelo, int cv, String matricula){
        Object[] coche = new Object[]{marca, modelo, cv, matricula};
        if (listaCoches.size() < 5){
            listaCoches.add(coche);
        } else {
            System.out.println("El garaje está lleno");
        }
    }
    public void mostrarCoches(){
        if (listaCoches.isEmpty()){
            System.out.println("No hay coches en el garaje");
        } else {
            for (Object[] coche : listaCoches) {
                System.out.println(coche[3] + " - " + coche[0] + " - " + coche[1]);
            }
        }
    }
    public boolean estaCoche(String matricula) {
        for (Object[] coche : listaCoches) {
            if (coche[3].equals( matricula )) {
                return true;
            }
        }
        return false;
    }

    public void buscarMarca(String marcaBusqueda) {
        int coches = 0;
        if (listaCoches.isEmpty()){
            System.out.println("No hay coches en el garaje");
        } else {
            for ( Object[] coche : listaCoches ) {
                if (coche[0].toString().equalsIgnoreCase(marcaBusqueda)) {
                    System.out.println("De la marca " + marcaBusqueda + " hay: ");
                    System.out.println(coche[1] + " - " + coche[2] + " - " + coche[3]);
                    coches++;
                }
            }
            if (coches < 1){
                System.out.println("No hay coches de esa marca");
            }
        }
    }

}
