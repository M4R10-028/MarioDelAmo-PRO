import java.util.Scanner;

public class Correccion {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
    }
    public static void ejercicio1() {
        int n = 0;
        int opcion;
        int nc = 0;
        int np = 0;
        int ni = 0;
        int sumatorioPares = 0;
        int sumatorioImpares = 0;
        double mediaPares = 0;
        double mediaImpares = 0;

        while (n >-1) {
            System.out.println("Introduce los numeros hasta que sea 1 negativo");
            n = scanner.nextInt();

            if (n > -1) {
                if (n % 2 == 0) {
                    np++;
                    sumatorioPares += n;
                    mediaPares = (double) sumatorioPares / np;
                } else {
                    ni++;
                    sumatorioImpares += n;
                    mediaImpares = (double) sumatorioImpares / ni;
                }
                if (n == 0){
                    nc++;
                }
            }
        }
        do {
            System.out.println("1. Suma de los numeros pares");
            System.out.println("2. Media de los numeros pares con decimales");
            System.out.println("3. Media de los numeros impares con decimales");
            System.out.println("4. Cuantos numeros se han introducido");
            System.out.println("5. Cuantos ceros, cuantos pares y cuantos impares se han introducido");
            System.out.println("6. Salir");
            System.out.println("Que opcion quieres ejecutar");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(sumatorioPares);
                    break;
                case 2:
                    System.out.println(mediaPares);
                    break;
                case 3:
                    System.out.println(mediaImpares);
                    break;
                case 4:
                    System.out.println((nc+np+ni));
                    break;
                case 5:
                    System.out.println(nc + np + ni);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Esta no es una opción válida");
            }
        }while (opcion==6);
    }
    public static void ejercicio2() {
        int veces = 0;
        int sumatorioNotas = 0;
        int sumatorioSuspensos = 0;
        int sumatorioAprovados = 0;

        for (int i = 0; i < 20; i++) {

            System.out.println("Introduce las notas de la clase");
            int n = scanner.nextInt();

            if (n > 10 || n < 0) {
                System.out.println("Esta no es una nota valida");
            } else if (n < 5){
                sumatorioSuspensos++;
            } else {
                sumatorioAprovados++;
            }
        }
    }
}

