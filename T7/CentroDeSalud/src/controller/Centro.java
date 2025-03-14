package controller;

import model.*;
import utils.TipoDoctorNoEsta;

import java.util.ArrayList;
import java.util.Scanner;

public class Centro<S,T> {
    static Scanner sc = new Scanner(System.in);
    ArrayList<S> lista;
    ArrayList<T> listaC;

    public void mostrarDatosLista() {
        for (S persona : lista) {
            ((Persona) persona).mostrarDatos();
        }
    }

    public void verCitas(Persona persona) {
        for (T cita : listaC) {
            if (((Cita) cita).getPaciente().getNss() == ((Paciente) persona).getNss() || ((Cita) cita).getDoctor().getNumeroColegiado() == ((Doctor) persona).getNumeroColegiado()) {
                ((Cita) cita).mostrarDatosCita();
            }
        }
    }

    private Paciente estaPaciente(int Nss) {
        for (S paciente : lista) {
            if (((Paciente) paciente).getNss() == Nss) {
                return ((Paciente) paciente);
            }
        }
        return null;
    }

    private Doctor estaTipoDoctor(String tipo) throws TipoDoctorNoEsta {
        if (tipo.equalsIgnoreCase("Digestivo")) {
            for (S doctor : lista) {
                if (((Doctor) doctor).getNumeroColegiado() == ((Digestivo) doctor).getNumeroColegiado()) {
                    return (Digestivo) doctor;
                }
                throw new TipoDoctorNoEsta("No esta ese tipo de Doctor");
            }
        } else if (tipo.equalsIgnoreCase("General")) {
            for (S doctor : lista) {
                if (((Doctor) doctor).getNumeroColegiado() == ((General) doctor).getNumeroColegiado()) {
                    return (General) doctor;
                }
                throw new TipoDoctorNoEsta("No esta ese tipo de Doctor");
            }
        } else if (tipo.equalsIgnoreCase("Traumatologia")) {
            for (S doctor : lista) {
                if (((Doctor)doctor).getNumeroColegiado() == ((Traumatologia) doctor).getNumeroColegiado()) {
                    return (Traumatologia) doctor;
                }
                throw new TipoDoctorNoEsta("No esta ese tipo de Doctor");
            }
        } else {
            throw new TipoDoctorNoEsta("Ese no es un tipo de Doctor");
        }
        return null;
    }




    public void pedirCita(int Nss) throws TipoDoctorNoEsta {
        if (estaPaciente(Nss) != null){
            System.out.println("Dime la especialidad de la Cita ( Digestivo / General / Traumatologia ) ");
            String tipo = sc.next();
            System.out.println("Dime la fecha que quieres la cita");
            Scanner scanner;
            String fecha = sc.next();
            Cita cita = new Cita(fecha, tipo, estaTipoDoctor(tipo), estaPaciente(Nss));
        }
    }

}
