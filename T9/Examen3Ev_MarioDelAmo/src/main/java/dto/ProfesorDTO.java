package dto;

import model.Profesor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.SchemaDB;
public class ProfesorDTO {
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    public void ingresarProfesor(Profesor profesor){
        String query = String.format("INSERT INTO %s (%s,%s,%s) VALUES (?,?,?)",SchemaDB.TAB_NAME,SchemaDB.COL_NAME,SchemaDB.COL_DNI,SchemaDB.COL_SALARIO);
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,profesor.getNombre());
            preparedStatement.setString(2, profesor.getDni());
            preparedStatement.setInt(3,profesor.getSalarioTotal());
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Error en la conexion con la base de datos");
        }
    }

    public boolean mostrarProfesores(){
        int ejecuta = 0;
        String query = String.format("SELECT * FROM %s", SchemaDB.TAB_NAME);
        try {
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String nombre = resultSet.getString(SchemaDB.COL_NAME);
                String dni = resultSet.getString(SchemaDB.COL_DNI);
                int salarioTotal = resultSet.getInt(SchemaDB.COL_SALARIO);
                System.out.println("Nombre: " + nombre + " DNI: " + dni + " Salario Total: " + salarioTotal);
                ejecuta = 1;
            }
        } catch (SQLException e) {
            System.out.println("Error en la conexion con la base de datos");
        }
        if (ejecuta == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean estaProfesor(String dni){
        String query = String.format("SELECT * FROM %s", SchemaDB.TAB_NAME);
        try {
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String dniP = resultSet.getString(SchemaDB.COL_DNI);
                if (dniP.equalsIgnoreCase(dni)){
                    return false;
                }

            }
        } catch (SQLException e) {
            System.out.println("Error en la conexion con la base de datos");
        }return true;
    }
}
