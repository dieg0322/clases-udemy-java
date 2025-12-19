package com.udemy.clases.ciclos;

public class CicloForNumerosPares {
    public static void main(String[] args) {
        System.out.println("Ciclo For : Numeros Pares");
        for(var contador = 2; contador < 20 && contador %2==0; contador++){

            System.out.println("numero " + contador);
        }

    }
}
