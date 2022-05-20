package com.sofka;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Motocicleta {
    private String fechaEntrada, fechaSalida;
    private String observacion0, novedad;
    private String marcaM0, marcaRetiro;
    private String nombrePro;
    private Double cantidadMotocicletas, idPro, telefono;

    String mecanico = "Jorge El Meca";

    public void Motocicleta() {
        menu();
    }

    public void menu() {
        Scanner input = new Scanner(System.in);
        Boolean salir = false;
        Integer opcion;
        while (!salir) {
            System.out.println("Taller 2-Bienvenido a Tu Taller");
            System.out.println("1. Registro de ingreso motocicleta");
            System.out.println("2. Registro salida motocicleta");
            System.out.println("3. Historial arreglo por mecanico");
            System.out.println("4. Salir");

            try {

                System.out.println("Ingresa una de las opciones");
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\n");
                        System.out.println("Ingresa la cantidad de motos a ingresar");
                        cantidadMotocicletas = num();
                        if (cantidadMotocicletas == 1) {
                            System.out.println("Fecha de ingreso: ");
                            fechaEntrada = text();
                            System.out.println("Marca: ");
                            marcaM0 = text();
                            System.out.println("Nombre del propietario: ");
                            nombrePro = text();
                            System.out.println("Id del propietario: ");
                            idPro = num();
                            System.out.println("Teléfono: ");
                            telefono = num();
                            System.out.println("Observaciones del propietario: ");
                            observacion0 = text();
                            System.out.println("La motocicleta a sido ingresada al taller en la fecha: " + fechaEntrada);
                        } else {
                            System.out.println("Solo se permite ingresar una moto por cliente");
                        }
                        System.out.println("\n");
                        break;
                    case 2:
                        System.out.println("\n");
                        System.out.println("Ingresa la marca de la motocicleta a retirar:");
                        marcaRetiro = text();
                        if (marcaRetiro.equals(marcaM0)) {
                            System.out.println("Ingresa la fecha de salida: ");
                            fechaSalida = text();
                            System.out.println("Ingresa novedades si existen: ");
                            novedad = text();
                            System.out.println("La motocicleta " + marcaRetiro + " a sido retirada del taller en la fecha: " + fechaSalida + " con novedad de: " + novedad);
                        } else {
                            System.out.println("La marca ingresada no se encuentra registrada en nuestro taller");
                        }
                        System.out.println("\n");
                        break;
                    case 3:
                        if (cantidadMotocicletas == 1) {
                            System.out.println("El mecánico " + mecanico + " reparo " + cantidadMotocicletas + " motocicleta(s) el día de hoy");
                            System.out.println("Arreglos echos por el mecánico: " + mecanico);
                            System.out.println(novedad);
                        }
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

    private static String text() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private static Double num() {
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

}