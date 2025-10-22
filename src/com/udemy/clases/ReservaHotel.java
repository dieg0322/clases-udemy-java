package com.udemy.clases;

import java.util.Scanner;

public class ReservaHotel {

    private static final Double VISTA_AL_MAR_PRECIO = 190.50;
    private static final Double SIN_VISTA_AL_MAR_PRECIO = 150.50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Días de estadía: ");
        Integer dias = scanner.nextInt();

        System.out.print("La habitación tiene vista al mar ? TRUE/FALSE: ");
        Boolean vistaMar = scanner.nextBoolean();

        Double tarifa = vistaMar != Boolean.TRUE ? SIN_VISTA_AL_MAR_PRECIO : VISTA_AL_MAR_PRECIO;

        Double costoTotal = dias * tarifa;

        System.out.printf("""
                %nUsuario : %s
                Días de estadía: %d
                Cuarto con vista al mar ?: %s
                Costo total: S/%.2f
                """, nombre, dias, vistaMar != Boolean.TRUE ? "No" : "Sí", costoTotal);
    }
}
