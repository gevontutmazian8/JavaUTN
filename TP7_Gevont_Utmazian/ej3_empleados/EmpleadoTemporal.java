public class EmpleadoTemporal extends Empleado {
    private int horas;
    private double tarifa;
    public EmpleadoTemporal(String nombre, int horas, double tarifa){
        super(nombre);
        this.horas = horas;
        this.tarifa = tarifa;
    }
    @Override
    public double sueldo(){ return horas * tarifa; }
}