package model;

public class ClasePadre {
    private String nombrePadre, apellidoPadre, correoPadre;
    private int edadPadre;
    private ClaseHija hija;

    public ClasePadre() {
    }

    public ClasePadre(String nombrePadre, String apellidoPadre, String correoPadre, int edadPadre, ClaseHija hija) {
        this.nombrePadre = nombrePadre;
        this.apellidoPadre = apellidoPadre;
        this.correoPadre = correoPadre;
        this.edadPadre = edadPadre;
        this.hija = hija;

    }

    public void mostrarDatos(){
        System.out.println("nombrePadre = " + nombrePadre);
        System.out.println("apellidoPadre = " + apellidoPadre);
        System.out.println("edadPadre = " + edadPadre);
        System.out.println("correoPadre = " + correoPadre);
        System.out.println("nombrePadre = " + nombrePadre);
        if (hija != null){
            System.out.println("Tengo una hija con los siguientes datos");
            hija.mostrarDatos();
        }

    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getApellidoPadre() {
        return apellidoPadre;
    }

    public void setApellidoPadre(String apellidoPadre) {
        this.apellidoPadre = apellidoPadre;
    }

    public String getCorreoPadre() {
        return correoPadre;
    }

    public void setCorreoPadre(String correoPadre) {
        this.correoPadre = correoPadre;
    }

    public int getEdadPadre() {
        return edadPadre;
    }

    public void setEdadPadre(int edadPadre) {
        this.edadPadre = edadPadre;
    }

    public ClaseHija getHija() {
        return hija;
    }

    public void setHija(ClaseHija hija) {
        this.hija = hija;
    }

    public class ClaseHija {
        private String nombreHija, apellidoHija, correoHija;
        private int edadHija;

        public ClaseHija(String nombreHija, String apellidoHija, String correoHija, int edadHija) {
            this.nombreHija = nombreHija;
            this.apellidoHija = apellidoHija;
            this.correoHija = correoHija;
            this.edadHija = edadHija;
            hija = this;
        }

        public ClaseHija() {
        }

        public void mostrarDatos(){
            System.out.println("nombreHija = " + nombreHija);
            System.out.println("apellidoHija = " + apellidoHija);
            System.out.println("correoHija = " + correoHija);
            System.out.println("edadHija = " + edadHija);
        }
    }
}
