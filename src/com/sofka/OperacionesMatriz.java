package com.sofka;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OperacionesMatriz {
    private String[][] matrizInit = new String[10][10];
    private Integer[][] matrizResult = new Integer[10][10];
    private Integer i, j, f1, c1;
    private String p1, f2, c2;

    public void OperacionesMatriz() {
        menu();
    }

    private void menu() {
        Scanner input = new Scanner(System.in);
        Boolean salir = false;
        Integer opcion;

        while (!salir) {
            System.out.println("Taller 2-Tablas de multiplicar");
            System.out.println("1. Ingresar una posición");
            System.out.println("2. Salir");

            try {
                System.out.println("Ingresa una de las opciones");
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\n");
                        initMatriz();
                        System.out.println("\n");
                        break;
                    case 2:
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

    private void initMatriz() {
        System.out.println("----Matriz Bidimensional Tablas de multiplicar----");
        for (i = 0; i <= 9; i++) {
            System.out.print("    " + i);
        }
        System.out.println(" ");
        for (i = 0; i <= 9; i++) {
            System.out.print(i + "  ");
            for (j = 0; j <= 9; j++) {
                f1 = i + 1;
                c1 = j + 1;
                f2 = String.valueOf(f1);
                c2 = String.valueOf(c1);
                p1 = f2 + "x";
                p1 = p1 + c2;
                matrizInit[i][j] = p1;
                System.out.print(matrizInit[i][j] + "  ");
            }
            System.out.println(" ");
        }
        calculateMatriz();
        System.out.println(" ");
    }

    private void calculateMatriz() {
        for (i = 0; i <= 9; i++) {
            for (j = 0; j <= 9; j++) {
                matrizResult[i][j] = (i + 1) * (j + 1);
            }
        }
        dataMatriz();
    }

    private void dataMatriz() {
        Integer fila, columna;
        System.out.println(" ");
        System.out.println("Ingrese la fila: ");
        fila = num();
        System.out.println("Ingrese la columna: ");
        columna = num();
        if (fila >= 0 && fila <= 9 && columna >= 0 && columna <= 9) {
            System.out.println("El resultado de la posición ingresada [" + fila + "," + columna + "] es: " + matrizResult[fila][columna]);
        } else {
            System.out.println("Datos incorrectos");
        }
    }

    private static Integer num() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
