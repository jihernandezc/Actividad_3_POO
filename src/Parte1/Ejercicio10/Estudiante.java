package Parte1.Ejercicio10;

import Parte1.Entradas;

class Estudiante implements Entradas {
    int estrato;
    String nInscripcion, nombre;
    float patrimonio, matricula = 50000;

    public Estudiante(String nInscripcion, String nombre, int estrato, float patrimonio) {
        this.nInscripcion = nInscripcion;
        this.nombre = nombre;
        this.estrato = estrato;
        this.patrimonio = patrimonio;
    }

    float calcularMatricula() {
        if (patrimonio > 2000000 && estrato > 3) {
            return matricula + (patrimonio * 0.03f);
        }
        else return matricula;
    }
}
