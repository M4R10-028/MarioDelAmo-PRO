package org.example.examen_mariodelamo.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import org.example.examen_mariodelamo.database.TiendaDB;
import org.example.examen_mariodelamo.model.Productos;

import java.net.URL;
import java.util.ResourceBundle;

public class ProductosController implements Initializable {

    @FXML
    private ListView<Productos> listViewProductos;

    @FXML
    private ChoiceBox<String> choiceBoxProductos;

    @FXML
    private Button buttonFiltrar, buttonDetalle;

    TiendaDB tiendaDB = new TiendaDB();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TiendaDB.crearConexion();

        //se me ha borrado los metodos initGUI donde cargaba la listview con la lista de productos y metia las categorias a el choicebox
        // se me ha borrado el metodo acciones donde asignaba las acciones a los botones, y segun la categoria
        // seleccionaba los productos a mostrar en la listview (No estaba comprobado)

    }
}
