package com.udemy.clases;

import java.util.Scanner;

public class AplicatioFitness {

    public static final Integer META_PASOS_DIARIO = 1000;
    public static final Double CALORIAS_POR_PASO = 0.04;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre:");
        String nombre = scanner.nextLine();

        System.out.print("Cuantos pasos por día hiciste:");
        Integer pasosXdia = scanner.nextInt();
        scanner.close();

        Double caloriasQuemadas = pasosXdia * CALORIAS_POR_PASO;
        System.out.println("Quemaste el total de calorías = " + caloriasQuemadas);

        String meta_alcanzada = pasosXdia >= META_PASOS_DIARIO ? "Alcanzó la meta" : "No alcanzó la meta";
        System.out.println(meta_alcanzada);

        System.out.printf("""
                %nUsuario :%s
                Pasos de hoy: %d
                Calorías quemadas: %.2f kcal
                Meta de pasos diario alcanzada: %s
                  
                La meta de pasos diarios es de : %d pasos
                """,nombre,pasosXdia,caloriasQuemadas,meta_alcanzada,META_PASOS_DIARIO);

    }
}
