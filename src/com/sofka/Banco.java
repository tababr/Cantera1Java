package com.sofka;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Banco {
    private Integer ingreso, retiro, saldo;
    private String titularConsulta;

    String titular = "El Brayan";
    Integer cantidad = 500000;

    public void Banco() {
        menu();
    }

    private void menu() {
        Scanner input = new Scanner(System.in);
        Boolean salir = false;
        Integer opcion;

        while (!salir) {
            System.out.println("Taller 2-Bienvenido a Tu Banco");
            System.out.println("1. Realizar ingreso");
            System.out.println("2. Realizar retiro");
            System.out.println("3. Consulta saldo");
            System.out.println("4. Salir");

            try {

                System.out.println("Ingresa una de las opciones");
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\n");
                        System.out.println("Su saldo actual es de: " + cantidad);
                        System.out.println("Digitá el valor a ingresar");
                        ingreso = num();
                        validacionIngreso(ingreso);
                        System.out.println("\n");
                        break;
                    case 2:
                        System.out.println("\n");
                        System.out.println("Digitá el valor a retirar: ");
                        retiro = num();
                        validacionRetiro(retiro);
                        System.out.println("\n");
                        break;
                    case 3:
                        System.out.println("\n");
                        System.out.println("El señor: " + titular + " tiene disponible " + cantidad);
                        saldo = ingreso + cantidad;
                        System.out.println("Saldo disponible con ingresos: " + saldo);
                        saldo = cantidad - retiro;
                        System.out.println("Saldo disponible con retiros: " + saldo);
                        System.out.println("\n");
                        break;
                    case 4:
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

    private void validacionIngreso(Integer ingreso) {
        if (ingreso < 0) {
            System.out.println("El valor no puede ser negativo");
        } else {
            System.out.println("Transacción exitosa");
        }

    }

    private void validacionRetiro(Integer retiro) {
        if (retiro > cantidad) {
            System.out.println("Lo sentimos, su cuenta no puede quedar en 0");
        } else {
            System.out.println("Transacción exitosa");
        }
    }

    private static String text() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private static Integer num() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
