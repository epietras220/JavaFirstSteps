package com.github.epietras220.arithmetic;

public class Arithmetic {
    public double square(double a, double n) { //zad 4.2

        // System.out.println(Math.pow(2018,1.0/2018)); - a w ten sposób po prostu może być?

        double result = a;
        double tmp = Math.pow(result, (n - 1));
        double e = 0.000000001;

        while (Math.abs(a - tmp * result) >= e) {
            result = 1 / n * ((n - 1) * result + (a / tmp));
            tmp = Math.pow(result, n - 1);
        }
        return result;
    }

    public double inequality(double n) { // zad 4.1 - źle zrobione!
        double suma = 1;
        for (double i = 2; i <= 100000; i++) {
            if (suma <= 10.0) {
                suma = suma + (1 / i);
            }

        }
        return suma;
    }
}