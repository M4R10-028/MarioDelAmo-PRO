package controller;

import dto.AlumnoDTO;
import model.Alumno;

public class CentroController {
    private AlumnoDTO alumnoDTO;

    public CentroController(AlumnoDTO alumnoDTO) {
        this.alumnoDTO = alumnoDTO;
    }

    public void insertarUsuario(Alumno alumno){
        alumnoDTO.insertarUsuario(alumno);
    }
}
