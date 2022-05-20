package com.sofka;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean salir = false;
        Integer opcion; //Se guarda la opcion del usuario

        while (!salir) {//Bucle que repite el menú
            System.out.println("Taller 1-Variables e impresión");
            System.out.println("1. Capturar datos persona");
            System.out.println("2. Capturar datos persona más extenso");
            System.out.println("3. Datos familia");
            System.out.println("4. Capital país");
            System.out.println("5. Datos mascota");
            System.out.println("6. Salir");

            try {

                System.out.println("Ingresa una de las opciones");
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\n");
                        Persona persona = new Persona(); //Creo un objeto nuevo de tipo Persona.
                        persona.Persona();
                        System.out.println("\n");
                        break;
                    case 2:
                        System.out.println("\n");
                        DatosPersona datosPersona = new DatosPersona(); //Creo un objeto nuevo de tipo DatosPersona.
                        datosPersona.DatosPersona();
                        System.out.println("\n");
                        break;
                    case 3:
                        System.out.println("\n");
                        Familia familia = new Familia(); //Creo un objeto nuevo de tipo Familia.
                        familia.Familia();
                        System.out.println("\n");
                        break;
                    case 4:
                        System.out.println("\n");
                        PaisCapital paisCapital = new PaisCapital(); //Creo un objeto nuevo de tipo PaisCapital.
                        paisCapital.PaisCapital();
                        System.out.println("\n");
                        break;
                    case 5:
                        System.out.println("\n");
                        Mascota mascota = new Mascota(); //Creo un objeto nuevo de tipo Mascota.
                        mascota.Mascota();
                        System.out.println("\n");
                        break;
                    case 6:
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