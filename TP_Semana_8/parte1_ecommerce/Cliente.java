public class Cliente implements Notificable {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void notificar(String mensaje) {
        // En un sistema real quizá se mandaría un mail.
        // Acá solo mostramos por consola.
        System.out.println("Notificación para " + nombre + " (" + email + "): " + mensaje);
    }
}
