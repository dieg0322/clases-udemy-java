package com.udemy.clases.calculos;

import java.util.Random;
import java.util.Scanner;

public class GeneradorDeCodigo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre:");
        String nombre = scanner.nextLine();
        System.out.print("Apellido:");
        String apellido = scanner.nextLine();
        System.out.print("Edad:");
        String edad = scanner.nextLine();

        var random = new Random();
        var anio = random.nextInt(9000);
        String numeroFormateado = String.format("%04d", anio);

        System.out.println("codigo ="
                .concat(nombre.substring(0, 2)
                .concat(apellido.substring(0, 2)
                .concat(edad.substring(0, 2)

                .concat(numeroFormateado))).toUpperCase()));


    }
}

