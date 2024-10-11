public class EntradaMaximosYMinimos {

    public static void main (String[] args){
        System.out.println("Vamos a mostrar los minimos y los maximos de cada tipo");
        valoresMaximos();
        System.out.println("Terminando la ejecución.....");
    }

    public static void valoresMaximos(){
        //byte, short, int, long, float, double
        System.out.println("El tipo byte tiene un maximo de " + Byte.MAX_VALUE + "y un minimo de " + Byte.MIN_VALUE + ".");
        System.out.println("El tipo de short tiene un maximo de " + Short.MAX_VALUE + " y un minimo de " + Short.MIN_VALUE + ".");
        System.out.println("El tipo de int tiene un maximo de " + Integer.MAX_VALUE + " y un minimo de " + Integer.MIN_VALUE + ".");
        System.out.println("El tipo de long tiene un maximo de " + Long.MAX_VALUE + " y un minimo de " + Long.MIN_VALUE + ".");
        System.out.println("El tipo de double tiene un maximo de " + Double.MAX_VALUE + " y un minimo de " + Double.MIN_VALUE + ".");
        System.out.printf("El tipo de float tiene un maximo de %2f y un minimo de %2f.\n" , Float.MAX_VALUE, Float.MIN_VALUE);
        // En los printf para palabras se utliliza %s, para los numeros enteros se usa el %d y para los numeros con decimales se utiliza el %f.
        // Para el %f se puede poner de diferentes formas dependiendo si quieres sacar unos u otros decimales, por ejemplo para sacar el numero con todos sus decimales se usa el %f, pero si quiero sacar 5 decimales uso %.5f y asi con los que quiera.
    }
}