package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // CORRECCIÓN: antes estaba scanner.nextInt()
        System.out.println("Hola, " + nombre);
    }
}

