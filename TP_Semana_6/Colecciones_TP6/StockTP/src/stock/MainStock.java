package stock;

import java.util.List;

public class MainStock {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        // 1. Crear al menos cinco productos con diferentes categorías y agregarlos
        inv.agregarProducto(new Producto("P01", "Yerba Mate", 380.0, 50, CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("P02", "Televisor", 25990.0, 10, CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("P03", "Remera", 1290.0, 100, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("P04", "Tostadora", 3490.0, 25, CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("P05", "Auriculares", 2190.0, 60, CategoriaProducto.ELECTRONICA));

        // 2. Listar todos los productos
        System.out.println("== 2) Lista de productos ==");
        inv.listarProductos();

        // 3. Buscar por ID
        System.out.println("\n== 3) Buscar P03 ==");
        Producto buscado = inv.buscarProductoPorId("P03");
        if (buscado != null) buscado.mostrarInfo();

        // 4. Filtrar por categoría
        System.out.println("\n== 4) Filtrar ELECTRONICA ==");
        List<Producto> electronica = inv.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        for (Producto p : electronica) p.mostrarInfo();

        // 5. Eliminar un producto por ID y listar
        System.out.println("\n== 5) Eliminar P04 y listar ==");
        inv.eliminarProducto("P04");
        inv.listarProductos();

        // 6. Actualizar stock
        System.out.println("\n== 6) Actualizar stock de P02 a 15 ==");
        inv.actualizarStock("P02", 15);
        inv.listarProductos();

        // 7. Total de stock
        System.out.println("\n== 7) Total de unidades en stock = " + inv.obtenerTotalStock());

        // 8. Producto con mayor stock
        System.out.println("== 8) Producto con mayor stock: " + inv.obtenerProductoConMayorStock());

        // 9. Filtrar por precios [1000, 3000]
        System.out.println("\n== 9) Productos entre $1000 y $3000 ==");
        for (Producto p : inv.filtrarProductosPorPrecio(1000, 3000)) p.mostrarInfo();

        // 10. Categorías disponibles con descripción
        System.out.println("\n== 10) Categorías disponibles ==");
        inv.mostrarCategoriasDisponibles();
    }
}
