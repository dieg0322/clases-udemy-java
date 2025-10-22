package com.udemy.clases;

import java.util.Scanner;

public class SistemaEnvios {
    private static final Integer ENVIO_NACIONAL = 10;
    private static final Integer ENVIO_INTERNACIONAL = 20;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el destino: ");
        String destino = scanner.nextLine().strip().toLowerCase();

        System.out.print("Introduzca el peso del paquete: ");
        Double peso = scanner.nextDouble();


        /**
        if(destino.equals("nacional"))
            System.out.println("La tarifa es de: "+ENVIO_NACIONAL * peso);
        else if (destino.equals("internacional"))
            System.out.println("La tarifa es de: "+ENVIO_INTERNACIONAL * peso);
        */

        Double costoEnvio = switch (destino){
            case "nacional" -> peso * ENVIO_NACIONAL;
            case "internacional" -> peso * ENVIO_INTERNACIONAL;
            default -> {
                System.out.println("Destino invalido, ingrese nacional/internacional");
                yield null;
            }
        };
        if (costoEnvio != null){
            System.out.printf("el costo de envío es: $%.2f", costoEnvio);
        }
    }
}
