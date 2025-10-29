package org.example.formularioapp.controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import org.example.formularioapp.model.Usuario;

import java.net.URL;
import java.util.ResourceBundle;

public class FormController implements Initializable {

    @FXML
    private Button botonAgregar;

    @FXML
    private BorderPane panelGeneral;

    @FXML
    private TextField textfieldNombre;

    @FXML
    private TextField textfieldCorreo;

    @FXML
    private TextField textfieldLocalizacion;

    @FXML
    private ComboBox<Integer> comboEdad;

    @FXML
    private CheckBox checkDisponibilidad;

    @FXML
    private RadioButton radioMasculino;

    @FXML
    private RadioButton radioFemenino;

    @FXML
    private Button botonEliminar;

    @FXML
    private ToggleButton toggleLista;

    private ToggleGroup grupoGenero;

    private ObservableList<Integer> listaEdades;

    private ObservableList<Usuario> usuarios;

    @FXML
    private FlowPane parteDerecha;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        instancias();
        initGUI();
        acciones();

    }

    private void acciones() {
        botonAgregar.setOnAction(new ManejoActions());
        botonEliminar.setOnAction(new ManejoActions());
        checkDisponibilidad.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue,
                                Boolean oldValue, Boolean newValue) {

                System.out.println("Estamos en " + newValue);
                System.out.println("Venimos de " + oldValue);

                botonAgregar.setDisable(!newValue);
            }
        });
        toggleLista.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue,
                                Boolean aBoolean, Boolean t1) {

                if (t1){
                    panelGeneral.setRight(parteDerecha);
                } else {
                    panelGeneral.setRight(null);
                }

            }
        });
    }

    private void instancias() {
        grupoGenero = new ToggleGroup();
        grupoGenero.getToggles().addAll(radioMasculino,radioFemenino);

        listaEdades = FXCollections.observableArrayList();
        for (int i = 18; i < 91; i++) {
            listaEdades.add(i);
        }

        usuarios = FXCollections.observableArrayList();
    }

    private void initGUI() {
        comboEdad.setItems(listaEdades);
        botonAgregar.setDisable(!checkDisponibilidad.isSelected());
        if (toggleLista.isSelected()){
            panelGeneral.setRight(parteDerecha);
        } else {
            panelGeneral.setRight(null);
        }
    }

    class ManejoActions implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent actionEvent) {
            if (actionEvent.getSource() == botonAgregar){


                if (!textfieldNombre.getText().isEmpty()
                        && !textfieldCorreo.getText().isEmpty()
                        && !textfieldLocalizacion.getText().isEmpty()
                        && grupoGenero.getSelectedToggle() != null
                        && comboEdad.getSelectionModel().getSelectedItem() >= 0
                ){

                    String nombre = textfieldNombre.getText();
                    String correo = textfieldCorreo.getText();
                    String localizacion = textfieldLocalizacion.getText();
                    String genero = ((RadioButton)grupoGenero.getSelectedToggle()).getText();
                    boolean disponibilidad = checkDisponibilidad.isSelected();
                    int edad = comboEdad.getSelectionModel().getSelectedItem();


                    System.out.println("nombre = " + nombre);
                    System.out.println("correp = " + correo);
                    System.out.println("localizacion = " + localizacion);
                    System.out.println("genero = " + genero);
                    System.out.println("disponibilidad = " + disponibilidad);
                    System.out.println("edad = " + edad + "\n");

                    usuarios.add(new Usuario(nombre,correo,localizacion,genero,edad, disponibilidad));

                } else {
                    System.out.println("Error, faltan datos");
                }



            } else if (actionEvent.getSource() == botonEliminar) {

            }
        }
    }
}
