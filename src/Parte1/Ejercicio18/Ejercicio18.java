package Parte1.Ejercicio18;

import Parte1.Entradas;

import javax.swing.*;

public class Ejercicio18 extends Empleado implements Entradas {
    public Ejercicio18(String codigo, String nombre, float horasTrabajadas, float valorHora, float porcentajeRetencion) {
        super(codigo, nombre, horasTrabajadas, valorHora, porcentajeRetencion);
    }

    public static void main(String[] args) {
        String codigo = Entradas.alfanumerica("Ingrese el codigo del empleado");
        String nombre = Entradas.alfanumerica("Ingrese el nombre del empleado");
        float horasTrabajadas = Entradas.enteroPositivo("Ingrese las horas trabajadas por el empleado #" + codigo);
        float valorHora = Entradas.enteroPositivo("Ingrese el valor de la hora trabajada por el empleado #" + codigo);
        float porcentajeRetencion = Entradas.enteroPositivo("Ingrese el porcentaje de retencion del empleado #" + codigo + "\nEjemplo: Si el porcentaje es del 10%, ingrese 10");

        Empleado empleado = new Empleado(codigo, nombre, horasTrabajadas, valorHora, porcentajeRetencion);

        JOptionPane.showMessageDialog(null, "El empleado #" + empleado.codigo + " " + empleado.nombre + " tiene:" + "\nSalario bruto: $" + empleado.SalarioBruto() + "\nSalario neto: $" + empleado.SalarioNeto());
    }

}
