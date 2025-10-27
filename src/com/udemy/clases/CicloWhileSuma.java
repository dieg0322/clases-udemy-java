package com.udemy.clases;

public class CicloWhileSuma {
    public static void main(String[] args) {
        final var valorMax = 5;
        var acumuladorSuma = 0;
        var numero = 1;

        while(numero <= valorMax) {
            System.out.println("acumuladorSuma + numero " + acumuladorSuma + " + " +  numero);
            acumuladorSuma += numero++;
            System.out.println("Suma Parcial = " +acumuladorSuma);

        }
        System.out.println("Suma: " + acumuladorSuma);
    }
}
