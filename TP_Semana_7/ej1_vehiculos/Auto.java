// Subclase que hereda de Vehiculo
public class Auto extends Vehiculo {
    private int puertas;

    public Auto(String marca, String modelo, int puertas) {
        super(marca, modelo);
        this.puertas = puertas;
    }

    @Override
    public String info() {
        return super.info() + " - puertas: " + puertas;
    }
}