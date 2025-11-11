package org.example.formularioapp.database;

public interface SchemaDB {
    //variables
    //metodos -> sin cuerpo abstracto

    String URL = "127.0.0.1";
    String PORT = "3306";

    String DB_NAME = "formularios";
    String TAB_NAME = "peticiones";
    String COL_ID = "id";
    String COL_NAME = "nombre";
    String COL_MAIL = "mail";
    String COL_LOCALIZACION = "localizacion";
    String COL_GENERO = "genero";
    String COL_EDAD = "edad";

}
