package com.sofka;

import java.util.Scanner;

public class Edad {
    private Integer edad;
    private Scanner input;

    public void Edad() {
        Validacion();
    }

    private void Validacion() {
        input = new Scanner(System.in);
        setEdad();
        edad = getEdad();

        if (edad >= 18) {
            System.out.println("Usted es mayor de edad");
        }
    }

    public void setEdad() {
        System.out.println("Ingresa tu edad: ");
    }

    public Integer getEdad() {
        return input.nextInt();
    }
}
