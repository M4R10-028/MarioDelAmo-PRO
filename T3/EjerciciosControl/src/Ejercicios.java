import java.util.Scanner;

public class Ejercicios {

    static Scanner lectorTeclado = new Scanner(System.in);
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        ejercicio3();
    }
    public static void ejercicio1(){
        System.out.println("Dime un numero entero");
        int a = lectorTeclado.nextInt();
        String s = "es impar";
        if( a % 2 == 0){
            s = "es par";
        }
        System.out.println("Tu numero " + s);

    }
    public static void ejercicio2(){
        System.out.println("Dime un numero entero");
        int a = lectorTeclado.nextInt();

        if(a % 2 == 0){
            a += 1;
        }else if (a < 10){
            a -= 1;
        }else if (a < 100){
            a *= 2;
            a++;
        }else{
            a = 0;
        }
        System.out.println(a);
    }
    public static void ejercicio3(){
        System.out.println("Dime un numero entero");
        int a = lectorTeclado.nextInt();

        String s = null;
        if(a < 10){
            if (a < 0){
                s = "numero negativo";
            }else{
                s = "un digito";
            }
        }else if(a <= 99){
            s = "dos digitos";
        }else{
            s = "tres digitos o más";
        }
        System.out.println(s);
    }

}




