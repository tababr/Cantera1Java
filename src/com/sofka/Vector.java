package com.sofka;

import java.util.Scanner;

public class Vector {
    private Integer[] vector = new Integer[5];

    public void Vector() {
        llenarVector();
    }

    private void llenarVector() {
        Integer i;
        for (i = 0; i <= 4; i++) {
            System.out.print("Ingresa número: ");
            vector[i] = num();
        }

        for (i = 0; i <= 4; i++) {
            System.out.println("[" + i + "]" + "=" + vector[i]);
        }
    }

    private static Integer num() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
