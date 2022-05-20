package com.sofka;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VideoTienda {
    private String nombrePelicula;
    private String novedad;
    private String nombreCliente;
    private Double telefono;
    private Double numeroTarjeta;

    String pelicula0 = new String("Matrix");
    String pelicula1 = new String("Lucy");
    String pelicula2 = new String("Thor");
        /*String pelicula0 = ("Matrix");
        String pelicula1 = ("Lucy");
        String pelicula2 = ("Thor");*/

    public void VideoTienda() {
        /*limpiaPantalla();*/
        menu();
    }

    public void menu() {
        Scanner input = new Scanner(System.in);
        Boolean salir = false;
        Integer opcion;
        while (!salir) {
            System.out.println("Taller 2-Bienvenido a Tu Video Tienda");
            System.out.println("1. Películas disponibles");
            System.out.println("2. Alquilar película");
            System.out.println("3. Devolver película");
            System.out.println("4. Confirmar alquiler de película");
            System.out.println("5. Salir");

            try {

                System.out.println("Ingresa una de las opciones");
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\n");
                        System.out.println("1. " + pelicula0);
                        System.out.println("2. " + pelicula1);
                        System.out.println("3. " + pelicula2);
                        System.out.println("\n");
                        break;
                    case 2:
                        System.out.println("\n");
                        System.out.println("Ingresa el nombre de la pelicula:");
                        nombrePelicula = text();
                        if (nombrePelicula.equals(pelicula0) || nombrePelicula.equals(pelicula1) || nombrePelicula.equals(pelicula2)) {
                            System.out.println("Ingresa tu nombre: ");
                            nombreCliente = text();
                            System.out.println("Ingresa tu telefono");
                            telefono = num();
                            System.out.println("Ingresa tu número de tarjeta");
                            numeroTarjeta = num();
                            System.out.println("Los datos del señor " + nombreCliente + " se registraron.");
                        } else {
                            System.out.println("Lo sentimos, la película no esta disponible.");
                        }
                        System.out.println("\n");
                        break;
                    case 3:
                        System.out.println("\n");
                        System.out.println("Ingresa el nombre de la película a devolver:");
                        nombrePelicula = text();
                        if (nombrePelicula.equals(pelicula0) || nombrePelicula.equals(pelicula1) || nombrePelicula.equals(pelicula2)) {
                            System.out.println("Indica si la película presenta daños o novedades:");
                            novedad = text();
                            System.out.println("La película " + nombrePelicula + " a sido devuelta correctamente, con novedad: " + novedad);
                        } else {
                            System.out.println("La película no fue alquilada en nuestra tienda.");
                        }
                        System.out.println("\n");
                        break;
                    case 4:
                        System.out.println("\n");
                        System.out.println("La película " + nombrePelicula + " a sido alquilada correctamente.");
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
        return input.nextDouble();
    }

    /*private static void limpiaPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }*/


}
