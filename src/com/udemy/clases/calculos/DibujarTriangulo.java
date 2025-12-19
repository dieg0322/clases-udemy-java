package com.udemy.clases.calculos;

import java.util.Scanner;

public class DibujarTriangulo {

    public static void main(String[] args) {
        System.out.println("Dibujar Triangulo");
        var consola = new Scanner(System.in);
        System.out.print("Proporciona el numero de filas: ");
        int numeroFilas = consola.nextInt();

        for (var filas = 1; filas <= numeroFilas; filas++) {
            var espaciosBlanco = " ".repeat(numeroFilas - filas);
            var asteriscos = "*".repeat(2 * filas - 1);
            System.out.println(espaciosBlanco + asteriscos);

        }
    }
}
