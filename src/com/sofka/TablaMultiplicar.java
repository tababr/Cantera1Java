package com.sofka;

import java.util.Scanner;

public class TablaMultiplicar {
    private Integer dato;
    private Integer resultado;
    private Integer i;

    Scanner input = new Scanner(System.in);

    public void TablaMultiplicar(){
        multiplicar();
    }

    private void multiplicar(){
        System.out.println("Ingrese el digito de la tabla de multiplicar que quiere crear: ");
        dato = input.nextInt();

        for(i = 1; i <= 10; i++){
            resultado = i*dato;
            System.out.println(dato+" x "+i+" = "+resultado);
        }
    }
}
