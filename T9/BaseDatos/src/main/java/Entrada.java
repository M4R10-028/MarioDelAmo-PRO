import database.DBConnector;
import dto.UsuarioDTO;
import model.Usuario;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

public class Entrada {
    public static void main(String[] args) {
        //Connection connection = DBConnector.getConnection();
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        Usuario usuario = new Usuario(1,"Marcos","Lopez","marcos@gmail.com","pass",0,0);
        //usuarioDTO.insertarUsuario(usuario);
        /*boolean fallo = false;
        do {
            try {
                usuarioDTO.insertarUsuariosPS(usuario);
                fallo = false;
            } catch (SQLIntegrityConstraintViolationException e) {
                System.out.println("Por favor introduce un correo diferente");
                usuario.setCorreo("correonuevo@gmail.com");
                fallo = true;
            } catch (SQLException e) {
                System.out.println("Error en el sql");
            }
        } while (fallo);
         */

        //System.out.println("El numero de despidos es de " + usuarioDTO.borrarUsuario(500));
        //usuarioDTO.mostrarUsuarios();

        //hacer un sistema que permita el login de los usuarios. Para ello el sistema
        //pedira el correo y pass del usuario que quiere acceder al sistema. En caso de
        //hacer un login correcto, aparecera el mensaje de bienvenido a la app en caso
        // de no hacer login, aparecerá el mensaje de fallo de seguridad
        int idLogin = usuarioDTO.loginUsuario("borja@gmail.com","1234");
        if (idLogin != -1){
            System.out.println("Login correctamente realizado");
            System.out.println("Entrando a la app en modo " + idLogin);
        } else {
            System.out.println("Error en el login");
        }
    }
}
