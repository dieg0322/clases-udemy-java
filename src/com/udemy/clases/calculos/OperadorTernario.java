package com.udemy.clases.calculos;

public class OperadorTernario {
    public static void main(String[] args) {
        var num1 = 10;
        var num2 = 20;
        var mayor = (num1 > num2) ? num1 : num2;
        System.out.println("El mayor de " + num1 + " y " + num2 + " es " + mayor);
    }
}
