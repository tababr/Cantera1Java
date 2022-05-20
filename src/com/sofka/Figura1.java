package com.sofka;

public class Figura1 {
    private Integer inicio;
    private Integer asterisco;

    public void Figura1(){
        llenarFi();
    }

    private void llenarFi(){
        for (inicio = 1; inicio <= 10; inicio++){
            for (asterisco = 1; asterisco <= inicio; asterisco++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
