import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Escribe el primer numero entero");
        n1 = sc.nextInt();
        System.out.println("Escribe el segundo numero entero");
        n2 = sc.nextInt();

        if (n1 > n2){
            System.out.println("El primero es mas grande que el segundo");
        } else if (n2 > n1){
            System.out.println("El segundo es mas grande que el primero");
        } else {
            System.out.println("Los dos numeros son iguales");
        }
    }
}
