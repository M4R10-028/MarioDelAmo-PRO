import java.util.Scanner;

public class Ejercicios {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();

    }

    public static void ejercicio1() {
        int n;
        int i = 0;
        String o;
        int np = 0;
        int ni = 0;
        int sp = 0;
        int si = 0;
        double mp = 0;
        double mi = 0;
        int cc = 0;

        do {
            System.out.println("INTRODUCE UN NUMERO");
            n = scanner.nextInt();

            System.out.println("0. Introducir otro numero");
            System.out.println("1. Suma de los numeros pares");
            System.out.println("2. Media de los numeros pares con decimales");
            System.out.println("3. Media de los numeros impares con decimales");
            System.out.println("4. Cuantos numeros se han introducido");
            System.out.println("5. Cuantos ceros, cuantos pares y cuantos impares se han introducido");
            System.out.println("6. Salir");
            System.out.println("Que opcion quieres ejecutar");
            o = scanner.next();

            i++;
            if (n == 0){
                cc++;

            }else if (n % 2 == 0) {
                np++;

                sp += n;

                mp = (double) sp / i;

            } else if (n % 2 == 1) {
                ni++;

                si += n;

                mi = (double) si / i;
            }


            switch (o){
                case "0":
                   break;
                case "1":
                    System.out.println(sp);
                    break;
                case "2":
                    System.out.println(mp);
                    break;
                case "3":
                    System.out.println(mi);
                    break;
                case "4":
                    System.out.println(i);
                    break;
                case "5":
                    System.out.println(cc + "\n");
                    System.out.println(np + "\n");
                    System.out.println(ni);
                    break;
                case "6":
                    System.out.println("Saliendo...");
                    n = -1;
                    break;
                default:
                    System.out.println("Esa no es una opción");
                    break;

            }


        }while (n >= 0);
        System.out.println("Terminando programa. . .");
    }

    public static void ejercicio2() {

        int notas;
        int i = 0;
        int ns = 0;
        double sn = 0;
        int notast = 0;
        do {
            System.out.println("INTRODUCE LAS NOTAS DE LA CLASE");
            notas = scanner.nextInt();
            i++;

            if (notas > 10 || notas < 0) {
                System.out.println("No es una nota valida");
                i--;
            }

            if (notas < 5){
                ns++;
            }
            notast += notas;
        } while (i <= 20);

        sn = (double) notast / i;

        System.out.println("La media de las notas de la clase es " + sn);
        System.out.println("Han suspendido " + ns + " personas");

    }

    public static void ejercicio3() {
        int o;
        final int PINf = 1111;
        int PIN = 0;
        int op = 0;
        double saldo = 250.52;
        double saldoi = 0;
        double saldor = 0;

        do {
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Estado actual de la cuenta");
            System.out.println("4. Salir");
            System.out.println("Que quieres hacer");
            o = scanner.nextInt();

            switch (o){
                case 1:
                    System.out.println("Introduce el PIN");
                    PIN = scanner.nextInt();
                    if (PIN != PINf) {
                        System.out.println("PIN incorrecto");
                        break;
                    }else {
                        System.out.println("PIN correcto\n" +
                                "Entrando...");
                        System.out.println("Cuanto saldo quiere introducir");
                        saldoi = scanner.nextDouble();
                        saldo += saldoi;
                    }
                    break;
                case 2:
                    System.out.println("Introduce el PIN");
                    PIN = scanner.nextInt();
                    if (PIN != PINf) {
                        System.out.println("PIN incorrecto");
                        break;
                    } else {
                        System.out.println("PIN correcto\n" +
                                "Entrando...");
                        System.out.println("Cuanto dinero quiere retirar");
                        saldor = scanner.nextDouble();


                        if (saldor > saldo) {
                            System.out.println("No tiene tanto saldo");
                            break;
                        } else {
                            System.out.println("Retirando el dinero...");
                            saldo -= saldor;
                        }
                    }
                case 3:
                    System.out.println("Introduce el PIN");
                    PIN = scanner.nextInt();

                    if (PIN != PINf) {
                        System.out.println("PIN incorrecto");
                        break;
                    } else {
                        System.out.println("PIN correcto\n" +
                                "Entrando...");
                        System.out.println("El saldo actual de la cuenta es de " + saldo + "€");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    op = -1;
                    break;
                default:
                    System.out.println("Esa no es una opción válida");
                    break;
            }
        } while (op != -1);
        System.out.println("Hasta la próxima!");
    }
    public static void ejercicio4() {
        String palabra;
        String palabrai;

        System.out.println("Introduce tu palabra");
        palabra = scanner.next();

        if (palabra.length() < 4) {
            String mayus = palabra.toUpperCase();
            System.out.println(mayus);

        } else if (palabra.length() < 8) {
            String minus = palabra.toLowerCase();
            System.out.println(minus);

        } else if (palabra.length() < 11) {
            String tilde = palabra.replaceAll("a","á").replaceAll("e", "é").replaceAll("i","í")
                    .replaceAll("o","ó").replaceAll("u","ú").replaceAll("A","Á")
                    .replaceAll("E","É").replaceAll("I","Í")
                    .replaceAll("O","Ó").replaceAll("U","Ú");
            System.out.println(tilde);
        } else {
            palabrai = "";
            for (int i = palabra.length() -1; i >= 0; i--) {
                palabrai += palabra.charAt(i);
            }
            System.out.println(palabrai);
        }
    }
}
