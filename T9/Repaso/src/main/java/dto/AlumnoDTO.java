package dto;

import com.mysql.cj.protocol.Resultset;
import database.DBConnection;
import model.Alumno;

import java.sql.*;

public class AlumnoDTO {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private Statement statement;
    private ResultSet resultSet;

    public void insertarUsuario(Alumno alumno){
        connection = DBConnection.getConnection();
        String query = String.format("INSERT into %s (%s, %s, %s) VALUES (?,?,?)","alumno","nombre","apellido","correo");
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, alumno.getNombre());
            preparedStatement.setString(2, alumno.getApellido());
            preparedStatement.setString(3, alumno.getCorreo());
            preparedStatement.execute();

        } catch (SQLException e) {
            System.out.println("Error en la SQL");
        }
    }
    public void getUsuarios(){
        connection = DBConnection.getConnection();
        try {
            statement = connection.createStatement();
            statement.executeQuery("SELECT * FROM alumnos");
            while (resultSet.next()){
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                String correo = resultSet.getString("correo");
                Alumno alumno = new Alumno(nombre, apellido, correo);
                alumno.mostrarDatos();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
