package Parte1.Ejercicio23;

import Parte1.Entradas;

public class Ejercicio23 extends cuadratica implements Entradas {
    public Ejercicio23(float a, float b, float c) {
        super(a, b, c);
    }

    public static void main(String[] args) {
        float a = Entradas.flotante("Ingrese el valor de a");
        float b = Entradas.flotante("Ingrese el valor de b");
        float c = Entradas.flotante("Ingrese el valor de c");

        Ejercicio23 ecuacion = new Ejercicio23(a, b, c);
        ecuacion.resolverEcuacion();
    }
}
