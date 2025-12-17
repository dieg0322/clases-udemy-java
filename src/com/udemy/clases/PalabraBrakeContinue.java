package com.udemy.clases;

public class PalabraBrakeContinue {

    public static void main(String[] args) {
        //Ejemplo break, imprimir solo el primer número par
        for (var numero = 1; numero <= 10; numero++) {
            if (numero % 2 == 0) {
                System.out.println(numero+ " ");
                break;
            }
        }
        //Ejemplo con continue, imprimir solo numeros pares, ignorar impares
        System.out.println("Palabra Continue");
        for(var numero = 1; numero <= 10; numero++) {
            if (numero % 2 == 1) { //Numero impar
                continue; //Saltamos a la siguiente iteración
            }
            System.out.print(numero+ " "); //Numeros pares
        }
    }
}
