package Parte2_figurasGeometricas;
/**
 * Esta clase define objetos de tipo Trapecio con una
 * base mayor, una base menor y una altura como atributos.
 */
public class Trapecio implements FiguraGeometrica {
    Float baseMayor; // Atributo que define la base mayor de un trapecio
    Float baseMenor; // Atributo que define la base menor de un trapecio
    Float altura; // Atributo que define la altura de un trapecio
    /**
     * Constructor de la clase Trapecio
     * @param baseMayor Parámetro que define la base mayor de un trapecio
     * @param baseMenor Parámetro que define la base menor de un trapecio
     * @param altura Parámetro que define la altura de un trapecio
     */
    public Trapecio(Float baseMayor, Float baseMenor, Float altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }
    /**
     * Método que calcula y devuelve el área de un trapecio como la
     * suma de las bases por la altura dividido entre 2
     * @return Área de un trapecio
     */
    @Override
    public double calcularArea() {
        return ((baseMayor + baseMenor) / 2) * altura;
    }
    /**
     * Método que calcula y devuelve el perímetro de un trapecio
     * como la suma de sus lados
     * @return Perímetro de un trapecio
     */
    @Override
    public double calcularPerimetro() {
        return baseMayor + baseMenor + (2 * Math.sqrt(Math.pow((baseMayor - baseMenor), 2) + Math.pow(altura, 2)));
    }
}
