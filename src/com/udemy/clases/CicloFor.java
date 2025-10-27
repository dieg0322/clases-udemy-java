package com.udemy.clases;

public class CicloFor {
    public static void main(String[] args) {
        System.out.println("Ciclo For");
        for(var contador = 0; contador < 20; contador++){
            if (contador % 2 == 0){
                System.out.print(contador + " ");
            }
        }
    }
}
