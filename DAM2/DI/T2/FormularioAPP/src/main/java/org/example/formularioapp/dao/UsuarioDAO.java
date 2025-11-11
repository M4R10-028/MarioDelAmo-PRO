package org.example.formularioapp.dao;

import org.example.formularioapp.model.Usuario;

import java.sql.SQLException;
import java.util.List;

public interface UsuarioDAO {

    void insertarUsuario(Usuario usuario) throws SQLException;
    List<Usuario> obtenerUsuarios();
    int borrarUsuariosNombre(String nombre);
    void borrarUsuarios();
    //int borrarUsuarios(String nombre, String correo);

    //la firma de todos lo metodos que necesito contra la DB
}
