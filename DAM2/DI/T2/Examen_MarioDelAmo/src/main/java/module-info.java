module org.example.examen_mariodelamo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;
    requires static lombok;

    opens org.example.examen_mariodelamo to javafx.fxml;
    exports org.example.examen_mariodelamo;
    exports org.example.examen_mariodelamo.controller;
    opens org.example.examen_mariodelamo.controller to javafx.fxml;
    exports org.example.examen_mariodelamo.database;
    opens org.example.examen_mariodelamo.database to java.sql;
    exports org.example.examen_mariodelamo.model;
    opens org.example.examen_mariodelamo.model to lombok;
}