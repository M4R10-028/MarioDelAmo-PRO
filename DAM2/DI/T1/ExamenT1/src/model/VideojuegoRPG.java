package model;

public class VideojuegoRPG extends Videojuego implements Descargable {

    private boolean mundoAbierto;
    private int horasHistoria, horasPrecio;
    private double tamanoGB;

    public VideojuegoRPG() {
    }

    public VideojuegoRPG(String titulo, String desarrollador, int anoLanzamiento, double precio, ClasificacionEdad clasificacionEdad, boolean mundoAbierto, int horasHistoria, double tamanoGB) {
        super(titulo, desarrollador, anoLanzamiento, precio, clasificacionEdad);
        this.mundoAbierto = mundoAbierto;
        this.horasHistoria = horasHistoria;
        this.tamanoGB = tamanoGB;
    }

    @Override
    public void CalcularPrecioFinal() {
        if (mundoAbierto) {
            setPrecio(getPrecio() * 1.15);
        }
        horasPrecio = (horasHistoria / 10);
        for (int i = 0; i < horasPrecio; i++) {
            setPrecio(getPrecio() * 1.02);
        }
    }

    public boolean isMundoAbierto() {
        return mundoAbierto;
    }

    public void setMundoAbierto(boolean mundoAbierto) {
        this.mundoAbierto = mundoAbierto;
    }

    public int getHorasHistoria() {
        return horasHistoria;
    }

    public void setHorasHistoria(int horasHistoria) {
        this.horasHistoria = horasHistoria;
    }

    public int getHorasPrecio() {
        return horasPrecio;
    }

    public void setHorasPrecio(int horasPrecio) {
        this.horasPrecio = horasPrecio;
    }

    @Override
    public String toString() {
        return "VideojuegoRPG{" +
                "mundoAbierto=" + mundoAbierto +
                ", horasHistoria=" + horasHistoria +
                ", horasPrecio=" + horasPrecio +
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
