import utils.LongitudDNINoValidaException;
import utils.UltimoDigitoNoLetraException;

import static java.lang.Character.isLetter;

public class Formulario {
    private String nombre, apellido, dni;

    public void mostrarDatos() throws NullPointerException{
        if (nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty()){
            throw new NullPointerException("No hay datos para mostrar");
        } else {
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("DNI: " + dni);
        }
    }

    public void setDni(String dni) throws UltimoDigitoNoLetraException, LongitudDNINoValidaException {
        char ultimaLetra = dni.charAt(dni.length() - 1);
        if (dni.length() != 9){
            throw new LongitudDNINoValidaException("La longitud no es valida");
        } else {
            System.out.println("No hay error");
        }

        if (Character.isDigit(ultimaLetra)) {
            throw new UltimoDigitoNoLetraException("El último carácter no es una letra");
        } else {
            System.out.println("No hay error");
        }
        this.dni = dni;
    }

    public void setNombre(String nombre) throws LongitudDNINoValidaException {
        if (nombre == null || nombre.isEmpty()) {
            throw new LongitudDNINoValidaException("El nombre introducido no es Valido");
        }
        this.nombre = nombre;
    }

    public void setApellido(String apellido) throws LongitudDNINoValidaException {
        if (apellido == null || apellido.isEmpty()) {
            throw new LongitudDNINoValidaException("El apellido introducido no es válido");
        }
        this.apellido = apellido;
    }

}
