package com.udemy.clases;

public class NumerosPares {
    public static void main(String[] args) {
        System.out.println("NumerosPares del 0 al 20");
        var contador = 0;
        while (contador <= 20){
            if(contador % 2 == 0){
                System.out.println(contador + " ");
            }
            contador++;
        }
    }
}
