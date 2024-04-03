package Parte1.Ejercicio7;

import Parte1.Entradas;

import javax.swing.*;

public class Ejercicio7 extends compararNumeros implements Entradas {
    public Ejercicio7(float a, float b) {
        super(a, b);
    }

    public static void main(String[] args) {
        float a = Entradas.flotante("Ingrese el primer número");
        float b = Entradas.flotante("Ingrese el segundo número");

        compararNumeros comparar = new compararNumeros(a, b);

        JOptionPane.showMessageDialog(null, comparar.compararNumeros());
    }
}
