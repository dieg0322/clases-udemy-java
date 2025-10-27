package com.udemy.clases;

import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        final var NRO_PROD_DESC = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero de productos adquiridos :");
        int nroProductos = scanner.nextInt();
        System.out.print("Eres miembro del establecimiento? :");
        boolean miembro = scanner.nextBoolean();

        boolean desc = miembro && nroProductos >= NRO_PROD_DESC;
        System.out.print("Aplica al descuento? : " + desc);




    }
}
