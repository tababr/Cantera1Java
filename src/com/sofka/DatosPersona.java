package com.sofka;

import java.util.Scanner;

public class DatosPersona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Integer edad;
    private Double estatura;
    private Scanner input;

    public void DatosPersona() {
        input = new Scanner(System.in);

        setNombre();
        nombre = getNombre();
        setApellido1();
        apellido1 = getApellido1();
        setApellido2();
        apellido2 = getApellido2();
        setEdad();
        edad = getEdad();
        setEstatura();
        estatura = getEstatura();
        System.out.println("Nombre completo: " + nombre + " " + " " + apellido1 + " " + " " + apellido2);
        System.out.println("Y su edad es: " + edad + " " + " y mides " + estatura + " mts");
    }

    public void setNombre() {
        System.out.println("Nombre: ");
    }

    public String getNombre() {
        return input.nextLine();
    }

    public void setApellido1() {
        System.out.println("Apellido1: ");
    }

    public String getApellido1() {
        return input.nextLine();
    }

    public void setApellido2() {
        System.out.println("Apellido2: ");
    }

    public String getApellido2() {
        return input.nextLine();
    }

    public void setEdad() {
        System.out.println("Edad: ");
    }

    public Integer getEdad() {
        return input.nextInt();
    }

    public void setEstatura() {
        System.out.println("Estatura: ");
    }

    public Double getEstatura() {
        return input.nextDouble();
    }
}
