package com.udemy.clases;

public class CicloDoWhile {
    public static void main(String[] args) {
        System.out.println("Ciclo Do While");

        var contador = 1 ;
        do {
            System.out.println("Contador: " + contador++);
        }while(contador <= 5);

    }
}
