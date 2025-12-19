package com.udemy.clases.calculos;

public class NumerosImpares {
    public static void main(String[] args) {
        var contador = 0;

        do {
            if (contador % 2 != 0)
            System.out.println(contador+" ");
        contador++;
        }while (contador <= 20);


    }
}
