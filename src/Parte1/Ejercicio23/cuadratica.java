package Parte1.Ejercicio23;

import javax.swing.*;

class cuadratica {
    float a, b, c, x1, x2;

    cuadratica(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    String signo(float numero) {
        return numero < 0 ? "" : "+";
    }

    void resolverEcuacion() {
        float discriminante = (float) Math.pow(b, 2) - 4 * a * c;
        if (discriminante < 0) {
            JOptionPane.showMessageDialog(null,"La ecuación no tiene solución en los números reales");
        } else {
            x1 = (-b + (float) Math.sqrt(discriminante)) / (2 * a);
            x2 = (-b - (float) Math.sqrt(discriminante)) / (2 * a);
            JOptionPane.showMessageDialog(null,"Posibles soluciones a la ecuación " + a + "x²" + signo(b) + b + "x" + signo(c) + c + "\nx1 = " + x1 + "\nx2 = " + x2);
        }
    }
}
