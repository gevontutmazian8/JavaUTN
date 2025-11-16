public class Rectangulo extends Figura {
    private double ancho, alto;
    public Rectangulo(double ancho, double alto){
        super("Rectángulo");
        this.ancho = ancho;
        this.alto = alto;
    }
    @Override
    public double area(){
        return ancho * alto;
    }
}