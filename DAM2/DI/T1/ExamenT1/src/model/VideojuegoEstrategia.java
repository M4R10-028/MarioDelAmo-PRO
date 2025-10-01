package model;

public class VideojuegoEstrategia extends Videojuego implements Descargable {

    private int complejidad, duracionPartida;
    private double tamanoGB;

    public VideojuegoEstrategia() {
    }

    public VideojuegoEstrategia(String titulo, String desarrollador, int anoLanzamiento, double precio, ClasificacionEdad clasificacionEdad, int complejidad, int duracionPartida, double tamanoGB) {
        super(titulo, desarrollador, anoLanzamiento, precio, clasificacionEdad);
        this.complejidad = complejidad;
        this.duracionPartida = duracionPartida;
        this.tamanoGB = tamanoGB;
    }

    @Override
    public void CalcularPrecioFinal() {
        if (complejidad > 0) {
            setPrecio(getPrecio() * 1.03);
        }
        if (complejidad > 1) {
            setPrecio(getPrecio() * 1.03);
        }
        if (complejidad > 2) {
            setPrecio(getPrecio() * 1.03);
        }
        if (complejidad > 3) {
            setPrecio(getPrecio() * 1.03);
        }
        if (complejidad > 4) {
            setPrecio(getPrecio() * 1.03);
        }

    }

    public int getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(int complejidad) {
        this.complejidad = complejidad;
    }

    public int getDuracionPartida() {
        return duracionPartida;
    }

    public void setDuracionPartida(int duracionPartida) {
        this.duracionPartida = duracionPartida;
    }

    @Override
    public String toString() {
        return "VideojuegoEstrategia{" +
                "complejidad=" + complejidad +
                ", duracionPartida=" + duracionPartida +
                '}';
    }

    @Override
    public int calcularTiempoDescarga(double velocidadInternet) {

        return (int) (tamanoGB / velocidadInternet);
    }

    @Override
    public double obtenerTamanoGB() {
        return tamanoGB;
    }
}
