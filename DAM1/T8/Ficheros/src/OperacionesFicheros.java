import java.io.*;

public class OperacionesFicheros {

    private int contadorNivel = 0;

    public void leerInformacion() {
        File file = new File("C:\\Users\\Usuario DAM1\\Documents\\GitHub\\MarioDelAmo-PRO\\T7\\Ficheros");
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());

        file.list();

        for (String nombre : file.list()) {
            System.out.println(nombre);
        }

        file.listFiles();

        for (File fichero : file.listFiles()) {
            System.out.println(fichero);
        }
    }

    public void crearDirectorio(String path) {
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();

            //mkdir cuando solo cree una carpeta
            //mkdirs cuando cree una o mas carpetas dentro de otra carpeta creada
        }
    }

    public void crearFichero(String path) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                System.out.println("Fallo en la escritura del fichero");
            }
        }
    }
    public void escribirFichero(String path) {
        File file = new File(path);
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file,true);
            fileWriter.write(106);
        } catch (IOException e) {
            System.out.println("Error en escritura");
        } finally {
            try {
                fileWriter.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado");
            }
        }

    }

    public void escribirDatos(String path, String nombre, String apellido, int edad, String mensaje){
        File file = new File(path);
        FileWriter fileWriter = null;

        try{
            fileWriter = new FileWriter(file, false);
            fileWriter.write("Nombre: " + nombre);
            fileWriter.write("\nApellido: " + apellido);
            fileWriter.write("\nEdad: " + edad);
            fileWriter.write("\nMensaje: " + mensaje);

        } catch (IOException e) {
            System.out.println("Error en la escritura");
        } finally {
            try {
                fileWriter.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado");
            }
        }
    }

    public void recorrerDirectorio(File fichero) {

    }

    public void lecturaSimpleUnitaria(String path) {
        File file = new File(path);
        if (file.exists()) {
            //hago lectura
            FileReader fileReader = null;
            try {
                fileReader = new FileReader(file);
                int lectura = fileReader.read();
                System.out.println("lectura = " + lectura + " asociado a la letra " + (char) lectura);
                lectura = fileReader.read();
                System.out.println("lectura = " + lectura + " asociado a la letra " + (char) lectura);
            } catch (FileNotFoundException e) {
                System.out.println("El fichero no existe");
            } catch (IOException e) {
                System.out.println("Error en la lectura");
            }
        } else {
            System.out.println("No se puede leer, el fichero no existe");
        }
    }

    public void lecturaUnitaria(String path) {
        File file = new File(path);
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            int lectura = 0;

            if (file.exists()) {
                while ((lectura = fileReader.read()) != -1) {
                    System.out.println("lectura = " + lectura + " asociado a la letra " + (char) lectura);
                }
            } else {
                System.out.println("No se puede leer, el fichero no existe");
            }

        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
        } catch (IOException e) {
            System.out.println("Error en la lectura");
        } finally {
            System.out.println("Terminando lectura...");
            try {
                fileReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cierre del fichero");
            }
        }

    }
    public void lecturaCodigoCompleta(String path) {
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String linea = null;

            while((linea = bufferedReader.readLine()) != null) {
                //System.out.println("Linea leida es: " + linea);
                String[] letras = linea.split(" ");
                for (String letra : letras) {
                    int letraNumero = Integer.parseInt(letra);
                    System.out.print((char)letraNumero);
                }
            }
            System.out.println();

        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
        } catch (IOException e) {
            System.out.println("Error en la lectura");
        } finally {
            System.out.println("Terminando lectura...");
            try {
                fileReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cierre del fichero");
            }
        }
    }
}
