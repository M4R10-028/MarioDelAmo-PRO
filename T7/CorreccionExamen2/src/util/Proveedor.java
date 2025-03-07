package util;

public enum Proveedor {

    //tipos predefinidos
    MAHOU("Cerveza Mahou", 5, "Juan Gomez"),
    COCACOLA("Bebida Gaseosa", 10, "Julia Martinez"),
    COMIDASSL,
    BEBIDASSL("Bebidas generales", 0, "Maria Gomez");

    //variables
    private String nombre;
    private int descuento;
    private String contacto;

    //constructores
    Proveedor(){
        this.nombre = "sin nombre";
        this.descuento = 0;
        this.contacto = "sin contacto";
    }

    Proveedor(String nombre, int descuento, String contacto) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.contacto = contacto;
    }

    //metodos


    public String getNombre() {
        return nombre;
    }

    public int getDescuento() {
        return descuento;
    }

    public String getContacto() {
        return contacto;
    }
}
