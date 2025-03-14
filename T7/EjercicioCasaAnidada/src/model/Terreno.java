package model;

import utils.Orientacion;

public class Terreno {
    private Casa casa;
    private int m2;
    private double valoracion;
    private Orientacion orientacion;

    public Terreno() {
    }

    public Terreno(int m2, double valoracion, Orientacion orientacion) {
        this.m2 = m2;
        this.valoracion = valoracion;
        this.orientacion = orientacion;
    }

    public void revalorizacion(){
        if (casa != null){
            if (casa.getM2c() > 100){
                valoracion *= 1.3;
            } else {
                valoracion *= 1.25;
            }
            if (casa.isPiscina()){
                valoracion *= 1.5;
            }
            if (casa.getOrientacionc().name().equalsIgnoreCase("norte")||casa.getOrientacionc().name().equalsIgnoreCase("sur")){
                valoracion *= casa.getOrientacionc().getValor();
            } else {
                valoracion *= casa.getOrientacionc().getValor();
            }
        } else {
            if (orientacion.name().equalsIgnoreCase("norte")||orientacion.name().equalsIgnoreCase("sur")){
                valoracion *= orientacion.getValor();
            } else {
                valoracion *= orientacion.getValor();
            }
        }
    }

    public void construirCasa(int metros2){
        if (casa == null && m2 > metros2){
            casa = new Casa(metros2);
        } else {
            System.out.println("Ya existe una casa en el terreno");
        }
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(Orientacion orientacion) {
        this.orientacion = orientacion;
    }

    public class Casa {
        private int m2c;
        private boolean piscina;
        private int habitaciones;
        private Orientacion orientacionc;

        public Casa() {}
        public Casa(int m2){
            this.m2c = m2;
            casa = this;
        }

        public Casa(int m2, boolean piscina, int habitaciones, Orientacion orientacion) {
            this.m2c = m2;
            this.piscina = piscina;
            this.habitaciones = habitaciones;
            orientacionc = orientacion;
            casa = this;
        }

        public void construirHabitacion(int m2){
            if (this.m2c >= m2){
                habitaciones++;
                this.m2c -= m2;
            }
        }

        public void construirPiscina(){
            if (!piscina){
                piscina = true;
            } else {
                System.out.println("Ya hay una piscina en la casa");
            }
        }

        public void construirAnexo(int m2a){
            if (m2 >= m2a){
                m2 -= m2a;
                System.out.println("Se ha podido construir el anexo");
            } else {
                System.out.println("No hay espacio en el terreno para construir un anexo así");
            }
        }

        public void mostrarDatosCasa(){
            System.out.println("Metro cuadrados de la casa = " + m2c);
            System.out.println("Tiene piscina = " + piscina);
            System.out.println("Numero de habitaciones = " + habitaciones);
            System.out.println("orientacion = " + orientacion);
        }

        public int getM2c() {
            return m2c;
        }

        public void setM2c(int m2c) {
            this.m2c = m2c;
        }

        public boolean isPiscina() {
            return piscina;
        }

        public void setPiscina(boolean piscina) {
            this.piscina = piscina;
        }

        public int getHabitaciones() {
            return habitaciones;
        }

        public void setHabitaciones(int habitaciones) {
            this.habitaciones = habitaciones;
        }

        public Orientacion getOrientacionc() {
            return orientacionc;
        }

        public void setOrientacionc(Orientacion orientacionc) {
            this.orientacionc = orientacionc;
        }
    }
}
