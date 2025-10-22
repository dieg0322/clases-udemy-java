package com.udemy.clases;

import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primero numero: ");
        Integer primerNumero = scanner.nextInt();

        System.out.print("Segundo numero: ");
        Integer segundoNumero = scanner.nextInt();

        System.out.printf("El numero mayor es %d", primerNumero > segundoNumero ? primerNumero : segundoNumero);
    }

}
