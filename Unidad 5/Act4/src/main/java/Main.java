import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        noExiste(productos,
                new Producto("P1", "Auriculares", 45000.00));
        noExiste(productos,
                new Producto("P2", "Joystick", 28000.00));
        noExiste(productos,
                new Producto("P3", "Monitor", 185000.00));

        Producto productoDuplicado = new Producto(
                "P1", "Auriculares - oferta", 39000.00
        );
        noExiste(productos, productoDuplicado);

        System.out.println("Productos registrados:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    private static void noExiste(List<Producto> productos, Producto producto) {
        if (productos.contains(producto)) {
            System.out.println("No se agregó el producto con código "
                    + producto.getCodigo() + ": ya existe.");
            return;
        }

        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getCodigo());
    }
}
