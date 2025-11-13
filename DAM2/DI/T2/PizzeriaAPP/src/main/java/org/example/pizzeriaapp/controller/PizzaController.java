package org.example.pizzeriaapp.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class PizzaController implements Initializable {

    @FXML
    private TextField textoNombre, textoTelefono;

    @FXML
    private ChoiceBox choicePizzas;

    @FXML
    private RadioButton radioFamiliar, radioMediana, radioPequeña;

    @FXML
    private Button botonRealizar;

    @FXML
    private ListView listaPedidos;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        instancias();
        initGUI();
        acciones();
    }

    private void acciones() {
        botonRealizar.setOnAction(new ManejoActions());
    }

    private void instancias() {

    }

    private void initGUI() {

    }

    class ManejoActions implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent actionEvent) {
            
        }
    }
}
