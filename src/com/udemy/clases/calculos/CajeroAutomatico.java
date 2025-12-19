package com.udemy.clases.calculos;

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var saldo = 1000.0;
        var salir = false;

        while (!salir) {
            System.out.print("""
                    *** Aplicación de cajero automático ***
                    Menu:
                    1. Consultar Saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opción:\s""");
            var option = scanner.nextInt();

            switch (option) {
                case 1 -> System.out.printf("Tu saldo actual es de: %.2f%n%n", saldo);
                case 2 -> {
                    System.out.print("Ingrese el monto a retirar:");
                    var monto = scanner.nextDouble();
                    if (monto <= saldo) {
                        saldo -= monto;
                        System.out.printf("Saldo actual es de: %.2f%n%n", saldo);
                    } else System.out.printf("No cuentas con saldo suficiente, saldo actual es: %.2f%n%n", saldo);
                }
                case 3 -> {
                    System.out.print("Ingrese el monto a depositar:");
                    var monto = scanner.nextDouble();
                    saldo += monto;
                    System.out.printf("Saldo actual es de: %.2f%n%n", saldo);
                }
                case 4 -> {
                    System.out.println("Saliendo del sistema...");
                    salir = true;
                }
                default -> System.out.println("Seleccione una opción valida");
            }

        }

    }

}
