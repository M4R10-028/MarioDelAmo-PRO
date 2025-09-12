package resources;

import model.Alumno;

import java.io.*;

public class Entrada {
    public static void main(String[] args) {
        //escritura
        File ficheroAlumnos = new File("src/main/java/resources/alumnos.txt");
/*
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(ficheroAlumnos));
            String linea = null;
            while ((linea = bufferedReader.readLine()) != null){
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error en la IOS");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }
        }
*/
        ObjectOutputStream objectOutputStream = null;

        try{
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(ficheroAlumnos));
            objectOutputStream.writeObject(new Alumno("Borja","Martin","bmartin@correo.com"));
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Error en la IOS");
        }finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                System.out.println("Error en la salida");
            }
        }
    }
}
