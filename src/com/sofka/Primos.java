package com.sofka;

public class Primos {
    Integer i;

    public void Primos() {
        numerosPrimos();
    }

    private void numerosPrimos() {
        for (i = 0; i <= 999; i++) {
            Integer x = 1;
            Integer cont = 0;

            while (x <= i) {
                if (i % x == 0) {
                    cont = cont + 1;
                }
                x = x + 1;
            }
            if (cont == 2) {
                System.out.println(i + " es primo");
            }
        }
    }
}
