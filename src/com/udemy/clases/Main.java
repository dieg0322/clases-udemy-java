package com.udemy.clases;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Integer numeroUno, numeroDos;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero Uno: ");
        numeroUno = scanner.nextInt();
        System.out.print("Numero Dos: ");
        numeroDos = scanner.nextInt();

        Integer numeroMayor = (numeroUno > numeroDos ? numeroUno : numeroDos);

        System.out.println("El numero mayor es el: " + numeroMayor);

    }
}