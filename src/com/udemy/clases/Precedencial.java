package com.udemy.clases;

public class Precedencial {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean resultado = a && b || !b; // && se evalúa primero, luego || y finalmente !
        System.out.println("Resultado: " + resultado); // Resultado: true

    }

}
