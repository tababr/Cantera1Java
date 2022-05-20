package com.sofka;

public class Figura2 {
    private Integer global;
    private Integer espacio;
    private Integer asterisco;

    public void Figura2(){
        llenarFi();
    }

    private void llenarFi(){
        global = 10;
        while (global >= 1){
            espacio = 1;
            while (espacio <= global){
                System.out.print(" ");
                espacio = espacio+1;
            }

            asterisco = 10;
            while (asterisco >= global){
                System.out.print("*");
                asterisco = asterisco-1;
            }
            System.out.println(" ");
            global = global-1;
        }
    }
}
