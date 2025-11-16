public class Perro extends Animal {
    @Override
    public void sonido(){ System.out.println("Guau"); }
    @Override
    public String quienSoy(){ return "Perro"; }
    public void ladrar(){ System.out.println("¡Guau guau!"); }
}