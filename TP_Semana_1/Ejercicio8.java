package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int a = input.nextInt();
        System.out.print("Ingrese otro número entero: ");
        int b = input.nextInt();

        System.out.println("División entera: " + (a / b));
        System.out.println("División con decimales: " + ((double) a / b)); // casting
    }
}

