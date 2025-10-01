package model;

abstract public class Videojuego {
    private String titulo, desarrollador;
    private int anoLanzamiento;
    private double precio;
    private ClasificacionEdad clasificacionEdad;

    public Videojuego() {
    }

    public Videojuego(String titulo, String desarrollador, int anoLanzamiento, double precio, ClasificacionEdad clasificacionEdad) {
        this.titulo = titulo;
        this.desarrollador = desarrollador;
        this.anoLanzamiento = anoLanzamiento;
        this.precio = precio;
        this.clasificacionEdad = clasificacionEdad;
    }

    public abstract void CalcularPrecioFinal();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public int getAnoLanzamiento() {
        return anoLanzamiento;
    }

    public void setAnoLanzamiento(int anoLanzamiento) {
        this.anoLanzamiento = anoLanzamiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ClasificacionEdad getClasificacionEdad() {
        return clasificacionEdad;
    }

    public void setClasificacionEdad(ClasificacionEdad clasificacionEdad) {
        this.clasificacionEdad = clasificacionEdad;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", desarrollador='" + desarrollador + '\'' +
                ", anoLanzamiento=" + anoLanzamiento +
                ", precio=" + precio +
                ", clasificacionEdad=" + clasificacionEdad +
                '}';
    }
}
