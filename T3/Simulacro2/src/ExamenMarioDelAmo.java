import java.util.Scanner;

public class ExamenMarioDelAmo {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicio1();
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
}
