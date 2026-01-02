package com.udemy.clases.arreglos;

import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        System.out.println("Proporciona el tamaño del arreglo:");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        var enteros = new int[largoArreglo];
        for (int i = 0; i < largoArreglo; i++) {
            System.out.println("Elemento en el índice " + i + ": " );
            enteros[i] = Integer.parseInt(consola.nextLine());
        }
        System.out.println("Los elementos del arreglo son:");
        for (int i = 0; i < largoArreglo; i++) {
            System.out.println("Elemento en el índice " + i + ": " + enteros[i]);
        }
    }
}
