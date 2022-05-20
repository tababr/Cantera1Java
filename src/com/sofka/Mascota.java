package com.sofka;

import java.util.Scanner;

public class Mascota {
    private String nombre;
    private String tipoMascota;
    private String nombreD;
    private Integer edad;
    private Scanner input;

    public void Mascota() {
        input = new Scanner(System.in);

        setNombre();
        nombre = getNombre();
        setTipoMascota();
        tipoMascota = getTipoMascota();
        setEdad();
        edad = getEdad();
        input.nextLine();  /*Limpiar el buffer después de leer el número entero mediante el método nextLine(),
       ya que si no se limpia no leera correctamente el siguiente metodo*/
        setNombreD();
        nombreD = getNombreD();
        System.out.println(nombre + " es un(a) " + tipoMascota + ", el cual, tiene " + edad + " años de edad y "
                + nombreD + " es actualmente su dueño(a).");
    }

    public void setNombre() {
        System.out.println("Ingresa el nombre de tu mascota");
    }

    public String getNombre() {
        return input.nextLine();
    }

    public void setTipoMascota() {
        System.out.println("Ingresa el tipo de mascota: ");
    }

    public String getTipoMascota() {
        return input.nextLine();
    }

    public void setEdad() {
        System.out.println("Ingresa la edad de tu mascota: ");
    }

    public Integer getEdad() {
        return input.nextInt();
    }

    public void setNombreD() {
        System.out.println("Ingresa tu nombre completo: ");
    }

    public String getNombreD() {
        return input.nextLine();
    }


}
