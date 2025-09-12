import java.util.Scanner;

public class Ejercicio2 {

    static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {
         int ganador = (int) ((Math.random()*9000)+1000);

        System.out.println("Escribe un numero entre el 1000 y el 9999");
        int numero = lectorTeclado.nextInt();

        int millarg = ganador/1000;
        int ganador1 = ganador - millarg*1000;
        int centenasg = ganador1/100;
        int ganador2 = ganador1 - centenasg*100;
        int decenasg = ganador2/10;
        int ganador3 = ganador2 - decenasg*10;
        int unidadesg = ganador3;

        int millarn = numero/1000;
        int numero1 = numero - millarn*1000;
        int centenasn = numero1/100;
        int numero2 = numero1 - centenasn*100;
        int decenasn = numero2/10;
        int numero3 = numero2 - decenasn*10;
        int unidadesn = numero3;

        boolean millar = millarn == millarg;
        boolean centenas = centenasg == centenasn;
        boolean decenas = decenasn == decenasg;
        boolean unidades = unidadesn == unidadesg;
        boolean n = numero == ganador;

        System.out.printf("Has acertado las unidades: %b\n" +
                "Has acertado las decenas: %b\n" +
                "Has acertado las centenas: %b\n" +
                "Has acertado los millares: %b\n" +
                "Has acertado el numero: %b", unidades, decenas, centenas, millar, n);
    }
}
