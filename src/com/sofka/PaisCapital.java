package com.sofka;

import java.util.Scanner;

public class PaisCapital {
    private String ciudad;
    private String pais;
    private Scanner input;

    public void PaisCapital(){
        input = new Scanner(System.in);
        setCiudad();
        ciudad = getCiudad();
        setPais();
        pais = getPais();
        System.out.println("La ciudad de "+ciudad+" es la capital del país "+pais);
    }

    public void setCiudad(){
        System.out.println("Ingresa una ciudad: ");
    }

    public String getCiudad(){
        return input.nextLine();
    }

    public void setPais(){
        System.out.println("Ingresa un país: ");
    }

    public String getPais() {
        return input.nextLine();
    }
}
