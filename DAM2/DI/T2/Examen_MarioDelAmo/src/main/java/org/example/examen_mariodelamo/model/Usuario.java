package org.example.examen_mariodelamo.model;

public class Usuario {
    private int id;
    private String nombre, mail, pass;

    public Usuario() {}

    public Usuario(int id, String nombre, String mail, String pass) {
        this.id = id;
        this.nombre = nombre;
        this.mail = mail;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
