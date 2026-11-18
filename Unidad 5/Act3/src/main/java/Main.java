public class Main {
    public static void main(String[] args) {
        Curso basesDeDatos = new Curso(
                "Bases de Datos",
                "Prof. Luis Moreno"
        );
        basesDeDatos.agregarEstudiante(
                new Estudiante("Marco", 28, "Ingeniería en Sistemas")
        );
        basesDeDatos.agregarEstudiante(
                new Estudiante("Martin", 24, "Marketing")
        );
        basesDeDatos.agregarEstudiante(
                new Estudiante("Juan", 23, "Abogacia")
        );

        Curso progTres = new Curso(
                "Programación III",
                "Prof. Marcelo Gómez"
        );
        progTres.agregarEstudiante(
                new Estudiante("Juana", 33, "Tecnicatura Universitaria en Programación")
        );
        progTres.agregarEstudiante(
                new Estudiante("Franco", 29, "Tecnicatura Universitaria en Programación")
        );

        System.out.println(basesDeDatos);
        System.out.println(progTres);
    }
}
