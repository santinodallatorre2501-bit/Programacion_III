public class Main {
    public static void main(String[] args) {
        Persona personaVacia = new Persona();
        personaVacia.setNombre("Mariana");
        personaVacia.setEdad(30);

        Persona personaCompleta = new Persona("Juan", 28);

        System.out.println("Persona creada con constructor vacío:");
        System.out.println("Nombre: " + personaVacia.getNombre());
        System.out.println("Edad: " + personaVacia.getEdad());

        System.out.println("\nPersona creada con constructor completo:");
        System.out.println("Nombre: " + personaCompleta.getNombre());
        System.out.println("Edad: " + personaCompleta.getEdad());
    }
}
