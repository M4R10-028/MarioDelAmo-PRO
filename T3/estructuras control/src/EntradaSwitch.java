public class EntradaSwitch {

    public static void main(String[] args) {
        //Switch --> Depende de un valor (string, char, int,...)(los que están escritos son los recomendados)

        int numero = 0;

        switch (numero){
            case 0:
                int edad = 10;
                //cuerpo
                System.out.println("El valor es 0");
                break;
            case 5:
                edad = 13;
                System.out.println(edad);
                System.out.println("El valor es 5");
                break;
            case 10:
                System.out.println("El valor es 10");
                break;
            default:
                System.out.println("El valor no está contemplado");
        }

        String mes = "Enero";

        switch (mes){
            case "Enero":
                break;
            case "Febrero":
                break;
            case "Marzo":
                break;
        }

        char letra = 'Z';

        switch (letra){
            case'A':
                break;
            case'Z':
                break;
            case 'B':
                break;
        }
        System.out.println("Terminando el bloque");

    }
}
