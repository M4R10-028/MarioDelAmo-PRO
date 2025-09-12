import java.util.Scanner;

public class EntradaOperaciones {
    public static void main(String[] args) {
        Object[] cosas = {5, "dam", true, 'a', 5.9, 7};
        for (int i = 0; i < cosas.length; i++) {

            if (cosas[i] instanceof String) {
                System.out.println(cosas[i]);
                System.out.println("La longitud de la palabra es " +
                        ((String) cosas[i]).length());
            }
        }
        //Operaciones de busquedas -> {12,31,43,545,36,78,86,9,790,1,}
        //7 --> recorro y termino cuando encuentro. Lo he encontrado item == elemento
        int[] numeros = {123,123234,565,6543,3,4,567,54,323,456};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero que quieres buscar");
        int numeroUsuario = scanner.nextInt();

        if (!estaNumero(numeroUsuario,numeros)){
            System.out.println("No está");
        }//true o false

    }
    public static boolean estaNumero(int numeroBuscar, int[] conjunto) {
        for (int item:conjunto) {

            //{4,7,1,9,3}
            //8

            if (item == numeroBuscar){
                System.out.println("Numero encontrado");
                return true;
            }
        }
        return false;
    }
}
