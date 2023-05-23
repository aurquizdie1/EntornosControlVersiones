package org.example;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero no negativo: ");
        int numero = scanner.nextInt();
        scanner.close();

        long factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }

    public static long calcularFactorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= numero; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}
