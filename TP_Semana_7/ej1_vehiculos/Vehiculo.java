// Trabajo Práctico 7 - Ejercicio 1 (Herencia básica)
// Autor: Gevont Utmazian
public class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }

    public String info() {
        return marca + " " + modelo;
    }
}