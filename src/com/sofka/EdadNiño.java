package com.sofka;

import java.util.Scanner;

public class EdadNiño {
    private Integer edad;
    private Scanner input;

    public void EdadNiño() {
        Validacion();
    }

    private void Validacion() {
        input = new Scanner(System.in);
        setEdad();
        edad = getEdad();

        if (edad <= 18) {
            System.out.println("Usted aún es un niño");
        }
    }

    public void setEdad() {
        System.out.println("Ingresa tu edad: ");
    }

    public Integer getEdad() {
        return input.nextInt();
    }
}
