package com.udemy.clases.calculos;

import java.util.Scanner;

public class ParqueDiversiones {
    private static Boolean miedo;
    private static Integer edad = 0;
    private static String correo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Que edad tiene?:");
        edad = scanner.nextInt();
        System.out.print("Tiene miedo a la oscuridad?:");
        miedo = scanner.nextBoolean();

       correo = miedo ? edad >= 10 ? "puede ingresar" : "No puede ingresar":"";


        System.out.println("scanner = " + scanner);

    }

}
