import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionSegura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese el dividendo: ");
            int a = scanner.nextInt();

            System.out.print("Ingrese el divisor: ");
            int b = scanner.nextInt();

            int resultado = dividir(a, b);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: debe ingresar números enteros.");
        } finally {
            scanner.close();
        }
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
