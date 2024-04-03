package Parte1.Ejercicio19;

import Parte1.Entradas;

import javax.swing.*;

public class Ejercicio19 extends trianguloEquilatero implements Entradas {
    public Ejercicio19(float lado) {
        super(lado);
    }

    public static void main(String[] args) {
        float lado = Entradas.enteroPositivo("Ingrese el lado del triángulo equilátero");
        trianguloEquilatero triangulo = new trianguloEquilatero(lado);

        JOptionPane.showMessageDialog(null, "El triángulo equilátero de lado " + triangulo.lado + " tiene:" + "\nPerimetro: " + triangulo.perimetro() + "\nAltura: " + triangulo.altura() + "\nÁrea: " + triangulo.area());
    }
}
