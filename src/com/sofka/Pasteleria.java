package com.sofka;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pasteleria {
    private String nombrePe, nombreCli;
    private Integer cantidadPe, total;

    String nombre0 = "Torta remojada";
    Integer precio0 = 47700;
    String sabor0 = "Tres leches";
    Integer cantidadPor0 = 20;
    String decoracion0 = "Decoración infantil (Marvel o Disney)";

    String nombre1 = "Torta fría";
    Integer precio1 = 24800;
    String sabor1 = "Maracuya";
    Integer cantidadPor1 = 12;
    String decoracion1 = "Decoración redes sociales";

    public void Pasteleria() {
        menu();
    }

    private void menu() {
        Scanner input = new Scanner(System.in);
        Boolean salir = false;
        Integer opcion;

        while (!salir) {
            System.out.println("Taller 2-Bienvenido a Tu Pastelería");
            System.out.println("1. Catálogo de tortas");
            System.out.println("2. Hacer pedido");
            System.out.println("3. Ventas del día");
            System.out.println("4. Salir");

            try {

                System.out.println("Ingresa una de las opciones");
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\n");
                        System.out.println("1. " + "Nombre: " + nombre0 + "\n" + "Precio: " + precio0 + "\n" + "Sabor: " + sabor0 + "\n" + "Porciones: " + cantidadPor0 + "\n" + "Decoración: " + decoracion0);
                        System.out.println("2. " + "Nombre: " + nombre1 + "\n" + "Precio: " + precio1 + "\n" + "Sabor: " + sabor1 + "\n" + "Porciones: " + cantidadPor1 + "\n" + "Decoración: " + decoracion1);
                        System.out.println("\n");
                        break;
                    case 2:
                        System.out.println("\n");
                        System.out.println("Ingresa cuantas tortas añadira el pedido, solo se pueden dos por pedido:");
                        cantidadPe = num();
                        System.out.println("Ingresa el nombre de la torta que quiere agregar: ");
                        nombrePe = text();
                        validacionPedido(nombrePe, cantidadPe);
                        System.out.println("\n");
                        break;
                    case 3:
                        System.out.println("\n");
                        System.out.println("Hoy se vendieron " + cantidadPe + " torta(s).");
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

    private void validacionPedido(String nombrePe, Integer cantidadPe) {
        if (nombrePe.equals(nombre0) && cantidadPe == 1) {
            System.out.println("Nombre del cliente: ");
            nombreCli = text();
            total = precio0;
            System.out.println("El total del pedido es de: " + total + " $");
        } else {
            if (nombrePe.equals(nombre1) && cantidadPe == 2) {
                System.out.println("Nombre del cliente: ");
                nombreCli = text();
                total = precio1 + precio1;
                System.out.println("El total del pedido es de: " + total + " $");
            } else {
                System.out.println("Lo sentimos, el producto ingresado no esta disponible.");
            }
        }
    }

    private static String text() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private static Integer num() {
        Scanner input = new Scanner(System.in);
        return input.nextInt(); /*??????*/
    }
}
