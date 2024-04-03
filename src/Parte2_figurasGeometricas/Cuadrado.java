package Parte2_figurasGeometricas;

/**
 * Esta clase define objetos de tipo Cuadrado con un lado como atributo.
 * @version 1.2/2020
 */
public class Cuadrado implements FiguraGeometrica {
    Float lado; // Atributo que define el lado de un cuadrado

    /**
     * Constructor de la clase Cuadrado
     * @param lado Parámetro que define la longitud de la base de un cuadrado
     */
    public Cuadrado(Float lado) {
        this.lado = lado;
    }

    /**
     * Método que calcula y devuelve el área de un cuadrado como el
     * lado elevado al cuadrado
     * @return Área de un Cuadrado
     */
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    /**
     * Método que calcula y devuelve el perímetro de un cuadrado como
     * cuatro veces su lado
     * @return Perímetro de un cuadrado
     */
    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
