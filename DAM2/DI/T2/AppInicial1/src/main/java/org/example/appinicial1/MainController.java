package org.example.appinicial1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private Label labelSaludo;

    @FXML
    private Button botonPulsar, botonVaciar;

    @FXML
    private TextField textfieldNombre;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Ejecucion de la parte logica comenzada");
        acciones();
    }

    private void acciones() {
        /*
        botonVaciar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                labelSaludo.setText("");
                textfieldNombre.clear();
            }
        });

        botonPulsar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                //el metodo a ejecutar cuando el boton sea pulsado
                //System.out.println("Boton pulsado correctamente");
                String nombre = textfieldNombre.getText();
                if (nombre.isBlank()) {
                    System.out.println("Por favor rellena el nombre");
                } else {
                    labelSaludo.setText(String.format("Enahorabuena %s has completado el primer ejecicio", nombre));
                    textfieldNombre.clear();
                }
            }
        });*/
        botonVaciar.setOnAction(new ManejoAccion());
        botonPulsar.setOnAction(new ManejoAccion());
        
    }
    
    class ManejoAccion implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent actionEvent) {
            // que boton se ha pulsado
            if (actionEvent.getSource() == botonPulsar){
                
            } else if (actionEvent.getSource() == botonVaciar) {
                
            }
        }
    }
}
