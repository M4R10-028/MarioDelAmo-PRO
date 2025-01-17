import java.util.ArrayList;
import java.util.Comparator;

public class Controladora2 {

    private ArrayList<Object[]> listaAlumnos;

    public Controladora2(){
        listaAlumnos = new ArrayList<>();
    }

    public void agregarAlumno(String nombre){
        Object[] alumno = new Object[]{nombre,-1};
        listaAlumnos.add(alumno);
    }

    public void calificar(){
        for (int i = 0; i < listaAlumnos.size(); i++) {
            int nota = (int)(Math.random() * 10) + 1;
            Object[] alumno = listaAlumnos.get(i);
            alumno[1] = nota;
        }
    }

    public void listarSuspensos(){
        for (Object[] item : listaAlumnos) {
            if ((int) item[1] < 5){
                System.out.println("El alumno es " + item[0] + " y tiene una nota de " + item[1]);
            }
        }
    }

    public void listarNotasOrdenadas(){
        listaAlumnos.sort(new Comparator<Object[]>() {
            @Override
            public int compare(Object[] o1, Object[] o2) {
                if ((int) o1[1] > (int) o2[1]){
                    return 1;
                } else if ((int) o1[1] < (int) o2[1]){
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for (Object[] item : listaAlumnos) {
            System.out.println("El alumno es " + item[0] + " y tiene una nota de " + item[1]);
        }
    }

}
