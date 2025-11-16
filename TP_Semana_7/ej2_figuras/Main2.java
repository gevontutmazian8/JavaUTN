public class Main2 {
    public static void main(String[] args) {
        Figura[] figs = {
            new Circulo(3),
            new Rectangulo(4,5),
            new Circulo(1.5)
        };
        for(Figura f : figs){
            System.out.println(f.getNombre() + " -> área: " + f.area());
        }
    }
}