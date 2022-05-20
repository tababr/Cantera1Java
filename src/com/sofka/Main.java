package com.sofka;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean salir = false;
        Integer opcion;

        while (!salir) {
            System.out.println("Taller 2-Arreglos");
            System.out.println("1. Llenar vector");
            System.out.println("2. Números aleatorios");
            System.out.println("3. Números primos");
            System.out.println("4. Matriz en zigzag");
            System.out.println("5. Matriz operaciones");
            System.out.println("0. Salir");

            try {

                System.out.println("Ingresa una de las opciones");
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\n");
                        Vector vector = new Vector();
                        vector.Vector();
                        System.out.println("\n");
                        break;
                    case 2:
                        System.out.println("\n");
                        Aleatorio aleatorio = new Aleatorio();
                        aleatorio.Aleatorio();
                        System.out.println("\n");
                        break;
                    case 3:
                        System.out.println("\n");
                        Primos primos = new Primos();
                        primos.Primos();
                        System.out.println("\n");
                        break;
                    case 4:
                        System.out.println("\n");
                        BidimensionalMatriz bidimensionalMatriz = new BidimensionalMatriz();
                        bidimensionalMatriz.BidimensionalMatriz();
                        System.out.println("\n");
                        break;
                    case 5:
                        System.out.println("\n");
                        OperacionesMatriz operacionesMatriz = new OperacionesMatriz();
                        operacionesMatriz.OperacionesMatriz();
                        System.out.println("\n");
                        break;
                    case 0:
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
}
