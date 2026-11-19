import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto productoUno = new Producto(
                "P1", "Libro de Python", 12300.00, "Autor Pedro");
        Producto productoDos = new Producto(
                "P2", "Libro de BDD", 25000.00, "Autora Camila");
        Producto productoTres = new Producto(
                "P3", "Libro de Programación", 27600.00, "Autor Gabriel");

        List<ProductoDTO> productosDTO = new ArrayList<>();
        productosDTO.add(convertirADTO(productoUno));
        productosDTO.add(convertirADTO(productoDos));
        productosDTO.add(convertirADTO(productoTres));

        System.out.println("Productos transportados mediante DTO:");
        productosDTO.forEach(System.out::println);
    }

    private static ProductoDTO convertirADTO(Producto producto) {
        ProductoDTO dto = new ProductoDTO();
        dto.setCodigo(producto.getCodigo());
        dto.setNombre(producto.getNombre());
        dto.setPrecio(producto.getPrecio());
        return dto;
    }
}
