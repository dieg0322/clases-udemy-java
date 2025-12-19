package com.udemy.clases.calculos;

import java.util.Random;
import java.util.Scanner;

public class Adivinanzas {

    public static void main(String[] args) {
        System.out.println("***Juego de adivinanzas***");
        var consola = new Scanner(System.in);
        var random = new Random();

        var numeroSecreto = random.nextInt(50) + 1;
        var intentos = 0;
        var adivinanza = 0;
        final var INTENTOS_MAXIMOS = 5;

        while (adivinanza != numeroSecreto && intentos < INTENTOS_MAXIMOS) {
            System.out.print("Adivina el número secreto (1-50): ");
            adivinanza = consola.nextInt();

            if (adivinanza < numeroSecreto)
                System.out.println("El numero secreto es mayor");
            else if (adivinanza > numeroSecreto)
                System.out.println("El numero secreto es menor");

            intentos++;

        }
        if (adivinanza == numeroSecreto)
            System.out.printf("Felicidades adivinaste el númerp secreto en  %d intentos%n", intentos);
        else System.out.printf("Lo sentimos has agotado los intentos máximos: %d%n", INTENTOS_MAXIMOS);
        System.out.printf("El número secreto era: %d%n", numeroSecreto);

    }
}
