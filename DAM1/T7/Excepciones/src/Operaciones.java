import utils.TelefonoException;

import java.io.File;
import java.io.IOException;

public class Operaciones {
    public void divisionEntre0(int numero) throws ArithmeticException {
        System.out.println("Procedemos a dividir el numero entre 0");
        System.out.println("La division del numero es: " + numero / 0);
        System.out.println("Fin del metodo");
    }

    public void crearFichero(String path) throws IOException {
        File file = new File(path);
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error en la creacion del fichero");
        }
    }

    public void lanzarExcepcion(String nombre, int telefono) throws TelefonoException{
        if (String.valueOf(telefono).length() != 9){
                throw new TelefonoException("Telefono incorrecto");
        } else {
            System.out.println("No hay error");
        }
    }
}
