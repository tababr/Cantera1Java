package com.sofka;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private String nombre;

    public void Menu(){
        menuInfinito();
    }

    private void menuInfinito() {
        Scanner input = new Scanner(System.in);
        Boolean salir = false;
        Integer opcion;

        while (!salir) {
            System.out.println("1. Captura nombre");
            System.out.println("2. Saludar persona");
            System.out.println("3. Salir");

            try {

                System.out.println("Ingresa una de las opciones");
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\n");
                        System.out.println("Ingresa tu nombre: ");
                        nombre = text();
                        System.out.println("Eres: "+nombre);
                        System.out.println("\n");
                        break;
                    case 2:
                        System.out.println("\n");
                        System.out.println("Hola, bienvenido al mundo de la programación estimad@ "+nombre);
                        System.out.println("\n");
                        break;
                    case 3:
                        salir = true;
                        break;

                    default:
                        System.out.println("\n");
                        System.out.println("Opción no valida");
                }
            } catch (InputMismatchException e) {
                System.out.println("\n");
                System.out.println("Debes insertar un número");
                input.next();
            }
        }
    }

    private static String text() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}

