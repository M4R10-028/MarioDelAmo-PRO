package org.example.formularioapp.dao;

import org.example.formularioapp.database.DBConnection;
import org.example.formularioapp.database.SchemaDB;
import org.example.formularioapp.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOimp implements UsuarioDAO{

    private Connection connection;
    private PreparedStatement preparedStatement;
    //INSERT
    //UPDATE
    //DELETE
    //SELECT
    // STATEMENT o PREPARESTATEMENT
        //execute -> booleano -> INSERT
        //executeUpdate -> int -> UPDATE DELETE
    //PS o ST -> executeQuery
    //RESULTSET -> SELECT

    public UsuarioDAOimp(){
        connection = DBConnection.getConnection();
    }

    @Override
    public void insertarUsuario(Usuario usuario) throws SQLException {
        String query = String.format("INSERT INTO %s (%s, %s, %s, %s, %s) VALUES (?, ?, ?, ?, ?)",
                SchemaDB.TAB_NAME, SchemaDB.COL_NAME, SchemaDB.COL_MAIL, SchemaDB.COL_LOCALIZACION, SchemaDB.COL_GENERO, SchemaDB.COL_EDAD);

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, usuario.getNombre());
            preparedStatement.setString(2, usuario.getCorreo());
            preparedStatement.setString(3, usuario.getLocalizacion());
            preparedStatement.setString(4, usuario.getGenero());
            preparedStatement.setInt(5, usuario.getEdad());

            preparedStatement.execute();


    }

    @Override
    public List<Usuario> obtenerUsuarios() {
        List<Usuario> lista = new ArrayList<>();

        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM " + SchemaDB.TAB_NAME);
            ResultSet resultSet = preparedStatement.executeQuery();
            // [                  x]
            // [r, r, r, r, r, r, r]
            while (resultSet.next()){
                //añadir los usuarios a la lista
                String nombre = resultSet.getString(SchemaDB.COL_NAME);
                String mail = resultSet.getString(SchemaDB.COL_MAIL);
                String localizacion = resultSet.getString(SchemaDB.COL_LOCALIZACION);
                String genero = resultSet.getString(SchemaDB.COL_GENERO);
                int edad = resultSet.getInt(SchemaDB.COL_EDAD);

                Usuario usuario = new Usuario(nombre, mail, localizacion,genero,edad,true);
                lista.add(usuario);


            }

        } catch (SQLException e) {
            System.out.println("Error en la query");
        }

        return List.of();
    }

    @Override
    public int borrarUsuariosNombre(String nombre) {
        return 0;
    }

    @Override
    public void borrarUsuarios() {


    }
}
