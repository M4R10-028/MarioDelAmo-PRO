package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    Connection connection;

    public void getConexion(){
        if (connection == null){
            crearConexion();
        }
    }
    private void crearConexion() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_profesores","root","Yosoymario028?");
        } catch (SQLException e) {
            System.out.println("Error en la conexion con la base de datos");
        }
    }


}
