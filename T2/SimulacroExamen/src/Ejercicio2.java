import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Escribe el nombre del primer participante");
        String participante1 = lectorTeclado.nextLine();

        System.out.println("Escribe el numero de jugadores que tenga el participante");
        int jugadores1 = lectorTeclado.nextInt();

        System.out.println("Presupuesto del participante");
        int presupuesto1 = lectorTeclado.nextInt();


        System.out.println("Escribe el nombre del segundo participante");
        lectorTeclado = new Scanner(System.in);
        String participante2 = lectorTeclado.nextLine();

        System.out.println("Escribe el numero de jugadores que tenga el participante");
        int jugadores2 = lectorTeclado.nextInt();

        System.out.println("Presupuesto del participante");
        int presupuesto2 = lectorTeclado.nextInt();


        System.out.println("Escribe el nombre del tercer participante");
        lectorTeclado = new Scanner(System.in);
        String participante3 = lectorTeclado.nextLine();

        System.out.println("Escribe el numero de jugadores que tenga el participante");
        int jugadores3 = lectorTeclado.nextInt();

        System.out.println("Presupuesto del participante");
        int presupuesto3 = lectorTeclado.nextInt();

        boolean jugador1 = jugadores1 >= 11;
        boolean jugador2 = jugadores2 >= 11;
        boolean jugador3 = jugadores3 >= 11;

        boolean par = jugadores2 % 2 == 0;

        boolean positivo1 = presupuesto1 >= 0;
        boolean positivo2 = presupuesto2 >= 0;
        boolean positivo3 = presupuesto3 >= 0;

        boolean listo = jugador1 && jugador2 && jugador3 && positivo1 && positivo2 && positivo3;

        System.out.printf("El primer participante tiene 11 jugadores: %b\n" +
                "El segundo participante tiene jugadores pares: %b\n" +
                "El tercer participante tiene presupuesto positivo: %b\n" +
                "La liga está preparada para empezar: %b", jugadores1, par, positivo3, listo);




    }

}
