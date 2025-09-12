import java.io.*;

public class OperacionesFicheros{
    public void cifrarMensaje(String mensaje, int fase, String path){
        File file = new File(path);
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file);
            for (int i = 0; i < mensaje.length(); i++){
                char letra = mensaje.charAt(i);
                int codigo = ((int) letra);
                int codigoCifrado = codigo*fase;
                //System.out.println(codigoCifrado);
                fileWriter.write(codigoCifrado + " ");
            }
        } catch (IOException e) {
            System.out.println("Error en la Entrada/Salida");
        } finally {
            try {
                fileWriter.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error al cerrado");
            }
        }
    }

    public void descifrarMensaje(int fase, String path){
        File file = new File(path);
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            int codigoLectura = -1;
            while((codigoLectura = fileReader.read()) != -1){
                int codigoDescifrado = codigoLectura/fase;
                System.out.println((char) codigoDescifrado);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error en la direccion del fichero");
        } catch (IOException e) {
            System.out.println("Error en la lectura");
        } finally {
            try {
                fileReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado");
            }
        }
    }

    public void descifrarCodigo(String path, int fase){
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String lectura = null;
            while((lectura = bufferedReader.readLine())!= null){
                String[] codigos = lectura.split(" ");

                for(String codigo : codigos){
                    int codigoDescifrado = Integer.valueOf(codigo)/fase;
                    System.out.print((char) codigoDescifrado);
                }
            }
        } catch (IOException e) {
            System.out.println("Error en la lectura");
        }
    }

    public void escrituraFicheroCompleta(String path){

        File file = new File(path);
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try{
            fileWriter = new FileWriter(file);
            printWriter = new PrintWriter(fileWriter);
            printWriter.println("Esta primera linea es la escrtura completa");
            printWriter.println("Esta segunda linea se ha incorporado de forma automatica");
            printWriter.print(69);
        } catch (IOException e) {
            System.out.println("Error en la entrada/salida");
        } finally {
            try{
                printWriter.close();
            } catch (Exception e) {
                System.out.println("Error en el cerrado");
            }
        }
    }
}