package com.udemy.clases;

import java.util.Random;

public class GeneradorEmail {
    public static void main(String[] args) {

        var nombre = "Ubaldo Acosta";
        var empresa = "Global Mentoring";
        var dominio = " com.mx";

        System.out.println(String.join(" ",nombre,empresa,dominio));

        var resultado = new StringBuilder();
        resultado.append(nombre.toLowerCase().replaceAll(" ",".")).append("@");
        resultado.append(empresa.toLowerCase().replaceAll(" ","."));
        resultado.append(dominio.toLowerCase().replaceAll(" ","."));

        System.out.println("resultado = " + resultado);

        System.out.println("numeros aleatorios");
        var random = new Random();
        var numeroRamdom = random.nextInt(10);
        System.out.println(numeroRamdom);

        System.out.println("Resultado del dado");
        var dado = new Random();
        System.out.println(dado.nextInt(7));

        System.out.println("Formato de cadenas");
        var edad = 44;
        var salario = 220.00;

        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f ", nombre, edad, salario);
        System.out.println(mensaje);
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f%n ", nombre, edad, salario);


        /**
        mensaje = """
                %nDetalle de persona\s
                \tNombre: %s
                \tEdad: %d años
                \tSalario: %2f
                """.formatted(nombre, edad, salario);
        System.out.println(mensaje);

        mensaje = """
                """;
        */
    }
}
