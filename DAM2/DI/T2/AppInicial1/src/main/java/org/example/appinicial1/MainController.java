package org.example.appinicial1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private Label labelSaludo;

    @FXML
    private Button botonPulsar, botonVaciar, botonLimpiar;

    @FXML
    private TextField textfieldNombre;


    private DropShadow sombra;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Ejecucion de la parte logica comenzada");
        instancias();
        initGUI();
        //personalizara las partes de la UI


        acciones();
    }

    private void initGUI() {
        botonPulsar.setEffect(sombra);
    }

    private void instancias() {
        sombra = new DropShadow();
    }

    private void acciones() {
        /*
        botonVaciar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });

        botonPulsar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });*/
        botonVaciar.setOnAction(new ManejoAccion());
        botonPulsar.setOnAction(new ManejoAccion());

        botonPulsar.setOnMouseEntered(new ManejoRaton());
        botonPulsar.setOnMouseExited(new ManejoRaton());
        botonPulsar.setOnMousePressed(new ManejoRaton());
        botonPulsar.setOnMouseReleased(new ManejoRaton());
        botonVaciar.setOnMouseEntered(new ManejoRaton());
        botonVaciar.setOnMouseExited(new ManejoRaton());

        botonLimpiar.addEventHandler(ActionEvent.ACTION, new ManejoAccion());


    }

    class ManejoAccion implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent actionEvent) {
            // que boton se ha pulsado
            if (actionEvent.getSource() == botonPulsar) {
                //el metodo a ejecutar cuando el boton sea pulsado
                //System.out.println("Boton pulsado correctamente");
                String nombre = textfieldNombre.getText();
                if (nombre.isBlank()) {
                    System.out.println("Por favor rellena el nombre");
                } else {
                    labelSaludo.setText(String.format("Enahorabuena %s has completado el primer ejecicio", nombre));
                    textfieldNombre.clear();
                }
            } else if (actionEvent.getSource() == botonVaciar) {
                labelSaludo.setText("");
                textfieldNombre.clear();
            } else if (actionEvent.getSource() == botonLimpiar) {
                textfieldNombre.clear();
            }
        }
    }

    class ManejoRaton implements EventHandler<MouseEvent> {

        @Override
        public void handle(MouseEvent mouseEvent) {
            Button boton = (Button) mouseEvent.getSource();
            if (mouseEvent.getEventType() == MouseEvent.MOUSE_ENTERED) {
                boton.setEffect(sombra);
                if (boton == botonPulsar) {
                    boton.setCursor(Cursor.OPEN_HAND);
                }

            } else if (mouseEvent.getEventType() == MouseEvent.MOUSE_EXITED) {
                boton.setEffect(null);

            } else if (mouseEvent.getEventType() == MouseEvent.MOUSE_PRESSED) {
                boton.setCursor(Cursor.CLOSED_HAND);

            } else if (mouseEvent.getEventType() == MouseEvent.MOUSE_RELEASED) {
                boton.setCursor(Cursor.OPEN_HAND);
            }
        }
    }
}
