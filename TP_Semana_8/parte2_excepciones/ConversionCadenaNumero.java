import java.util.Scanner;

public class ConversionCadenaNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        String texto = scanner.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("El número ingresado es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: el texto ingresado no es un número entero válido.");
        } finally {
            scanner.close();
        }
    }
}
