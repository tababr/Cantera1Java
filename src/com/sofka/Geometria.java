package com.sofka;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Geometria {
    private Double base0, base1;
    private Double altura;
    private Double area;

    public void Geometria(){
        menu();
    }

    private void menu() {
        Scanner input = new Scanner(System.in);
        Boolean salir = false;
        Integer opcion;

        while (!salir) {
            System.out.println("Taller 2-Condicionales");
            System.out.println("1. Calcular área de un rectángulo");
            System.out.println("2. Calcular área de un triángulo");
            System.out.println("3. Calcular áre de un trapecio");
            System.out.println("4. Salir");

            try {

                System.out.println("Ingresa una de las opciones");
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\n");
                        System.out.println("RECTÁNGULO");
                        System.out.println("Ingrese la base: ");
                        base0 = num();
                        System.out.println("Ingrese la altura: ");
                        altura = num();
                        area = base0*altura;
                        System.out.println("El área del rectángulo es:"+area+" cm^2");
                        System.out.println("\n");
                        break;
                    case 2:
                        System.out.println("\n");
                        System.out.println("TRIÁNGULO");
                        System.out.println("Ingrese la base: ");
                        base0 = num();
                        System.out.println("Ingrese la altura: ");
                        altura = num();
                        area = (base0*altura)/2;
                        System.out.println("El área del triángulo es:"+area+" cm^2");
                        System.out.println("\n");
                        break;
                    case 3:
                        System.out.println("\n");
                        System.out.println("TRAPECIO");
                        System.out.println("Ingrese la primer base: ");
                        base0 = num();
                        System.out.println("Ingrese la segunda base: ");
                        base1 = num();
                        System.out.println("Ingrese la altura: ");
                        altura = num();
                        area = ((base0+base1)*altura)/2;
                        System.out.println("El área del trapecio es:"+area+" cm^2");
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

    private static Double num() {
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
}
