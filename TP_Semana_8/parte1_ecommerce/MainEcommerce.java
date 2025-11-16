public class MainEcommerce {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana", "ana@example.com");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Mouse", 5000));
        pedido.agregarProducto(new Producto("Teclado", 12000));

        System.out.println("Productos en el pedido:");
        for (Producto p : pedido.getProductos()) {
            System.out.println(" - " + p);
        }

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        // Simulamos pago con tarjeta con un pequeño descuento.
        TarjetaCredito tarjeta = new TarjetaCredito("1234-****", "Ana");
        double totalConDescuento = tarjeta.aplicarDescuento(total);
        System.out.println("Total con descuento tarjeta: $" + totalConDescuento);
        tarjeta.procesarPago(totalConDescuento);

        pedido.cambiarEstado("PAGADO");
        pedido.cambiarEstado("ENVIADO");
    }
}
