import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto productoUno = new Producto(
                "P1", "Jamon", "Fiambres Locos", 20000.00);
        Producto productoDos = new Producto(
                "P2", "Queso", "Lacteos SA", 17000.00);
        Producto productoTres = new Producto(
                "P3", "Salame", "Fiambres Torres", 16200.00);

        List<ProductoRecord> productos = new ArrayList<>();
        productos.add(convertirARecord(productoUno));
        productos.add(convertirARecord(productoDos));
        productos.add(convertirARecord(productoTres));

        System.out.println("Productos representados con records:");
        productos.forEach(System.out::println);
    }

    private static ProductoRecord convertirARecord(Producto producto) {
        return new ProductoRecord(
                producto.getCodigo(),
                producto.getNombre(),
                producto.getPrecio());
    }
}
