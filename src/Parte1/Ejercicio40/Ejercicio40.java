package Parte1.Ejercicio40;

import Parte1.Entradas;

import javax.swing.*;

public class Ejercicio40 extends operaciones implements Entradas {
    public Ejercicio40(String numeros) {
        super(numeros);
    }

    public static void main(String[] args) {

        boolean start = true;

        while (start) {
            try {
                String numeros = Entradas.alfanumerica("Ingrese los números separados por un espacio. \nRecuerde que deben ser positivos.");
                Ejercicio40 operaciones = new Ejercicio40(numeros);
                operaciones.ejecutarOperaciones();
                start = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor, revise la entrada.");
            }
        }
    }
}
