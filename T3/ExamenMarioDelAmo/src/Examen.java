import java.util.Scanner;

public class Examen {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        ejercicio4();
    }

    public static void ejercicio1() {
        int n1;
        int n2;
        int n;
        int opcion = -1;
        do {
            System.out.println("Escribe el primer operando");
            n1 = scanner.nextInt();
            System.out.println("Escribe el segundo operando");
            n2 = scanner.nextInt();
            if (n1 >= 0 && n2 >= 0) {
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.println("5. Salir");
                System.out.println("Que operación quieres hacer");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        n = n1 + n2;
                        System.out.println("La suma de los dos operandos es de " + n);
                        break;
                    case 2:
                        n = n1 - n2;
                        System.out.println("La resta entre los dos operandos es de " + n);
                        break;
                    case 3:
                        n = n1 * n2;
                        System.out.println("La multiplicación entre los dos operandos es de " + n);
                        break;
                    case 4:
                        float d = (float) n1 / n2;
                        System.out.println("La división entre los dos operandos es de " + d);
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Esa no es una opción válida");
                        break;
                }
            } else {
                System.out.println("Los dos operandos tienen que ser positivos o no se podrá realizar las operaciones");
            }
        } while (opcion != 5);
    }

    public static void ejercicio2() {
        int n;
        int bonoloto;
        int sumatorio = 0;
        int ng = 0;
        int np = 100;
        String p = "";
        boolean premio = false;

        System.out.println("Introduce el numero de tu bonoloto (1-100)");
        n = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            bonoloto = (int) ((Math.random() * 100) + 1);

            if (bonoloto > ng) {
                ng = bonoloto;
            }
            if (bonoloto < np) {
                np = bonoloto;
            }
            sumatorio += bonoloto;

            if (n == bonoloto) {
                premio = true;
            }
        }
        System.out.println("El numero más grande ha sido el " + ng);
        System.out.println("El numero más pequeño ha sido el " + np);
        System.out.println("La media de los numeros que ha salido es de " + (double) sumatorio / 10);
        System.out.println("La suma de todos los numeros generados es de " + sumatorio);
        if (premio == true) {
            System.out.println("Tu numero ha sido premiado");
        } else {
            System.out.println("Tu numero no ha sido premiado");
        }
    }

    public static void ejercicio3() {

        final int clave = 4852;
        int n = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce la clave de la caja fuerte:");
            n = scanner.nextInt();

            if (i >= 2) {
                System.out.println("Le queda su último intento");
                n = scanner.nextInt();

                if (n == clave) {
                    System.out.println("Perfecto, la caja ha sido abierta");
                } else {
                    System.out.println("Lo siento, caja bloqueada");
                    i = 1000;
                }
            }
            if (n == clave && i < 2) {
                System.out.println("Perfecto, la caja ha sido abierta");
                i = 10000;
            } else if (n != clave && i < 2) {
                System.out.println("Intento fallido, intentelo de nuevo");
            }
        }
    }

    public static void ejercicio4() {
        int n;
        char opcion = 0;
        String numero = "";
        String numeroc = "";
        String numerot = "1";
        char numerof;


        System.out.println("Introduce un numero para operar");
        n = scanner.nextInt();

        if (n >= 0) {
            System.out.println("a. Base 2");
            System.out.println("b. Base 8");
            System.out.println("c. Base 16");
            System.out.println("Que operacion desea realizar");
            opcion = scanner.next().toLowerCase().charAt(0);

            switch (opcion) {
                case 'a':
                    while (n > 1) {
                        int i = 0;
                        numero = String.valueOf(n % 2);
                        numeroc += numero;
                        i++;
                        n /= 2;
                    }
                    for (int i = numeroc.length() - 1; i >= 0; i--) {
                        numerof = numeroc.charAt(i);
                        numerot += numerof;
                    }
                    System.out.println(numerot);
                    break;
                case 'b':
                    while (n > 7) {
                        int i = 0;
                        numero = String.valueOf(n % 8);
                        numeroc += numero;
                        i++;
                        n /= 8;
                    }
                    for (int i = numeroc.length() - 1; i >= 0; i--) {
                        numerof = numeroc.charAt(i);
                        numerot += numerof;
                    }
                    System.out.println(numerot);
                    break;
                case 'c':
                    while (n > 15) {
                        int i = 0;
                        numero = String.valueOf(n % 16);
                        if (numero.equals(String.valueOf(15))) {
                            numero = "F";
                        } else if (numero.equals(String.valueOf(14))) {
                            numero = "E";
                        } else if (numero.equals(String.valueOf(13))) {
                            numero = "D";
                        } else if (numero.equals(String.valueOf(12))) {
                            numero = "C";
                        } else if (numero.equals(String.valueOf(11))) {
                            numero = "B";
                        } else if (numero.equals(String.valueOf(10))) {
                            numero = "A";
                        }
                        numeroc += numero;
                        i++;
                        n /= 16;
                    }
                    for (int i = numeroc.length() - 1; i >= 0; i--) {
                        numerof = numeroc.charAt(i);
                        numerot += numerof;
                    }
                    System.out.println(numerot);
                    break;
                default:
                    System.out.println("Esa no es una opción válida");
                    break;
            }
        } else {
            System.out.println("No se puede realizar la operacion debido a que el numero introducido es negativo.");
        }

    }
}


