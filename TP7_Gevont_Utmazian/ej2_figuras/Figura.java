// Clase abstracta
public abstract class Figura {
    protected String nombre;
    public Figura(String nombre){ this.nombre = nombre; }
    public abstract double area();
    public String getNombre(){ return nombre; }
}