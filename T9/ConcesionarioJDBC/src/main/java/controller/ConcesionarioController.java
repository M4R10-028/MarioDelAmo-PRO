package controller;

import database.SchemaDB;
import dto.CochesDTO;
import model.Coches;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class ConcesionarioController {
    private PreparedStatement ps;
    private Connection connection;
    private CochesDTO cochesDTO;

    public void agregarCoche(Coches coche){
        try {
            String query = String.format("SELECT * FROM %s WHERE %s = ?", SchemaDB.TAB_COCHES, SchemaDB.COLC_MATRICULA);
            ps = connection.prepareStatement(query);
            ps.setString(1, coche.getMatricula());
            if (ps.execute()) {
                System.out.println("Ya hay un coche con esta matricula");
            } else {
                cochesDTO.anadirCoche(coche);
            }
        } catch (SQLException e) {
            System.out.println("Error en la conexion");
        }
    }
}
