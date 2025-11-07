package com.udemy.clases;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var salir = false;
        var numerador = 0.0;
        var denominador = 0.0;
        var resultado = 0.0;
        while (!salir) {
            System.out.print("""
                    *** Calculadora en java ***
                    Menu:
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    Escoge una opción:\s""");
            var option = scanner.nextInt();

            if(option >= 1 && option <= 4) {
                System.out.print("Ingrese el numerador: ");
                numerador = scanner.nextDouble();
                System.out.print("Ingrese el denominador: ");
                denominador = scanner.nextDouble();
            }
            switch (option) {
                case 1 -> {
                    resultado = numerador + denominador;
                    System.out.printf("El resultado de la suma es: %f%n%n", resultado);
                }
                case 2 -> {
                    resultado = numerador - denominador;
                    System.out.printf("El resultado de la resta es: %f%n%n", resultado);
                }
                case 3 -> {
                    resultado = numerador * denominador;
                    System.out.printf("El resultado de la multiplicación es: %f%n%n", resultado);
                }
                case 4 -> {
                    if (denominador != 0) {
                        resultado = numerador / denominador;
                        System.out.printf("El resultado de la división es: %f%n%n", resultado);
                    } else System.out.println("No se puede dividir por cero");
                }
                case 5 -> {
                    salir = true;
                    System.out.println("Saliendo del programa.");
                }
                default -> System.out.println("Seleccione una opción correcta");

            }

        }
    }
}
