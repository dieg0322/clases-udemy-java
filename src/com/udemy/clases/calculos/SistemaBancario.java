package com.udemy.clases.calculos;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Desea salir del Systema:");
        Boolean msg = scanner.nextBoolean();
        System.out.println("Desea salir del Systema:"+msg);

        if (!msg){
            System.out.println("Continuamos dentro del sistema");
        }else {
            System.out.println("Saliendo del sistema");

        }


    }
}
