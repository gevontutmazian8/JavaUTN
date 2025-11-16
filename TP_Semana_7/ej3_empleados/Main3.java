public class Main3 {
    public static void main(String[] args) {
        Empleado[] arr = {
            new EmpleadoPlanta("Ana", 500000, 80000),
            new EmpleadoTemporal("Luis", 160, 1800),
            new EmpleadoPlanta("Marta", 620000, 120000)
        };
        for(Empleado e : arr){
            System.out.println(e.getNombre() + " -> " + e.sueldo());
        }
    }
}