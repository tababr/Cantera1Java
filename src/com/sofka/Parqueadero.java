package com.sofka;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Parqueadero {
    private String[] placa = new String[5];
    private String[] marca = new String[5];
    private String[] nombre = new String[5];
    private Integer[] telefono = new Integer[5];
    private Integer cont;
    private Integer contGlobal = 1;
    private Integer contUnico = 5;
    private String valPlaca;
    private String buscar;
    private Integer flag0 = 0;
    private Integer flag1 = 0;

    public void Parqueadero() {
        menu();
    }

    private void menu() {
        Scanner input = new Scanner(System.in);
        Boolean salir = false;
        Integer opcion;

        while (!salir) {
            System.out.println("Taller 2-Parqueadero");
            System.out.println("1. Agregar vehículo");
            System.out.println("2. Consultar vehículo");
            System.out.println("3. Retirar vehículo");
            System.out.println("4. Salir");

            try {

                System.out.println("Ingresa una de las opciones");
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        añadirVehículo();
                        break;
                    case 2:
                        conVehiculo();
                        break;
                    case 3:
                        removeVehiculo();
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

    private void añadirVehículo() {
        System.out.println("Cantidad de vehículos a ingresar:");
        cont = num();

        if (cont <= 5 && contGlobal <= 5 && contUnico <= 5) {
            if (cont == 1) {
                if (contUnico > 0 && contUnico <= 5) {
                    fillArray(1);
                    contUnico = contUnico - 1;
                }
            } else if (cont == 2) {
                if (contUnico > 1 && contUnico <= 5) {
                    fillArray(2);
                    contUnico = contUnico - 2;
                }
            } else if (cont == 3) {
                if (contUnico > 2 && contUnico <= 5) {
                    fillArray(3);
                    contUnico = contUnico - 3;
                }
            } else if (cont == 4) {
                if (contUnico > 3 && contUnico <= 5) {
                    fillArray(4);
                    contUnico = contUnico - 4;
                }
            } else if (cont == 5) {
                if (contUnico > 5) {
                    fillArray(5);
                    contUnico = contUnico - 5;
                }
            }
        } else {
            System.out.println("Solo se permite ingresar 5 vehículos");
        }
    }

    private void fillArray(Integer cont1) {
        Integer i;
        for (i = 0; i < cont1; i++) {
            System.out.println("Placa: " + (i + 1));
            valPlaca = text();
            placa[i] = valPlaca(valPlaca);

            System.out.print("Marca: ");
            marca[i] = text();
            System.out.print("Nombre del propietario: ");
            nombre[i] = text();
            System.out.print("Teléfono: ");
            telefono[i] = num();
            System.out.println("\n");
            contGlobal++;
        }
    }

    private String valPlaca(String placaVal) {
        if (placaVal.equals(placa[0]) || placaVal.equals(placa[1]) || placaVal.equals(placa[2]) || placaVal.equals(placa[3]) || placaVal.equals(placa[4])) {
            System.out.println("La placa " + placaVal + " ya está registrada. Digite otra por favor:");
            placaVal = text();
            valPlaca(placaVal);
        }
        return placaVal;
    }

    private void conVehiculo() {
        System.out.print("Ingrese la placa del vehículo a buscar: ");
        buscar = text();

        Integer i;
        for (i = 0; i < placa.length; i++) {
            if (placa[i] != null) {
                if (placa[i].equals(buscar)) {
                    System.out.println(" Placa: " + placa[i] + "\n" + " Marca: " + marca[i] + "\n" + " Propietario: " + nombre[i] + "\n" + " Teléfono: "
                            + telefono[i] + "\n" + " Lugar del parqueadero: " + (i + 1) + "\n");
                    flag0 = 1;
                }
            }
        }
        if (flag0 != 1) {
            System.out.println("El vehículo no se ingreso a nuestro parqueadero");
            System.out.println("\n");
        }
    }

    private void removeVehiculo() {
        System.out.print("Ingrese la placa del vehículo a retirar: ");
        buscar = text();

        Integer i;
        for (i = 0; i < placa.length; i++) {
            if (placa[i] != null) {
                if (placa[i].equals(buscar)) {
                    placa[i] = "";
                    marca[i] = "";
                    nombre[i] = "";
                    telefono[i] = 0;
                    flag1 = 1;
                    System.out.println("El vehículo a sido retirado del parqueadero");
                    System.out.println("\n");
                }
            }
        }
        if (flag1 != 1) {
            System.out.println("El vehículo no se encuentra en nuestro parqueadero");
            System.out.println("\n");
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
