import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Producto> productos = new HashSet<>();

        productos.add(new Producto("P1", "Jamon"));
        productos.add(new Producto("P2", "Queso"));
        productos.add(new Producto("P3", "Salame"));
        productos.add(new Producto("P1", "Jamon duplicado"));

        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
