package database;

import java.sql.*;

public class DBConnector {

    private static Connection connection;

    public static Connection getConnection(){

        if (connection == null){
            createConnection();
        }

        return connection;
    }

    public static void createConnection(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/concesionario_ces","root","Yosoymario028?");
        } catch (SQLException e) {
            System.out.println("Error en la conexion");
        }
    }
}
