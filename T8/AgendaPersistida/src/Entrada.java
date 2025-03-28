import model.Usuario;

public class Entrada {
    public static void main(String[] args) {
        OperacionesUsuario operacionesUsuario = new OperacionesUsuario();
        OperacionesFichero operacionesFichero = new OperacionesFichero();

        //operacionesUsuario.escribirUsuario("src/recursos/agenda.txt", new Usuario("Borja","Martin","bm@gmail.com",11111111));
        //operacionesUsuario.escribirUsuario("src/recursos/agenda.txt", new Usuario("Borja","Martin","bm@gmail.com",11111111));
        //operacionesUsuario.escribirUsuario("src/recursos/agenda.txt", new Usuario("Borja","Martin","bm@gmail.com",11111111));
        //operacionesUsuario.escribirUsuario("src/recursos/agenda.txt", new Usuario("Borja","Martin","bm@gmail.com",11111111));
        //operacionesUsuario.lecturaUsuarios("src/recursos/agenda.txt");
        //operacionesUsuario.escribirUsuarioObjeto("src/recursos/agenda.obj", new Usuario("Borja","Martin","bm@gmail.com",11111111));
        operacionesUsuario.leerUsuarioObjeto("src/recursos/agenda.obj");
    }
}


