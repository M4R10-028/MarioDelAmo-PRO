package model;

public class Elemento {
    private String identificador, titulo, formato;
    private Persona autor;
    private int tamanio;

    public Elemento(){}
    public Elemento(String identificador, String titulo, String formato, Persona autor, int tamanio) {
        this.identificador = identificador;
        this.titulo = titulo;
        this.formato = formato;
        this.autor = autor;
        this.tamanio = tamanio;
    }

    public void mostrarDatos(){
        System.out.println("Identificador: " + identificador);
        System.out.println("Título: " + titulo);
        System.out.println("Formato: " + formato);
        System.out.println("Autor: " + autor.getNombre());
        System.out.println("Tamaño: " + tamanio + " MB");
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
}
