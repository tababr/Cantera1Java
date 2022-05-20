package com.sofka;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean salir = false;
        Integer opcion;

        while (!salir) {
            System.out.println("Taller 2-Condicionales");
            System.out.println("1. Figura 1 (Ciclo For)");
            System.out.println("2. Figura 2 (Ciclo While)");
            System.out.println("3. Figura 3 (Ciclo Do while)");
            System.out.println("4. Tabla de multiplicar (Ciclo For)");
            System.out.println("5. Menu infinito");
            System.out.println("6. Contactos teléfonicos");
            System.out.println("7. Parqueadero");
            System.out.println("8. Escuela automovilística");
            System.out.println("0. Salir");

            try {

                System.out.println("Ingresa una de las opciones");
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\n");
                        Figura1 figura1 = new Figura1();
                        figura1.Figura1();
                        System.out.println("\n");
                        break;
                    case 2:
                        System.out.println("\n");
                        Figura2 figura2 = new Figura2();
                        figura2.Figura2();
                        System.out.println("\n");
                        break;
                    case 3:
                        System.out.println("\n");
                        Figura3 figura3 = new Figura3();
                        figura3.Figura3();
                        System.out.println("\n");
                        break;
                    case 4:
                        System.out.println("\n");
                        TablaMultiplicar tablaMultiplicar = new TablaMultiplicar();
                        tablaMultiplicar.TablaMultiplicar();
                        System.out.println("\n");
                        break;
                    case 5:
                        System.out.println("\n");
                        Menu menu = new Menu();
                        menu.Menu();
                        System.out.println("\n");
                        break;
                    case 6:
                        System.out.println("\n");
                        Contactos contactos = new Contactos();
                        contactos.Contactos();
                        System.out.println("\n");
                        break;
                    case 7:
                        System.out.println("\n");
                        Parqueadero parqueadero = new Parqueadero();
                        parqueadero.Parqueadero();
                        System.out.println("\n");
                        break;
                    case 8:
                        System.out.println("\n");
                        EscuelaAuto escuelaauto = new EscuelaAuto();
                        escuelaauto.escuelaAuto();
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
