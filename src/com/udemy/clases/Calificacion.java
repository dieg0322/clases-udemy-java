package com.udemy.clases;

import java.util.Scanner;

public class Calificacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca la calificación: ");
        Double puntaje = scanner.nextDouble();

        if (puntaje >= 9 && puntaje <= 10) {
            System.out.println("puntaje = A");
        } else if (puntaje >= 8 && puntaje < 9) {
            System.out.println("Puntaje = B");
        } else if (puntaje >= 6 && puntaje < 7){
            System.out.println("Puntaje = C");
        }else if (puntaje >= 0 && puntaje <6) {
            System.out.println("Puntaje = F");
        }else {
            System.out.println("Valor desconocido");
        }






    }
}
