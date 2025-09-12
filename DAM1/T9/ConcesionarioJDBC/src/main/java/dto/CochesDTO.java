package dto;


import model.Coches;
import database.SchemaDB;

import java.sql.*;

public class CochesDTO {
    private Statement statement;
    private PreparedStatement preparedStatement;
    private Connection connection;
    private ResultSet resultSet;

    public void anadirCoche(Coches coche){
        try {
            statement = connection.createStatement();
            String query = "INSERT INTO %s (%s, %s, %s, %s, %s, %s, %s) VALUES (%d, %s, %s, %s, %s, %d, %d)";
            String queryFormateado = String.format(query,SchemaDB.TAB_COCHES, SchemaDB.COLC_MARCA, SchemaDB.COLC_MODELO, SchemaDB.COLC_MATRICULA, SchemaDB.COLC_COLOR, SchemaDB.COLC_PRECIO, SchemaDB.COLC_PLAZAS,
                    coche.getMarca(), coche.getModelo(), coche.getMatricula(), coche.getColor(), coche.getPrecio(), coche.getPlazas());
            statement.executeQuery(queryFormateado);
        } catch (SQLException e) {
            System.out.println("Error en la conexion");
        }
    }

    public void borrarCoche(int id){
        String query = String.format("DELETE FROM %s WHERE %s = ?" + SchemaDB.TAB_COCHES, SchemaDB.COLC_ID);
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Error en la conexion");
        }
    }

    public void listarCocheId(int id){
        String query = String.format("SELECT * FROM %s VALUES WHERE %s = ?", SchemaDB.TAB_COCHES, SchemaDB.COLC_ID);
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Error en la conexion");
        }
    }

    public void listarCoches(){
        String query = String.format("SELECT * FROM %s ", SchemaDB.TAB_COCHES);
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Error en la conexion");
        }

    }

    public boolean selectMatricula(String matricula){
        String query = String.format("SELECT * FROM %s WHERE %s = ?",SchemaDB.COLC_MATRICULA, SchemaDB.TAB_COCHES, SchemaDB.COLC_MATRICULA);
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,matricula);
            resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            System.out.println("Error en la conexion");
        }finally {
            return false;
        }
    }
}
