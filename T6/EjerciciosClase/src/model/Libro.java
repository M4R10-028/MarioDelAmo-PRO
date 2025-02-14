package model;

public class Libro extends Elemento {
    private String ISBN;
    private int numeroPaginas;

    public Libro(){}

    public Libro(String identificador, String titulo, String formato, Persona autor, int tamanio, String ISBN, int numeroPaginas) {
        super(identificador, titulo, formato, autor, tamanio);
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("ISBN: " + ISBN);
        System.out.println("Numero de páginas: " + numeroPaginas);
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
