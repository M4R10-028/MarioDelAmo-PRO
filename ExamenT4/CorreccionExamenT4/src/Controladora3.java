import java.util.Enumeration;
import java.util.Hashtable;

public class Controladora3 {

    private Hashtable<String,Object[]> listaAgenda;

    public Controladora3(){
        listaAgenda = new Hashtable<>();
    }

    //AgregarContacto
    public void agregarContacto(String dni, String nombre, String apellido, int telefono, boolean disponibilidad){
        Object[] contacto = new Object[]{dni,nombre,apellido,telefono,disponibilidad};
        if (listaAgenda.containsKey(contacto[0])){
            System.out.println("No se puede, contacto ya existente");
        } else {
            listaAgenda.put(contacto[0].toString(),contacto);
        }
    }

    //buscarContacto
    public void buscarContacto(String dni){
        if (!listaAgenda.containsKey(dni)){
            System.out.println("No se puede, contacto no existente");
        } else {
            Object[] contacto = listaAgenda.get(dni);
            for (Object item : contacto) {
                System.out.print(item + "-");
            }
            System.out.println();
        }
    }

    //borrarContacto
    public void borrarContacto(String dni){
        if (!listaAgenda.containsKey(dni)){
            System.out.println("No se puede, no existe contacto");
        } else {
            listaAgenda.remove(dni);
        }
    }

    public void borrarContactoDisponibilidad(String dni){
        if (!listaAgenda.containsKey(dni)){
            System.out.println("No se puede, contacto no existente");
        } else {
            Object[] contacto = listaAgenda.get(dni);
            if (!(boolean)contacto[4]){
                listaAgenda.remove(dni);
            } else {
                System.out.println("Esta persona si tiene disponibilidad");
            }
        }
    }

    //listarContacto
    public void listarContactos(){
        Enumeration listaValores = (Enumeration) listaAgenda.values();
        Enumeration<String> claves = listaAgenda.keys();
        while (claves.hasMoreElements()){
            String clave = claves.nextElement();
            buscarContacto(clave);
        }
    }
}
