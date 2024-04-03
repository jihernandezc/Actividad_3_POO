package Parte1.Ejercicio22;

import Parte1.Ejercicio18.Empleado;
import Parte1.Entradas;

import javax.swing.*;

public class Ejercicio19 extends Empleado implements Entradas {
    public Ejercicio19(String codigo, String nombre, float horasTrabajadas, float valorHora, float porcentajeRetencion) {
        super(codigo, nombre, horasTrabajadas, valorHora, porcentajeRetencion);
    }

    public static void main(String[] args) {
        String nombre = Entradas.alfanumerica("Ingrese el nombre del empleado");
        float horasTrabajadas = Entradas.flotante("Ingrese las horas trabajadas por el empleado");
        float valorHora = Entradas.flotante("Ingrese el valor de la hora del empleado");

        Ejercicio19 empleado = new Ejercicio19(null, nombre, horasTrabajadas, valorHora, 0);

        if (empleado.SalarioBruto() > 450000) {
            JOptionPane.showMessageDialog(null, "Nombre: " + empleado.nombre + "\nSalario mensual: $" + empleado.SalarioBruto());
        } else {
            JOptionPane.showMessageDialog(null, "Nombre: " + empleado.nombre);
        }
    }
}
