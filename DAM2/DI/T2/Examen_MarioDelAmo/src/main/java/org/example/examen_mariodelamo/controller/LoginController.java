package org.example.examen_mariodelamo.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.examen_mariodelamo.database.TiendaDB;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;

/* un proyecto para poder gestionar las compras de una tienda online. Para ello
lo primero que debes hacer es crear una base de datos para conectarte a ella. La
base de datos tendrá dos tablas:
        - Usuarios (id, nombre, correo, pass). Crea manualmente un par de usuarios
- Productos (id, nombre, categoría, precio)
La aplicación tendrá la siguiente funcionalidad:
        - Primera pantalla de login con dos campos para introducir correo y pass. Y
un botón para logear. La funcionalidad será la siguiente:
o En caso de existir un usuario dentro de la base de datos, arrancará la
        siguiente ventana, cerrando esta
o En caso de no existir un usuario dentro de la base de datos, mostrará
una alerta de tipo error avisando del resultado
o En caso de faltar alguno de los datos por rellenar, mostrará una
alerta de tipo warning avisando del resultado
- Segunda pantalla con los siguientes elementos:
o Una lista con todos los productos de la base de datos. Tan solo se
mostrará el ID y el precio. Estos productos se mostrarán de forma
automática
o Un combobox con 3 categorías: tecnología, ropa, muebles, todo.
o Un botón filtrar: al pulsarlo, en la lista se mostrarán aquellos
productos de la categoría seleccionada
o Un botón ver detalle: al pulsarlo se mostrará en una pantalla nueva
el detalle del producto seleccionado de la lista, mostrando nombre,
precio, categoría y descripción

• Es importante que la base de datos esté creada correctamente
• Es importante que la primera vez que un usuario inicie sesión, si no hay
productos en la tabla, se inserten automáticamente. En caso de ya existir,
no deberán insertarse*/

public class LoginController implements Initializable {

    @FXML
    private TextField textFieldMail, textFieldPass;

    @FXML
    private Button buttonLogin;

    TiendaDB tiendaDB = new TiendaDB();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TiendaDB.crearConexion();
        buttonLogin.setOnAction(event -> {
            if(textFieldMail.getText().isEmpty() || textFieldPass.getText().isEmpty()) {

                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setHeaderText("Faltan datos por rellenar");
                alert.setContentText("Por favor, rellena todos los campos.");
                alert.show();

            } else {
                String mail = textFieldMail.getText();
                String pass = textFieldPass.getText();

                if (tiendaDB.listaVacia()){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("No hay usuarios en la base de datos");
                    alert.setContentText("La tabla de usuarios está vacía.");
                    alert.show();
                } else {
                    if (tiendaDB.comprobarUsuario(mail,pass)) {
                        try {
                            FXMLLoader loader = new FXMLLoader(getClass().getResource("second-view.fxml"));
                            Parent root = loader.load();
                            Stage stage = new Stage();
                            Scene scene = new Scene(root);
                            stage.setScene(scene);
                            stage.show();

                        } catch (IOException e) {
                            System.out.println("Error al cargar la siguiente ventana");
                        }
                    } else {
                        Alert alert = new Alert(Alert.AlertType.WARNING);
                        alert.setTitle("Warning");
                        alert.setHeaderText("Usuario no encontrado");
                        alert.setContentText("El correo o la contraseña son incorrectos.");
                        alert.show();
                    }
                }
            }
        });
    }
}
