import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
        //ejercicio11();
        //ejercicio12();
        //ejercicio13();
        //ejercicio14();
        //ejercicio15();

        //ejercicioDiez();
        //ejercicioQuince();

    }
    static Scanner lectorTeclado = new Scanner(System.in);
    public static void ejercicio1() {
        final String NOMBRE = "Mario Del Amo Tébar";
        final String CALLE = "C/Ginebra";
        final int PORTAL = 5;
        final int PISO = 2;
        final char LETRA = 'B';
        final int CODIGO = 28931;
        final String POBLACION = "Mostoles";
        final String LOCALIDAD = "Madrid";
        final String PAIS = "España";
        System.out.println(NOMBRE);
        System.out.printf("%s nº%d %d%c\n",CALLE, PORTAL, PISO, LETRA);
        System.out.printf("%d, %s %s\n", CODIGO, POBLACION, LOCALIDAD);
        System.out.println(PAIS);
    }

    public static void ejercicio2() {
        String nombre;
        System.out.println("Por favor escribe tu nombre completo");
        nombre = lectorTeclado.nextLine();

        int edad;
        System.out.println("Ahora escribe tu edad");
        edad = lectorTeclado.nextInt();

        System.out.printf("Te llamas %s y tienes %d años\n Pulse enter para continuar...", nombre, edad);
    }

    public static void ejercicio3() {
        int numero1;
        System.out.println("Escribe el primer numero entero");
        numero1 = lectorTeclado.nextInt();

        int numero2;
        System.out.println("Escribe tu segundo numero entero");
        numero2 = lectorTeclado.nextInt();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicaión = numero1 * numero2;
        int divisionent = numero1 / numero2;
        int restoent = numero1 % numero2;
        float divisionreal = (float) numero1 / numero2;
        float restoreal = (float) numero1 % numero2;

        System.out.printf("La suma de estos numero es %d\nLa resta de estos numeros es %d\nLa multiplicación de estos numeros es %d\n" +
                "La división entera de estos numeros es %d\nEl resto entero de estos numeros es %d\nLa división real de estos numeros es %f\nEl resto real de estos numeros es %f",
                suma, resta, multiplicaión, divisionent, restoent, divisionreal, restoreal);
    }

    public static void ejercicio4() {
        double bebida = 1.25;
        double bocadillo = 2.05;
        int nbocadillos;
        System.out.println("¿Cuantos bocadillos quieres?");
        nbocadillos = lectorTeclado.nextInt();

        int nbebidas;
        System.out.println("¿Cuantas bebidas quieres?");
        nbebidas = lectorTeclado.nextInt();

        double precioBebidas = bebida * nbebidas;
        double precioBocadillos = bocadillo * nbocadillos;
        double precioTotal = precioBocadillos + precioBebidas;

        System.out.printf("Producto\tUnidades Precio\nBebida  \t%d\t\t %f\nBocadillo\t%d\t\t %f\nPrecio Total\t\t %f",nbebidas, precioBebidas, nbocadillos, precioBocadillos, precioTotal);
    }

    public static void ejercicio5() {

        int segundosin;
        System.out.println("Cuantos segundos quieres descomponer");
        segundosin = lectorTeclado.nextInt();

        int horas = segundosin / 3600;
        int segundos = segundosin - 3600*horas;
        int min = segundos / 60;
        int segundosfin = segundos - 60*min;

        System.out.printf("Los %d segundos iniciales son, %d horas, %d min y %d segundos", segundosin, horas, min, segundosfin);
    }

    public static void ejercicio6() {

        float valorCompra;
        System.out.println("Cual es el precio total de la compra?");
        valorCompra = lectorTeclado.nextFloat();

        String ValorIva = "21%";
        float iva = (float) (valorCompra * 0.21);
        float precioCompra = valorCompra - iva;

        System.out.printf("IVA = %s\n" +
                "Compra = %.2f\n" +
                "IVA precio = %.2f\n" +
                "Total de la compra = %.2f", ValorIva, precioCompra, iva, valorCompra);
    }

    public static void ejercicio7() {

        int radioCir;
        System.out.println("Escribe el radio de tu circunferencia");
        radioCir = lectorTeclado.nextInt();

        float longitud;
        longitud = (float) (2 * Math.PI * radioCir);

        float areaDelCirculo;
        areaDelCirculo = (float) (Math.PI * (radioCir * radioCir));

        System.out.printf("La circunferencia de radio %d, tiene una longitud de %.2f y su area es %.2f", radioCir, longitud, areaDelCirculo);
    }

    public static void ejercicio8() {

        float centigrados;
        System.out.println("¿Cuantos grados quieres pasar?");
        centigrados = lectorTeclado.nextFloat();

        float farenheit;
        System.out.println("¿Cuantos farenheits quieres pasar?");
        farenheit = lectorTeclado.nextFloat();

        float kelvin;
        System.out.println("¿Cuantos kelvin quieres pasar?");
        kelvin = lectorTeclado.nextFloat();

        float farenheitc = (9*centigrados)/5 + 32;
        float kelvinc = (float) (centigrados + 273.15);

        float centigradosf = (5*(farenheit - 32)) / 9;
        float kelvinf = (float) (centigradosf + 273.15);

        float centigradosk = (float) (kelvin - 273.15);
        float farenheitk = (float) (9 *(kelvin - 273.15))/5 + 32;

        System.out.printf("Los %.2f ºC son equivalentes a %.2f farenheit y a %.2f kelvin.\n" +
                "Los %.2f farenheit son equivalentes a %.2f centigrados y a %.2f kelvin.\n" +
                "Los %.2f kelvin son equivalentes a %.2f centigrados y a %.2f farenheit.", centigrados, farenheitc, kelvinc, farenheit, centigradosf, kelvinf, kelvin, centigradosk, farenheitk);

    }

    public static void ejercicio9() {

        int bebidasc;
        System.out.println("¿Cuantas bebidas se han comprado?");
        bebidasc = lectorTeclado.nextInt();

        int bocatasc;
        System.out.println("¿Cuantos bocatas se han comprado?");
        bocatasc = lectorTeclado.nextInt();

        float preciobeb;
        System.out.println("¿Cual es el precio de una bebida?");
        preciobeb = lectorTeclado.nextFloat();

        float preciototalbeb = preciobeb * bebidasc;

        float precioboc;
        System.out.println("¿Cual es el precio del bocata?");
        precioboc = lectorTeclado.nextFloat();

        float preciototalboc = precioboc * bocatasc;

        int alumnos;
        System.out.println("¿Cuantos alumnos han comprado?");
        alumnos = lectorTeclado.nextInt();

        float preciototal = preciototalbeb + preciototalboc;

        System.out.printf("Han comprado %d alumnos\n" +
                "Articulo\tCantidad\tPrecio\tCoste\n" +
                "Bebida\t\t%d\t\t\t%.2f\t%.2f\n" +
                "Bocata\t\t%d\t\t\t%.2f\t%.2f\n" +
                "TOTAL\t\t\t\t\t\t\t%.2f", alumnos, bebidasc, preciobeb, preciototalbeb, bocatasc, precioboc, preciototalboc, preciototal );

    }

    public static void ejercicio10() {

        int numeroInicial;
        System.out.println("Dime tu numero a descomponer");
        numeroInicial = lectorTeclado.nextInt();

        int decenasDeMil = numeroInicial / 10000;

        int numeroActual = numeroInicial - (decenasDeMil * 10000);

        int unidadesDeMil = numeroActual / 1000;

        numeroActual = numeroActual - (unidadesDeMil * 1000);

        int centenas = numeroActual / 100;

        numeroActual = numeroActual - (centenas * 100);

        int decenas = numeroActual / 10;

        numeroActual = numeroActual - (decenas * 10);

        int unidades = numeroActual;

        System.out.printf("Decenas de mil: %d\n" +
                "Unidades de mil: %d\n" +
                "Centenas: %d\n" +
                "Decenas: %d\n" +
                "Unidades: %d\n" +
                "Numero inicial: %d", decenasDeMil, unidadesDeMil, centenas, decenas,unidades, numeroInicial);
    }

    public static void ejercicio11() {
        int numeroEntero;
        System.out.println("Dime un numero entero entre el 0 y el 100");
        numeroEntero = lectorTeclado.nextInt();

        boolean resultadoNumero = numeroEntero % 2 == 0;

        boolean numeroMayor = numeroEntero > 50;

        System.out.printf("Escribe un numero entre 0 y 100: %d\n" +
                "Tu numero es par: %b\n" +
                "Tu numero es mayor que 50: %b", numeroEntero, resultadoNumero, numeroMayor);
    }

    public static void ejercicio12() {
        String palabra1;
        System.out.println("Escribe la primera palabra que quieres comparar");
        palabra1 = lectorTeclado.nextLine();

        String palabra2;
        System.out.println("Escribe la segunda palabra que quieres comparar");
        palabra2 = lectorTeclado.nextLine();

        boolean resultadoPalabras = palabra1.equals(palabra2);

        boolean comparacionPalabra = palabra1.compareTo(palabra2)>=1;

        System.out.printf("Palabra 1: %s\n" +
                "Palabra 2: %s\n" +
                "Son iguales: %b\n" +
                "La primera es menor que la segunda: %b %n", palabra1, palabra2, resultadoPalabras, comparacionPalabra);
    }

    public static void ejercicio13(){

        int numero1;
        System.out.println("Dime el primer numero del 0 al 9");
        numero1 = lectorTeclado.nextInt();

        int numero2;
        System.out.println("Dime el segundo numero del 0 al 9");
        numero2 = lectorTeclado.nextInt();

        boolean comparacionnum = numero1 % 2 == 0 && numero2 % 2 != 0;

        boolean comparaciondoble = numero1 > (numero2 * 2) && numero1 < 8;

        boolean comparaciontriple = numero1 == numero2 || numero1 - numero2 <= 2 && numero1 -  numero2 >= -2 || numero2 - numero1 <= 2 && numero2 - numero1 >= -2;

        System.out.printf("Escribe un número del 0 al 9: %d\n" +
                "Escribe un número del 0 al 9: %d\n" +
                "El primero es par y el segundo es impar: %b\n" +
                "El primero es superior al doble del segundo e inferior a 8: %b\n" +
                "Son iguales o la diferencia entre el primero y el segundo es menor que 2: %b", numero1, numero2, comparacionnum, comparaciondoble, comparaciontriple);
    }

    public static void ejercicio14() {

        int edad;
        System.out.println("¿Cuantos años tienes?");
        edad = lectorTeclado.nextInt();

        int estudios;
        System.out.println("Dime tu nivel de estudios entre 0 al 10");
        estudios = lectorTeclado.nextInt();

        int ingresos;
        System.out.println("¿Cuales son tus ingresos al mes?");
        ingresos = lectorTeclado.nextInt();

        boolean comparacion = edad > 40 && (estudios >= 5 && estudios <= 8) && ingresos < 15000;

        System.out.printf("Edad: %d\n" +
                "\n" +
                "Nivel de estudios: %d\n" +
                "\n" +
                "Ingresos: %d\n" +
                "\n" +
                "Mas de 40 años y estudios entre 5 y 8 y gana menos de 15000: %b", edad, estudios, ingresos, comparacion);

    }

    public static void ejercicio15() {

        int num;
        System.out.println("Dime un numero entero");
        num = lectorTeclado.nextInt();

        int entero = num;

        int num2 = num += 5;

        int num3 = num2 -= 3;

        int num4 = num3 *= 10;

        num4 /= 2;

        System.out.printf("ENTERO: %d\n" +
                "Incrementar 5 unidades: %d\n" +
                "Decrementar 3 unidades: %d\n" +
                "Multiplicar por 10: %d\n" +
                "Dividir por 2: %d", entero, num, num2, num3, num4);
    }

    public static void ejercicioDiez(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tus unidades");
        int unidades = scanner.nextInt();
        System.out.println("Introduce tus decenas");
        int decenas = scanner.nextInt();
        System.out.println("Introduce tus centenas");
        int centenas = scanner.nextInt();
        System.out.println("Introduce tus unidades de millar");
        int unidadesMillar = scanner.nextInt();
        System.out.println("Introduce tus decenas de millar");
        int decenasMillar = scanner.nextInt();

        System.out.printf("Unidades: %d\n" +
                "Decenas: %d\n" +
                "Centenas: %d\n" +
                "Unidades de millar: %d\n" +
                "Decenas de millar: %d\n" +
                "Numero Entero: %d", unidades, decenas, centenas, unidadesMillar, decenasMillar, unidades + decenas * 10 + centenas * 100 + unidadesMillar * 1000 + decenasMillar * 10000);
    }

    public static void ejercicioQuince(){

        System.out.println("Introduce un numero");
        int numero = lectorTeclado.nextInt();

        numero+=5;
        System.out.println("El resultado es: " + numero);
        numero -= 3;
        System.out.println("El resultado es: "+ numero);
        numero *= 10;
        System.out.println("El resultado es: "+ numero);
        numero /= 2;
        System.out.println("El resultado es: "+ numero);

    }
}