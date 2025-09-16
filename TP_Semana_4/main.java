public class main {
    public static void main(String[] args) {
        // Crear empleados con ambos constructores
        Empleado e1 = new Empleado(1, "Juan Pérez", "Ingeniero", 80000);
        Empleado e2 = new Empleado("María López", "Analista");
        Empleado e3 = new Empleado("Carlos Díaz", "Técnico");

        // Actualizar salarios con métodos sobrecargados
        e1.actualizarSalario(10); // Aumento del 10%
        e2.actualizarSalario(5000); // Aumento fijo de 5000

        // Mostrar información de cada empleado
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());

        // Mostrar total de empleados creados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
