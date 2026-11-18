import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Producto> productos = new HashSet<>();

        productos.add(new Producto("P1", "Auriculares", 45000.00));
        productos.add(new Producto("P2", "Joystick", 28000.00));
        productos.add(new Producto("P3", "Monitor", 185000.00));

        
        boolean agregadoDuplicado = productos.add(
                new Producto("P1", "Auriculares", 45000.00)
        );

        System.out.println("¿Se agregó el producto repetido? " + agregadoDuplicado);
        System.out.println("Cantidad de productos almacenados: " + productos.size());
        System.out.println("Productos registrados:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }

        // Comprobaciones de la consigna.
        if (agregadoDuplicado) {
            throw new IllegalStateException("El HashSet permitió un producto repetido");
        }
        if (productos.size() != 3) {
            throw new IllegalStateException("La cantidad de productos esperada es 3");
        }
    }
}
