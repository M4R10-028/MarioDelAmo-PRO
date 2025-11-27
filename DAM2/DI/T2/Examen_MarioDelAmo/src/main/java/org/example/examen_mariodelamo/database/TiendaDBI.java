package org.example.examen_mariodelamo.database;

public interface TiendaDBI {
    String DB_NAME = "tienda";
    String DB_USER = "root";
    String DB_PASS = "root";
    String DB_SERVER = "3306";

    String US_NAME = "usuarios";
    String COLUS_ID = "id";
    String COLUS_NOMBRE = "nombre";
    String COLUS_MAIL = "correo";
    String COLUS_PASS = "pass";

    String PR_NAME = "productos";
    String COLPR_ID = "id";
    String COLPR_NOMBRE = "nombre";
    String COLPR_CATEGORIA = "categoria";
    String COLPR_PRECIO = "precio";
}
