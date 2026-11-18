import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Juan", 4.0));
        alumnos.add(new Alumno("Marco", 7.5));
        alumnos.add(new Alumno("Camila", 10.0));
        alumnos.add(new Alumno("Marco", 6.5)); // Los duplicados están permitidos.

        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}
