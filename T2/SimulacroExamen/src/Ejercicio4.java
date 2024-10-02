import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        int pagoi = 30000;

        int meses = 6;

        float pagomes = (float)pagoi / meses;

        double intereses = 0.035;
        double mes1 = pagoi * intereses;

        intereses += 0.035;
        int pago = pagoi - (int)pagomes;
        double mes2 = pago * intereses;

        intereses += 0.035;
        int pago1 = pago - (int) pagomes;
        double mes3 = pago1 * intereses;

        intereses += 0.035;
        int pago2 = pago1 - (int) pagomes;
        double mes4 = pago2 * intereses;

        intereses += 0.035;
        int pago3 = pago2 - (int)pagomes;
        double mes5 = pago3 * intereses;

        intereses += 0.035;
        int pago4 = pago3 - (int) pagomes;
        double mes6 = pago4 * intereses;

        System.out.printf("El interés pagado (3,5) en el primer mes es de %.1f el 3,5 de %s\n" +
                "El interés pagado (7) en el segundo mes es de %.1f el 7 de %s\n" +
                "El interés pagado (10,5) en el tercer mes es de %.1f el 10,5 de %s\n" +
                "El interés pagado (14) en el cuarto mes es de %.1f el 14 de %s\n" +
                "El interés pagado (17,5) en el quinto mes es de %.1f el 17,5 de %s\n" +
                "El interés pagado (21) en el sexto mes es de %.1f el 21 de %s",
                mes1, pagoi, mes2, pago, mes3, pago1, mes4, pago2, mes5, pago3, mes6,pago4);

    }
}
