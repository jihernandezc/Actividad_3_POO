package Parte1.Ejercicio40;

import javax.swing.*;

class operaciones {
    static String numeros;

    public operaciones(String numeros) {
        this.numeros = numeros;
    }

    public void ejecutarOperaciones() {
        String[] numerosLista = numeros.split(" ");

        Float[] raices = new Float[numerosLista.length];
        Float[] cuadrados = new Float[numerosLista.length];
        Float[] cubos = new Float[numerosLista.length];

        for(int i = 0; i < numerosLista.length; i++){
            Float num = Float.parseFloat(numerosLista[i]);

            float raiz = (float) Math.sqrt(num);
            raices[i] = raiz;
            float cuadrado = (float) Math.pow(num, 2);
            cuadrados[i] = cuadrado;
            float cubo = (float) Math.pow(num, 3);
            cubos[i] = cubo;
        }

        for(int i = 0; i < numerosLista.length; i++){
            JOptionPane.showMessageDialog(null, "Para el número " + numerosLista[i] + ":\n" +
                    "Raíz cuadrada: " + raices[i] + "\n" +
                    "Cuadrado: " + cuadrados[i] + "\n" +
                    "Cubo: " + cubos[i] + "\n");
        }
    }
}

