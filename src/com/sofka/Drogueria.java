package com.sofka;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Drogueria {
    private String nombreProducto;
    private String nombreCliente;
    private String novedad;
    private Double telefono, numeroTarjeta;

    String producto0 = "Calmidol";
    Integer precioPro0 = 6500;
    String descripcionPro0 = "Analgesico que actúa en contra de los dolores y cólicos menstruales.";

    String producto1 = "Dulcolax";
    Integer precioPro1 = 22300;
    String descripcionPro1 = "Laxante y estimulante en el tratamiento del estreñimiento y la evacuación del colon.";

    String producto2 = "Preservativo";
    Integer precioPro2 = 12900;
    String descripcionPro2 = "Preservativo ayuda a prevenir el embarazo y reducir el riesgo de infecciones de transmicion sexual.";


    public void Drogueria() {
        menu();
    }

    private void menu() {
        Scanner input = new Scanner(System.in);
        Boolean salir = false;
        Integer opcion;

        while (!salir) {
            System.out.println("Taller 2-Bienvenido a Tu Droguería");
            System.out.println("1. Consulta productos disponibles");
            System.out.println("2. Compra el producto");
            System.out.println("3. Devolución de producto");
            System.out.println("4. Confirmar pago de producto");
            System.out.println("5. Salir");

            try {

                System.out.println("Ingresa una de las opciones");
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\n");
                        System.out.println("1. " + "Nombre: " + producto0 + "\n" + "Precio: " + precioPro0 + "\n" + "Descripción: " + descripcionPro0);
                        System.out.println("2. " + "Nombre: " + producto1 + "\n" + "Precio: " + precioPro1 + "\n" + "Descripción: " + descripcionPro1);
                        System.out.println("3. " + "Nombre: " + producto2 + "\n" + "Precio: " + precioPro2 + "\n" + "Descripción: " + descripcionPro2);
                        System.out.println("\n");
                        break;
                    case 2:
                        System.out.println("\n");
                        System.out.println("Ingresa el nombre del producto a comprar:");
                        nombreProducto = text();
                        if (nombreProducto.equals(producto0) || nombreProducto.equals(producto1) || nombreProducto.equals(producto2)) {
                            System.out.println("Ingresa tu nombre: ");
                            nombreCliente = text();
                            System.out.println("Ingresa tu telefono");
                            telefono = num();
                            System.out.println("Ingresa tu número de tarjeta");
                            numeroTarjeta = num();
                            System.out.println("Los datos del señor " + nombreCliente + " se registraron.");
                        } else {
                            System.out.println("Lo sentimos, el producto ingresado no esta disponible.");
                        }
                        System.out.println("\n");
                        break;
                    case 3:
                        System.out.println("\n");
                        System.out.println("Ingresa el nombre del producto a devolver:");
                        nombreProducto = text();
                        if (nombreProducto.equals(producto0) || nombreProducto.equals(producto1) || nombreProducto.equals(producto2)) {
                            System.out.println("Indica la novedad de la devolución del producto:");
                            novedad = text();
                            System.out.println("El producto " + nombreProducto + " a sido devuelto correctamente, con novedad: " + novedad);
                        } else {
                            System.out.println("La película no fue alquilada en nuestra tienda.");
                        }
                        System.out.println("\n");
                        break;
                    case 4:
                        System.out.println("\n");
                        System.out.println("El pago del producto " + nombreProducto + " se realizo correctamente.");
                        System.out.println("\n");
                        break;
                    case 5:
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

    private static Double num() {
        Scanner input = new Scanner(System.in);
        return input.nextDouble(); /*??????*/
    }

    /*private static void limpiaPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }*/
}
