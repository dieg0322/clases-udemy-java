package com.udemy.clases;

import java.util.Scanner;


public class MesDelAño {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el mes: ");
        Integer mes = scanner.nextInt();
        String estacion;

        if(mes == 1 || mes == 2 || mes == 3){
            estacion = "Primavera";
        }else if(mes == 4 || mes == 5 || mes == 6){
            estacion = "Verano";
        }else if(mes == 7 || mes == 8 || mes == 9){
            estacion = "Otoño";
        }else if(mes == 10 || mes == 11 || mes == 12){
            estacion = "Invierno";
        }else {
            estacion = "Estación del año no registrada";
        }
        System.out.printf("Estación para el mes %d es %s ", mes, estacion);

    }
}
