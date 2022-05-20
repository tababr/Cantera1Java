package com.sofka;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Imc {
    private Double peso, altura, resultado;

    Double bajoPeso = 18.5;
    Double normal = 24.9;
    Double sobrePeso = 29.9;
    Double obeso = 30.0;

    public void Imc() {
        calculoImc();
    }

    private void calculoImc() {
        DecimalFormat decimal = new DecimalFormat("#.000");

        System.out.println("Bienvenido al IMC de la secretaría de salud");
        System.out.println("Ingresa tu peso: ");
        peso = num();
        System.out.println("Ingresa tu altura en metros (Ej: 1,80) : ");
        altura = num();
        resultado = (peso / (Math.pow(altura, 2)));
        System.out.println("Su indice de masa corporal es: " + decimal.format(resultado));
        validacionImc(resultado);
    }

    private void validacionImc(Double resultado) {
        if (resultado < bajoPeso) {
            System.out.println("Esta bajo de peso");
        } else {
            if (resultado > bajoPeso && resultado < normal) {
                System.out.println("Tu peso es normal");
            } else {
                if (resultado > normal && resultado < sobrePeso) {
                    System.out.println("Tienes sobrepeso");
                } else {
                    System.out.println("Tienes obesidad");
                }
            }
        }
    }

    private static Double num() {
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
}
