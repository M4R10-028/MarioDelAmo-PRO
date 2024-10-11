import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Ejercicios {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        ejercicio4();
    }

    public static void ejercicio2() {
        System.out.println("De que número quieres ver la tabla de multiplicar");
        int n = scanner.nextInt();

        for (int i=0; i<11; i++){
            int r = n * i;
            System.out.println(n + " * " + i + " = " + r);
        }
    }

    public static void ejercicio1() {
        System.out.println("Cuantas temperaturas quieres introducir");
        float n = scanner.nextInt();

        float temperatura=0;
        float sumatorio=0;
        if (n <= 0){
            n=10;
        }
        for (int i=0; i<n; i++){
            System.out.printf("Dime la %d temperatura", i+1);
            temperatura = scanner.nextFloat();
            sumatorio = sumatorio + temperatura;
        }
        float media= sumatorio / n;
        System.out.printf("La suma de todas las temperaturas es %.2f\nLa media de las temperaturas es de %.2f",sumatorio, media);
    }

    public static void ejercicio3() {
        System.out.println("Hasta que numero quieres saber la tabla de multiplicar");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            for (int x = 0; x < 11; x++) {
                int r = i * x;
                System.out.println("\t" + i + " * " + x + " = " + r);
            }
        }
    }

    public static void ejercicio4() {
        System.out.println("Desde que numero quieres saber las tablas de multiplicar");
        int ni = scanner.nextInt();

        System.out.println("Hasta que numero quieres saber la tabla de multiplicar");
        int n = scanner.nextInt();

        if (ni>=n){
            System.out.println("No se puede ejecutar");
        }else{

        for (int i = ni; i < n+1; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            for (int x = 0; x < 11; x++) {
                int r = i * x;
                System.out.println("\t" + i + " * " + x + " = " + r);
            }
        }
        }
    }
}



