package com.sofka;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Scanner input;

    public void Persona() {
        input = new Scanner(System.in);
        setNombre();
        nombre = getNombre();
        setApellido1();
        apellido1 = getApellido1();
        setApellido2();
        apellido2 = getApellido2();
        System.out.println("Nombre completo: " + nombre + " " + " " + apellido1 + " " + " " + apellido2);
    }

    public void setNombre() {
        System.out.println("Ingresa tu nombre: ");
    }

    public void setApellido1() {
        System.out.println("Ingresa tu primer apellido: ");
    }

    public void setApellido2() {
        System.out.println("Ingresa tu segundo apellido: ");
    }

    public String getNombre() {
        return input.nextLine();
    }

    public String getApellido1() {
        return input.nextLine();
    }

    public String getApellido2() {
        return input.nextLine();
    }
}

