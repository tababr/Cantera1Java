package com.sofka;

public class Figura3 {
    private Integer c, i;

    Integer f = 0;
    Integer j = 2;

    public void Figura3() {
        llenarFi();
    }

    private void llenarFi() {
        do {
            ramas();
            talloMedio();
            talloInferior();
        } while (f < 16);
    }

    private void ramas() {
        c = 0;
        if (f < 12) {
            do {
                c = c + 1;
                if ((c <= (20 / 2) - f + 1) || (c >= (20 / 2) + f + 1)) {
                    System.out.print(" ");
                }
                if ((c > (20 / 2) - f + 1) && (c < (20 / 2) + f + 1)) {
                    System.out.print("*");
                }
                if (c == 21) {
                    System.out.println(" ");
                }
            } while (c <= 21);
        }
    }

    private void talloMedio() {
        if (f == 12) {
            i = 2;
            do {
                c = c + 1;
                if ((c <= (20 / 2) - i + 1) || (c >= (20 / 2) + i + 1)) {
                    System.out.print(" ");
                }
                if ((c > (20 / 2) - i + 1) && (c < (20 / 2) + i + 1)) {
                    System.out.print("*");
                }
                if (c == 21) {
                    System.out.println(" ");

                }
            } while (c <= 21);
        }
    }

    private void talloInferior() {
        if (f > 12) {
            do {
                c = c + 1;
                if ((c <= (20 / 2) - j + 1) || (c >= (20 / 2) + j + 1)) {
                    System.out.print(" ");
                }
                if ((c > (20 / 2) - j + 1) && (c < (20 / 2) + j + 1)) {
                    System.out.print("*");
                }
                if (c == 21) {
                    System.out.println(" ");
                }
            } while (c <= 21);
            j = j + 1;
        }
        f = f + 1;
    }
}
