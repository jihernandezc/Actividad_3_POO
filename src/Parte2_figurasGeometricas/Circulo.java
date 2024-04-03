package Parte2_figurasGeometricas;
/**
 * Esta clase define objetos de tipo Círculo con su radio como atributo.
 * @version 1.2/2020
 */
public class Circulo implements FiguraGeometrica {
    Float radio; // Atributo que define el radio de un círculo
    /**
     * Constructor de la clase Círculo
     * @param radio Parámetro que define el radio de un círculo
     */
    public Circulo(Float radio) {
        this.radio = radio;
    }
    /**
     * Método que calcula y devuelve el área de un círculo como pi
     * multiplicado por el radio al cuadrado
     * @return Área de un círculo
     */
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    /**
     * Método que calcula y devuelve el perímetro de un círculo como la
     * multiplicación de pi por el radio por 2
     * @return Perímetro de un círculo
     */
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
