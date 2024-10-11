public class EntradaIfElse {

    public static void main(String[] args) {
        int nota = 6;
        //if-> 0-10 -> nota correcta
        String mensaje=null;
        if (nota >= 0 && nota <= 10){
            System.out.println("La nota es correcta");
            //decido que nota es
            // ss -> 0-4,99
            //ap -> 5-6,99
            //nt -> 7-8,99
            //sb -> 9-9,99
            //mh -> 10
            if (nota < 5){
                System.out.println("Tu nota es un ss");
            } else if (nota < 7){
                System.out.println("Tu nota es un ap");
            }else if(nota < 9){
                System.out.println("Tu nota es un nt");
            }else if(nota < 10){
                System.out.println("Tu nota es un sb");
            }else{
                System.out.println("Tu nota es una mh");
            }
        } else{
            System.out.println("La nota no es correcta");
        }
        System.out.println("Terminando la ejecucion");
    }
}
