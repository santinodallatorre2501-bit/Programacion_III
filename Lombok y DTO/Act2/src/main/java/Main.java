public class Main {
    public static void main(String[] args) {
        Usuario usuarioUno = Usuario.builder()
                .id(1L)
                .nombre("Martín Gómez")
                .email("martin.gomez@ejemplo.com")
                .build();

        Usuario usuarioDos = Usuario.builder()
                .id(2L)
                .nombre("Juan Torres")
                .email("juan.torres@ejemplo.com")
                .build();

        System.out.println("Usuarios creados con Builder:");
        System.out.println(usuarioUno);
        System.out.println(usuarioDos);
    }
}
