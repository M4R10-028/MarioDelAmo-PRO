package controller;

import model.Coches;
import dto.CochesDTO;

import java.io.*;
import java.nio.Buffer;
import java.sql.*;
import java.util.ArrayList;


public class ConcesionarioController {

    public ConcesionarioController() {
        cochesDTO = new CochesDTO();
    }

    private CochesDTO cochesDTO;
    private PreparedStatement ps;
    public void agregarCoche(Coches coche){
        if (cochesDTO.selectMatricula(coche.getMatricula())){
            System.out.println("Ya hay un coche con esa matricula");
        } else {
            cochesDTO.anadirCoche(coche);
        }
    }

    public void borrarCoche(int id){
        if (cochesDTO.selectId(id)){
            cochesDTO.borrarCoche(id);
        } else {
            System.out.println("No hay un coche en la base de datos con ese id");
        }
    }

    public void buscarCocheId(int id){
        if (cochesDTO.selectId(id)){
            cochesDTO.listarCocheId(id);
        } else {
            System.out.println("No hay un coche en la base de datos con ese id");
        }
    }

    public void listarCoches(){
        if (cochesDTO.selectLista()){
            cochesDTO.listarCoches();
        } else {
            System.out.println("No hay coches guardados en la base de datos");
        }
    }

    public void exportarCochesCsv(){
        try {
            File file = new File("C:\\Users\\Usuario DAM1\\Documents\\GitHub\\MarioDelAmo-PRO\\T9\\ConcesionarioJDBC\\src\\main\\java\\resources\\coches.csv");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (Object coche : cochesDTO.arrayCoches()) {
                bw.write((String) coche);
            }
        } catch (IOException e) {
            System.out.println("Error en la conexion con el fichero");
        }
    }
}
