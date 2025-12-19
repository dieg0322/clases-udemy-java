package com.udemy.clases.calculos;

import java.util.Scanner;

public class EstacionDelAnio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el mes: ");
        Integer mes = scanner.nextInt();

        var estacion = switch (mes) {
            case 1,  2, 3 -> "Primavera";
            case 4, 5, 6 -> "Verano";
            case 7, 8, 9 -> "Otoño";
            case 10, 11, 12 -> "Invierno";
            default -> "Estación desconocida";
        };
        System.out.printf("la estación para el mes %d es %s ", mes, estacion);
    }

}
