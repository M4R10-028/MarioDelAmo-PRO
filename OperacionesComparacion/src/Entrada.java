public class Entrada {
    public static void main(String[] args) {
        System.out.println("OPERADORES DE COMPARACION");
        //nos dejan comparar numeros y booleanos, nunca strings (palabras)
        int n1 = 40;
        int n2 = 30;
        boolean r = n1 > n2; // mayor que
        System.out.printf("El resultado de la comparacion de %d mayor que %d es %b. \n", n1, n2, r);
        r = n2 < n1; // menor que
        System.out.printf("El resultado de la comparacion de %d menor que %d es %b. \n", n2, n1, r);
        r = n1 >= n2; // mayor o igual
        System.out.printf("El resultado de la comparacion de %d mayor o igual que %d es %b. \n", n1, n2, r);
        n2 = 80;
        n1 = 30;
        r = n2 <= n1; // menor o igual
        System.out.printf("El resultado de la comparacion de %d menor o igual que %d es %b. \n", n2, n1, r);
        n1 = 90;
        n2 = 90;
        r = n1 == n2; // igual que
        System.out.printf("El resultado de la comparacion de %d igual que %d es %b. \n", n1, n2, r);
        r = n1 != n2; // diferente que
        System.out.printf("El resultado de la comparacion de %d diferente que %d es %b. \n", n1, n2, r);
        r = !r; // true
    

    }
}
