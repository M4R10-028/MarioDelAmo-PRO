package utils;

public enum Orientacion {
    NORTE(1.1),
    SUR(1.1),
    ESTE(1.05),
    OESTE(1.05);
    private double valor;

    Orientacion(double valor){
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
