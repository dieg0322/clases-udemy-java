package com.udemy.clases;

import java.util.Scanner;

public class CalcularAreaRectangulo {

    public static void main(String[] args) {
        System.out.println("Calcular el area y perimetro de un rectangulo");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Base :");
        var base = scanner.nextDouble();
        
        System.out.print("Altura :");
        var altura = scanner.nextDouble();

        var area = base * altura;
        System.out.println("area = " + area);
        
        var perimetro = (base + altura) * 2;
        System.out.println("perimetro = " + perimetro);

    }





}
