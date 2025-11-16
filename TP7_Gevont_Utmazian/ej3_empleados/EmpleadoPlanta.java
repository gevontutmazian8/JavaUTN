public class EmpleadoPlanta extends Empleado {
    private double base, bono;
    public EmpleadoPlanta(String nombre, double base, double bono){
        super(nombre);
        this.base = base;
        this.bono = bono;
    }
    @Override
    public double sueldo(){ return base + bono; }
}