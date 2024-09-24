public class Entrada {

        static int edadClase = 50;
    //mod_acc mod_adional mod_ret nombre (argumentos) { cuerpo }
    public static void main (String[]args){
        // edadClase =20
        System.out.println("Proyecto de variables");
        valoresMaximos();

        // Tipo nombre = valor (el valor es opcional)
        String nombre = "Mario";
        final String CIF = "B12345"; // con el modificador "final" hago que la variable sea constante.
                                     //las variables finales van siempre en mayúscula.

        char letra = 'A';
        Character letraCompleja = 'a';

        short nunmeroPequeno = 23; // numero pequeño (-255,255)
        Short pequenoComplejo = 23;
        //pequenoComplejo


        int edad = 18; //numeros sin decimal (-65.435, 65.435)
        Integer edadCompleja = 18;

        System.out.println("Mi edad es "+edad);
        edad = 19;
        System.out.println("Cambiando edad");
        System.out.println("Mi edad es "+edad);

        long telefono = 123456789;
        Long telefonoComplejo = 123123123L;

        float altura = 3.14f;
        Float alturaCompleja = 4.123123f;

        double decimalesDetalle = 3.14163456;
        Double decimalesComplejos;

        boolean carnet = true; // false
        Boolean carnetComplejo;
    }
    public static void miMetodo(){
        String nombre = "Julia";
        int edad = 40;
        edadClase = 80;
    }

    public static void otroMetodo(){
        int edadClase = 90;
        //this.edadClase = 90;

    }

    public static void valoresMaximos(){

    }
}
