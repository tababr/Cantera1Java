package com.sofka;

import java.util.Scanner;

public class Fiesta {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Integer edad;
    private Scanner input;

    public void Fiesta() {
        Validacion();
    }

    private void Validacion() {
        input = new Scanner(System.in);
        setNombre();
        nombre = getNombre();
        setApellido1();
        apellido1 = getApellido1();
        setApellido2();
        apellido2 = getApellido2();
        setEdad();
        edad = getEdad();

        if (edad >= 18) {
            System.out.println(nombre + " " + apellido1 + " " + apellido2 + " " + " usted es mayor de edad, por lo tanto puede ingresar a la fiesta.");
        } else {
            System.out.println(nombre + " " + apellido1 + " " + apellido2 + " " +
                    " usted es menor de edad, por lo tanto no puede ingresar a la fiesta, por favor devuelvase a su casa");
        }
    }

    public void setNombre() {
        System.out.println("Ingresa tu nombre: ");
    }

    public String getNombre() {
        return input.nextLine();
    }

    public void setApellido1() {
        System.out.println("Ingresa tu primer apellido: ");
    }

    public String getApellido1() {
        return input.nextLine();
    }

    public void setApellido2() {
        System.out.println("Ingresa tu segundo apellido: ");
    }

    public String getApellido2() {
        return input.nextLine();
    }

    public void setEdad() {
        System.out.println("Ingresa tu edad: ");
    }

    public Integer getEdad() {
        return input.nextInt();
    }
}
