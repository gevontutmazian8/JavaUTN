import java.util.Scanner;

public class TP2_GevontJoaquinUtmazian {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // ==================================================
        // EJERCICIO 1: Verificación de Año Bisiesto
        // ==================================================
        System.out.println("EJERCICIO 1: Año Bisiesto");
        System.out.print("Ingrese un año: ");
        int año = scan.nextInt();
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año " + año + " es bisiesto.");
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }
        System.out.println("------------------------------------");

        // ==================================================
        // EJERCICIO 2: Mayor de Tres Números
        // ==================================================
        System.out.println("EJERCICIO 2: Mayor de Tres Números");
        System.out.print("Ingrese el primer número: ");
        int num1 = scan.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scan.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scan.nextInt();
        int mayor = num1;
        if (num2 > mayor) mayor = num2;
        if (num3 > mayor) mayor = num3;
        System.out.println("El mayor es: " + mayor);
        System.out.println("------------------------------------");

        // ==================================================
        // EJERCICIO 3: Clasificación de Edad
        // ==================================================
        System.out.println("EJERCICIO 3: Clasificación de Edad");
        System.out.print("Ingrese su edad: ");
        int edad = scan.nextInt();
        if (edad < 12) {
            System.out.println("Eres un Niño.");
        } else if (edad <= 17) {
            System.out.println("Eres un Adolescente.");
        } else if (edad <= 59) {
            System.out.println("Eres un Adulto.");
        } else {
            System.out.println("Eres un Adulto mayor.");
        }
        System.out.println("------------------------------------");

        // ==================================================
        // EJERCICIO 4: Calculadora de Descuento por Categoría
        // ==================================================
        System.out.println("EJERCICIO 4: Calculadora de Descuento");
        System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = scan.next().toUpperCase().charAt(0);
        double descuento = 0;
        switch (categoria) {
            case 'A': descuento = 0.10; break;
            case 'B': descuento = 0.15; break;
            case 'C': descuento = 0.20; break;
            default: System.out.println("Categoría inválida. No se aplicará descuento.");
        }
        double precioFinal = precio - (precio * descuento);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
        System.out.println("------------------------------------");

        // ==================================================
        // EJERCICIO 5: Suma de Números Pares (while)
        // ==================================================
        System.out.println("EJERCICIO 5: Suma de Números Pares");
        int numero;
        int sumaPares = 0;
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scan.nextInt();
            if (numero != 0 && numero % 2 == 0) sumaPares += numero;
        } while (numero != 0);
        System.out.println("La suma de los números pares es: " + sumaPares);
        System.out.println("------------------------------------");

        // ==================================================
        // EJERCICIO 6: Contador de Positivos, Negativos y Ceros (for)
        // ==================================================
        System.out.println("EJERCICIO 6: Contador de Positivos, Negativos y Ceros");
        int positivos = 0, negativos = 0, ceros = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int n = scan.nextInt();
            if (n > 0) positivos++;
            else if (n < 0) negativos++;
            else ceros++;
        }
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        System.out.println("------------------------------------");

        // ==================================================
        // EJERCICIO 7: Validación de Nota entre 0 y 10
        // ==================================================
        System.out.println("EJERCICIO 7: Validación de Nota");
        int nota;
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = scan.nextInt();
            if (nota < 0 || nota > 10)
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
        } while (nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente: " + nota);
        System.out.println("------------------------------------");

        // ==================================================
        // EJERCICIO 8: Cálculo de Precio Final con impuesto y descuento
        // ==================================================
        System.out.println("EJERCICIO 8: Precio Final con Impuesto y Descuento");
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scan.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = scan.nextDouble() / 100;
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuentoPorcentaje = scan.nextDouble() / 100;
        double precioFinal8 = calcularPrecioFinal(precioBase, impuesto, descuentoPorcentaje);
        System.out.println("El precio final del producto es: " + precioFinal8);
        System.out.println("------------------------------------");

        // ==================================================
        // EJERCICIO 9: Cálculo de costo de envío y total de compra
        // ==================================================
        System.out.println("EJERCICIO 9: Costo de Envío y Total Compra");
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scan.nextDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scan.nextDouble();
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scan.next();
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalCompra);
        System.out.println("------------------------------------");

        // ==================================================
        // EJERCICIO 10: Actualización de stock
        // ==================================================
        System.out.println("EJERCICIO 10: Actualización de Stock");
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = scan.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = scan.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scan.nextInt();
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
        System.out.println("------------------------------------");

        // ==================================================
        // EJERCICIO 11: Cálculo de descuento especial
        // ==================================================
        System.out.println("EJERCICIO 11: Descuento Especial");
        final double DESCUENTO_GLOBAL = 0.10; // Variable global
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto11 = scan.nextDouble();
        calcularDescuentoEspecial(precioProducto11, DESCUENTO_GLOBAL);
        System.out.println("------------------------------------");

        // ==================================================
        // EJERCICIO 12: Modificación de un array de precios
        // ==================================================
        System.out.println("EJERCICIO 12: Modificación de Array de Precios");
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        for (double p : precios) {
            System.out.println("Precio: $" + p);
        }
        precios[2] = 129.99; // Modificación ejemplo
        System.out.println("Precios modificados:");
        for (double p : precios) {
            System.out.println("Precio: $" + p);
        }
        System.out.println("------------------------------------");

        // ==================================================
        // EJERCICIO 13: Impresión recursiva de arrays
        // ==================================================
        System.out.println("EJERCICIO 13: Impresión Recursiva de Array");
        double[] precios13 = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        imprimirArrayRecursivo(precios13, 0);
        precios13[2] = 129.99;
        System.out.println("Precios modificados:");
        imprimirArrayRecursivo(precios13, 0);

        scan.close();
    }

    // ====================== FUNCIONES ======================
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }

    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            System.out.println("Zona inválida, se usará costo 0.");
            return 0;
        }
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    public static void calcularDescuentoEspecial(double precio, double descuentoGlobal) {
        double descuentoAplicado = precio * descuentoGlobal;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void imprimirArrayRecursivo(double[] arr, int indice) {
        if (indice < arr.length) {
            System.out.println("Precio: $" + arr[indice]);
            imprimirArrayRecursivo(arr, indice + 1);
        }
    }
}
