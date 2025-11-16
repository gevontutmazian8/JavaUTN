public class TarjetaCredito implements PagoConDescuento {

    private String numero;
    private String titular;

    public TarjetaCredito(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    @Override
    public double aplicarDescuento(double montoOriginal) {
        // Ejemplo simple: 5% de descuento con tarjeta de crédito
        return montoOriginal * 0.95;
    }

    @Override
    public boolean procesarPago(double monto) {
        // Acá iría la lógica real de conexión con un gateway de pago.
        // Para el trabajo práctico, solo mostramos un mensaje.
        System.out.println("Pagando $" + monto + " con Tarjeta de " + titular);
        return true;
    }
}
