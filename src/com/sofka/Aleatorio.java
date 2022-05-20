package com.sofka;

import java.util.Random;

public class Aleatorio {
    Integer i;
    private Integer[] numero = new Integer[20];
    Random r = new Random();

    public void Aleatorio(){
        generarAleatorio();
        numerosPares(numero);
        numerosImpares(numero);
    }

    private void generarAleatorio(){
        System.out.println("Números aleatorios de 1-100: ");
        for (i=0; i < numero.length; i++){
            numero[i] = r.nextInt(100)+1;
            System.out.print(numero[i]+",");
        }
    }

    private void numerosPares(Integer[] numero){
        System.out.println("\n");
        System.out.println("Números pares: ");
        for (i=0; i < numero.length; i++){
            if (numero[i]% 2 == 0){
                System.out.print(numero[i]+",");
            }
        }
    }

    private void numerosImpares(Integer[] numero){
        System.out.println("\n");
        System.out.println("Números impares: ");
        for (i=0; i < numero.length; i++){
            if (numero[i]% 2 == 1){
                System.out.print(numero[i]+",");
            }
        }
    }
}
