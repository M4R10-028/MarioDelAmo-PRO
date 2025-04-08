import model.Usuario;

import java.io.*;
import java.util.ArrayList;

public class OperacionesFicheros {
    public void leerFicheroE1(String path){
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String codigo;
            int codigoD;

            while((codigo = bufferedReader.readLine()) != null){
                String[] lineaCodigo = codigo.split(" ");

                for (int i = 0; i < lineaCodigo.length; i++) {
                    codigoD = Integer.parseInt(lineaCodigo[i]);
                    System.out.print((char) codigoD);
                }
            }



        } catch (FileNotFoundException e) {
            System.out.println("Error en el fichero");
        } catch (IOException e) {
            System.out.println("Error en la entrada/salida");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado");
            }
        }
    }

    public void leerFicheroE2(String path){
        File file = new File(path);
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(file);
            int caracteres;


            while ((caracteres = fileInputStream.read()) != -1) {
                int codigo = caracteres;
                int codigoD = codigo / 4;

                System.out.print((char)codigoD);
            }




        } catch (FileNotFoundException e) {
            System.out.println("Error en el fichero");
        } catch (IOException e) {
            System.out.println("Error en la entrada/salida");
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }
        }

    }

    /*
    public void leerFicheroE22(String path){
        File file = new File(path);
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            int codigo = -1;

            while ((codigo = fileReader.read()) != -1){
                System.out.print((char) (codigo / 4));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error en el fichero");
        } catch (IOException e) {
            System.out.println("Error en la entrada/salida");
        }
    }
     */


    public void leerUsuario(String path){
        File file = new File(path);
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            ArrayList <Usuario> usuario = (ArrayList<Usuario>) objectInputStream.readObject();
            System.out.println(usuario.toString());

        } catch (IOException e) {
            System.out.println("Error en la entrada/salida");
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error en la clase");
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }
        }
    }
}
