public class Main4 {
    public static void main(String[] args) {
        Animal[] a = { new Perro(), new Gato(), new Animal() };
        for (Animal x : a) {
            System.out.println(x.quienSoy());
            x.sonido();
        }
        // Downcasting seguro
        Animal ref = new Perro();
        if (ref instanceof Perro) {
            Perro p = (Perro) ref;
            p.ladrar();
        }
    }
}