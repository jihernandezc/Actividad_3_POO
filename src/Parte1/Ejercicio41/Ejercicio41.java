package Parte1.Ejercicio41;

import Parte1.Entradas;

import javax.swing.*;

public class Ejercicio41 extends numeroMayor implements Entradas {
    public Ejercicio41(String numeros) {
        super(numeros);
    }

    public static void main(String[] args) {

        boolean start = true;

        while (start) {
            try {
                String numeros = Entradas.alfanumerica("Ingrese los números separados por un espacio. \nRecuerde que deben ser positivos.");
                Ejercicio41 operaciones = new Ejercicio41(numeros);
                numeroMayor.encontrarMayor();
                JOptionPane.showMessageDialog(null, "El número mayor es: " + numeroMayor.mayor);
                start = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor, revise la entrada.");
            }
        }
    }
}
