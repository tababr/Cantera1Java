package com.sofka;

import java.util.Scanner;

public class Familia {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String nombrePadre;
    private String apellido1Padre;
    private String apellido2Padre;
    private String nombreMadre;
    private String apellido1Madre;
    private String apellido2Madre;
    private Scanner input;

    public void Familia(){
        input = new Scanner(System.in);

        setNombre();
        nombre = getNombre();
        setApellido1();
        apellido1 = getApellido1();
        setApellido2();
        apellido2 = getApellido2();
        setNombrePadre();
        nombrePadre = getNombrePadre();
        setApellido1Padre();
        apellido1Padre = getApellido1Padre();
        setApellido2Padre();
        apellido2Padre = getApellido2Padre();
        setNombreMadre();
        nombreMadre = getNombreMadre();
        setApellido1Madre();
        apellido1Madre = getApellido1Madre();
        setApellido2Madre();
        apellido2Madre = getApellido2Madre();
        System.out.println("Yo "+ nombre+" "+" "+apellido1+" "+" "+ apellido2+" soy hijo de "
                +nombrePadre+" "+apellido1Padre+" "+apellido2Padre+" y "+
                nombreMadre+" "+apellido1Madre+" "+apellido2Madre);
    }

    public String getNombre() {
        return input.nextLine();
    }

    public void setNombre() {
        System.out.println("Nombre: ");
    }

    public String getApellido1() {
        return input.nextLine();
    }

    public void setApellido1() {
        System.out.println("Apellido1: ");
    }

    public String getApellido2() {
        return input.nextLine();
    }

    public void setApellido2() {
        System.out.println("Apellido2: ");
    }

    public String getNombrePadre() {
        return input.nextLine();
    }

    public void setNombrePadre() {
        System.out.println("Nombre Padre: ");
    }

    public String getApellido1Padre() {
        return input.nextLine();
    }

    public void setApellido1Padre() {
        System.out.println("Apellido1: ");
    }

    public String getApellido2Padre() {
        return input.nextLine();
    }

    public void setApellido2Padre() {
        System.out.println("Apellido2: ");
    }

    public String getNombreMadre() {
        return input.nextLine();
    }

    public void setNombreMadre() {
        System.out.println("Nombre Madre: ");
    }

    public String getApellido1Madre() {
        return input.nextLine();
    }

    public void setApellido1Madre() {
        System.out.println("Apellido1: ");
    }

    public String getApellido2Madre() {
        return input.nextLine();
    }

    public void setApellido2Madre() {
        System.out.println("Apellido2: ");
    }
}
