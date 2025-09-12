package EjercicioTrabajadores.model;

final public class Jefe extends Trabajadores implements Beneficiario{
    private int acciones, beneficio;

    public Jefe() {
    }

    public Jefe(String nombre, String apellido, String dni, double sueldo) {
        super(nombre, apellido, dni, sueldo);
    }

    public Jefe(String nombre, String apellido, String dni ,double sueldo, int acciones, int beneficio) {
        super(nombre, apellido, dni, sueldo);
        this.acciones = acciones;
        this.beneficio = beneficio;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("acciones = " + acciones);
        System.out.println("beneficio = " + beneficio);
    }

    @Override
    public void repartirBeneficios(int beneficio) {
        double beneficioTotal = beneficio * acciones;
        setSalario(getSalario() + beneficioTotal);
    }

    public double getAcciones() {
        return acciones;
    }

    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }

    public double getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }
}
