import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Curso> cursos = new HashMap<>();

        cursos.put("P3", new Curso("Programación III", "María Lira"));
        cursos.put("BDD", new Curso("Bases de Datos", "Juan Torres"));
        cursos.put("MET", new Curso("Metodología", "Martín Gómez"));

        String codigoBuscado = "P3";
        Curso curso = cursos.get(codigoBuscado);
        System.out.println("Curso recuperado para " + codigoBuscado + ": " + curso);

        for (Map.Entry<String, Curso> entrada : cursos.entrySet()) {
            System.out.println("Código: " + entrada.getKey() + " - " + entrada.getValue());
        }
    }
}
