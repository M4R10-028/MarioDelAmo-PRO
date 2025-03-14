package model;

public enum Tipo {
    Familiar("Familiar"),
    Infantil("Infantil");

    private String nombre;

    Tipo() {
    }

    Tipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
