public class PayPal implements Pago {

    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public boolean procesarPago(double monto) {
        // Simulación de pago con PayPal, sin descuento.
        System.out.println("Pagando $" + monto + " con PayPal de " + email);
        return true;
    }
}
