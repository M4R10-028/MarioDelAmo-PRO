package model;

public class VideojuegoAccion extends Videojuego implements Descargable{

    private int nivelViolencia;
    private boolean modoMultijugador;
    private double tamanoGB;

    public VideojuegoAccion() {
    }

    public VideojuegoAccion(String titulo, String desarrollador, int anoLanzamiento, double precio, ClasificacionEdad clasificacionEdad,
                            int nivelViolencia, boolean modoMultijugador, double tamanoGB) {
        super(titulo, desarrollador, anoLanzamiento, precio, clasificacionEdad);
        this.nivelViolencia = nivelViolencia;
        this.modoMultijugador = modoMultijugador;
        this.tamanoGB = tamanoGB;
    }

    @Override
    public void CalcularPrecioFinal() {
        if (nivelViolencia > 3){
            setPrecio(getPrecio() * 1.05);
        }
        if (modoMultijugador){
            setPrecio(getPrecio() * 1.1);
        }
    }

    public int getNivelViolencia() {
        return nivelViolencia;
    }

    public void setNivelViolencia(int nivelViolencia) {
        this.nivelViolencia = nivelViolencia;
    }

    public boolean isModoMultijugador() {
        return modoMultijugador;
    }

    public void setModoMultijugador(boolean modoMultijugador) {
        this.modoMultijugador = modoMultijugador;
    }

    @Override
    public String toString() {
        return "VideojuegoAccion{" +
                "nivelViolencia=" + nivelViolencia +
                ", modoMultijugador=" + modoMultijugador +
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
