package com.udemy.clases.calculos;

import java.util.Scanner;

public class ValidacionPassword {

    public static void main(String[] args) {
        String password;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la password: ");
        password = scanner.nextLine();

        while (password.length() < 6) {
            System.out.print("Introduzca una nueva password: ");
            password = scanner.nextLine();
        }
        System.out.println("Password valido" + password);
    }

}
