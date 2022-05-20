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
            System.out.println("1. Validar si es adulto");
            System.out.println("2. Validar si es un niño");
            System.out.println("3. Ingreso fiesta");
            System.out.println("4. Alquiler películas");
            System.out.println("5. Compra droguería");
            System.out.println("6. Taller motos");
            System.out.println("7. Indice de masa corporal");
            System.out.println("8. Pedidos pastelería");
            System.out.println("9. Areas geometria");
            System.out.println("10. Banco");
            System.out.println("0. Salir");

            try {

                System.out.println("Ingresa una de las opciones");
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\n");
                        Edad edad = new Edad();
                        edad.Edad();
                        System.out.println("\n");
                        break;
                    case 2:
                        System.out.println("\n");
                        EdadNiño edadNiño = new EdadNiño();
                        edadNiño.EdadNiño();
                        System.out.println("\n");
                        break;
                    case 3:
                        System.out.println("\n");
                        Fiesta fiesta = new Fiesta();
                        fiesta.Fiesta();
                        System.out.println("\n");
                        break;
                    case 4:
                        System.out.println("\n");
                        VideoTienda videoTienda = new VideoTienda();
                        videoTienda.VideoTienda();
                        System.out.println("\n");
                        break;
                    case 5:
                        System.out.println("\n");
                        Drogueria drogueria = new Drogueria();
                        drogueria.Drogueria();
                        System.out.println("\n");
                        break;
                    case 6:
                        System.out.println("\n");
                        Motocicleta motocicleta = new Motocicleta();
                        motocicleta.Motocicleta();
                        System.out.println("\n");
                        break;
                    case 7:
                        System.out.println("\n");
                        Imc imc = new Imc();
                        imc.Imc();
                        System.out.println("\n");
                        break;
                    case 8:
                        System.out.println("\n");
                        Pasteleria pasteleria = new Pasteleria();
                        pasteleria.Pasteleria();
                        System.out.println("\n");
                        break;
                    case 9:
                        System.out.println("\n");
                        Geometria geometria = new Geometria();
                        geometria.Geometria();
                        System.out.println("\n");
                        break;
                    case 10:
                        System.out.println("\n");
                        Banco banco = new Banco();
                        banco.Banco();
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
