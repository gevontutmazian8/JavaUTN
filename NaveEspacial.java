package poo_tp3;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int LIMITE_COMBUSTIBLE = 100;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public void despegar() {
        System.out.println(nombre + " ha despegado.");
    }

    public void avanzar(int distancia) {
        if (distancia <= combustible) {
            combustible -= distancia;
            System.out.println(nombre + " avanzó " + distancia + " unidades.");
        } else {
            System.out.println("No hay suficiente combustible.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= LIMITE_COMBUSTIBLE) {
            combustible += cantidad;
        } else {
            System.out.println("Excede el límite de combustible.");
        }
    }

    public void mostrarEstado() {
        System.out.println(nombre + " - Combustible: " + combustible);
    }
}