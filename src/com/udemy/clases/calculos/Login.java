package com.udemy.clases.calculos;

import java.util.Scanner;

public class Login {


    public static void main(String[] args) {
        final String USUARIO = "admin";
        final String CONTRASENIA = "123";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el Usuario: ");
        String usuario = scanner.nextLine().strip().toLowerCase();

        System.out.print("Introduzca la contraseña: ");
        String contrasenia = scanner.nextLine().strip().toLowerCase();

        var mensajeAutenticacion = switch (usuario){
            case USUARIO -> {
            if(CONTRASENIA.equals(contrasenia))
                yield "Bienvenida al sistema";
            else
                yield "Password incorrecta, favor de corregirlo";
            }
            default -> {
                if (CONTRASENIA.equals(contrasenia))
                    yield "Usuario incorrecto, favor de corregirlo";
                else
                    yield "Usuario y password incorrector, favor de corregirlos";
            }
        };
        System.out.println("mensajeAutenticacion = " + mensajeAutenticacion);
    }
}
