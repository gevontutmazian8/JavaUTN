package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();

        input.nextLine(); // limpiar buffer

        System.out.print("Ingrese su nombre: ");
        String nombre = input.nextLine();

        System.out.println("Hola " + nombre + ", tenés " + edad + " años.");
    }
}
