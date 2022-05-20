package com.sofka;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EscuelaAuto {
    private static String valNombre;
    private String[] nombre = new String[8];
    private Boolean[] presentacionExamen = new Boolean[8];
    private Boolean[] aprobacionExamen = new Boolean[8];
    private static Integer cont;
    private static Integer contGlobal = 1;
    private static Integer contUnico = 8;
    private Integer flag0 = 0;
    private Integer flag1 = 0;

    public void escuelaAuto() {
        menu();
    }

    private void menu() {
        Scanner input = new Scanner(System.in);
        Boolean salir = false;
        Integer opcion;

        while (!salir) {
            System.out.println("Taller 2-Escuela Automovilismo");
            System.out.println("1. Ingresar usuario");
            System.out.println("2. Consultar usuario");
            System.out.println("3. Salir");

            try {

                System.out.println("Ingresa una de las opciones");
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        registarUsuario();
                        break;
                    case 2:
                        conUsuario();
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

    private void registarUsuario() {
        System.out.print("Cantidad de usuarios a ingresar:");
        cont = num();

        if (cont <= 8 && contGlobal <= 8 && contUnico <= 8) {
            if (cont == 1) {
                if (contUnico > 0 && contUnico <= 8) {
                    fillArray(1);
                    contUnico = contUnico - 1;
                }
            } else if (cont == 2) {
                if (contUnico > 1 && contUnico <= 8) {
                    fillArray(2);
                    contUnico = contUnico - 2;
                }
            } else if (cont == 3) {
                if (contUnico > 2 && contUnico <= 8) {
                    fillArray(3);
                    contUnico = contUnico - 3;
                }
            } else if (cont == 4) {
                if (contUnico > 3 && contUnico <= 8) {
                    fillArray(4);
                    contUnico = contUnico - 4;
                }
            } else if (cont == 5) {
                if (contUnico > 4 && contUnico <= 8) {
                    fillArray(5);
                    contUnico = contUnico - 5;
                }
            } else if (cont == 6) {
                if (contUnico > 5 && contUnico <= 8) {
                    fillArray(6);
                    contUnico = contUnico - 6;
                }
            } else if (cont == 7) {
                if (contUnico > 6 && contUnico <= 8) {
                    fillArray(7);
                    contUnico = contUnico - 7;
                }
            } else if (cont == 8) {
                if (contUnico > 7) {
                    fillArray(8);
                    contUnico = contUnico - 8;
                }
            }
        } else {
            System.out.println("Solo se permite ingresar 8 aprendices");
            System.out.println("\n");
        }
    }

    private void fillArray(Integer cont1) {
        Integer i;
        for (i = 0; i < cont1; i++) {
            System.out.println("Nombre completo: " + (i + 1));
            nombre[i] = text();
            System.out.print("Ingrese False(No presentado) o True (Presentado). ¿El aprendiz presento el exámen?: ");
            presentacionExamen[i] = logico();
            System.out.print("Ingrese False (No aprobado) o True (Aprobado). ¿El aprendiz aprobo el exámen?: ");
            aprobacionExamen[i] = logico();
            System.out.println("\n");
            contGlobal++;
        }
    }

    private void conUsuario() {
        System.out.println("Ingresa el nombre a consultar");
        valNombre = text();
        Integer i;

        for (i = 0; i < nombre.length; i++) {
            if (nombre[i] != null) {
                if (presentacionExamen[i] == Boolean.TRUE && nombre[i].equals(valNombre)) {
                    System.out.println(" El aprendiz: " + nombre[i] + "\n" + " tiene como resultado en el exámen: " + aprobacionExamen[i] + "\n");
                    flag0 = 1;
                } else {
                    System.out.println("El aprendiz no presento el exámen");
                }
            }
        }
        if (flag0 != 1) {
            System.out.println("No hay aprendices registrados o esta ingresando mal el nombre");
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

    private static Boolean logico() {
        Scanner input = new Scanner(System.in);
        return input.nextBoolean();
    }
}
