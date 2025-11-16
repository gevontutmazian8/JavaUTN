public class Circulo extends Figura {
    private double radio;
    public Circulo(double radio){
        super("Círculo");
        this.radio = radio;
    }
    @Override
    public double area(){
        return Math.PI * radio * radio;
    }
}