import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Entrada {
    public static void main(String[] args) {
        OperacionesFicheros operacionesFicheros = new OperacionesFicheros();
        //operacionesFicheros.crearFichero("src/recursos/mensaje.txt");
        //operacionesFicheros.cifrarMensaje("Este mensaje sera cifrado",3,"src/recursos/mensaje.txt");
        //operacionesFicheros.descifrarMensaje(3,"src/recursos/mensaje_codigo.txt");
        //operacionesFicheros.descifrarCodigo("src/recursos/mensaje.txt",3);
        operacionesFicheros.escrituraFicheroCompleta("src/recursos/mensaje_completo.txt");



    }
}
