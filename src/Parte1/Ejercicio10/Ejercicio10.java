package Parte1.Ejercicio10;

import Parte1.Entradas;

import javax.swing.*;

public class Ejercicio10 extends Estudiante implements Entradas {
    public Ejercicio10(String nInscripcion, String nombre, int estrato, float patrimonio) {
        super(nInscripcion, nombre, estrato, patrimonio);
    }

    public static void main(String[] args) {
        String nInscripcion = Entradas.alfanumerica("Ingrese el número de inscripción:");
        String nombre = Entradas.alfanumerica("Ingrese el nombre del estudiante");
        int estrato = Entradas.enteroPositivo("Ingrese el estrato del estudiante");
        float patrimonio = Entradas.enteroPositivo("Ingrese el patrimonio del estudiante");

        Estudiante estudiante = new Estudiante(nInscripcion, nombre, estrato, patrimonio);

        JOptionPane.showMessageDialog(null, "Número de inscripción: " + estudiante.nInscripcion + "\nNombre: " + estudiante.nombre + "\nMatrícula a pagar: $" + estudiante.calcularMatricula());
    }
}
