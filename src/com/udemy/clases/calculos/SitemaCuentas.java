package com.udemy.clases.calculos;

import java.util.Scanner;

public class SitemaCuentas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        var salir = false;


        while (!salir) {
            System.out.print("""
                    Sistema de administración de cuentas
                    Menu:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir
                    Escoge una opción:\s""");

            var option = sc.nextInt();

            switch (option) {
                case 1 -> System.out.println("Creación de cuenta");
                case 2 -> System.out.println("Eliminar cuenta");
                case 3 -> {
                    System.out.println("Saliendo del sistema...");
                    salir = true;
                }
                default -> System.out.println("Seleccione una opción valida");
            }

        }
    }
}
