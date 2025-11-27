package org.example.examen_mariodelamo.database;

import java.sql.*;

public class TiendaDB {
    private static Connection connection;

    public static Connection crearConexion() {
        if (connection == null){
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:" + TiendaDBI.DB_SERVER + "/" + TiendaDBI.DB_NAME, TiendaDBI.DB_USER, TiendaDBI.DB_PASS);
            } catch (SQLException e) {
                System.out.println("Error al conectar con la base de datos: " + e.getMessage());
            }
        }
        return connection;
    }

    public boolean listaVacia(){
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + TiendaDBI.US_NAME);
            if (!resultSet.next()) {
                System.out.println("La tabla de usuarios está vacía");
                return true;
            } else {
                System.out.println("La tabla de usuarios no está vacía");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Error al comprobar si la tabla de usuarios está vacía: " + e.getMessage());
            return true;
        }
    }

    public boolean comprobarUsuario(String mail, String pass) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + TiendaDBI.US_NAME + " WHERE " + TiendaDBI.COLUS_MAIL + " = '" + mail + "' AND " + TiendaDBI.COLUS_PASS + " = '" + pass + "'");
            if (resultSet.next()) {
                System.out.println("Usuario encontrado");
                return true;
            } else {
                System.out.println("Usuario no encontrado");
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void anadirProductos(){
        // Se me han borrado los metodos de insercion de productos a la base de datos,
        // insertar los datos a la lista de productos,
        // comprobar si la base de datos de productos estaba vacia y que si era asi añadir los productos
    }

}
