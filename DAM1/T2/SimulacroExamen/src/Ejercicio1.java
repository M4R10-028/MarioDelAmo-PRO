import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("Dime tu nombre");
        String nombre = lectorTeclado.next();

        System.out.println("Dime tu apellido");
        lectorTeclado = new Scanner(System.in);
        String apellido = lectorTeclado.nextLine();

        System.out.println("Dime tu edad");
        int edad = lectorTeclado.nextInt();

        System.out.println("Dime tu altura");
        float altura = lectorTeclado.nextFloat();

        System.out.println("Dime tu peso");
        float peso = lectorTeclado.nextFloat();

        System.out.println("Dime tu sexo");
        //char sexo = lectorTeclado.next().charAt(0);
        String sexo = lectorTeclado.next();

        float imc = calculoIMC(peso,altura);
        System.out.printf("Hola %s %s tu IMC " +
                "teniendo en cuenta tu altura de %.2fm y " +
                "tu peso de %.2fkg, tiene un valor de %.2f\n",nombre,apellido, altura, peso, imc);
    }
    public static float calculoIMC (float peso, float altura){

        return (float) (peso / Math.pow(altura,2));

    }
}
