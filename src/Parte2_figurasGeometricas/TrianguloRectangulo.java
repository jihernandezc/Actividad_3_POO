package Parte2_figurasGeometricas;


/**
 * Esta clase define objetos de tipo Triángulo Rectángulo con una
 * base y una altura como atributos.
 * @version 1.2/2020
 */
public class TrianguloRectangulo implements FiguraGeometrica {
    Float base; // Atributo que define la base de un triángulo rectángulo
    Float altura; // Atributo que define la altura de un triángulo rectángulo

    /**
     * Constructor de la clase TriánguloRectángulo
     * @param base Parámetro que define la base de un triángulo rectángulo
     * @param altura Parámetro que define la altura de un triángulo rectángulo
     */
    public TrianguloRectangulo(Float base, Float altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método que calcula y devuelve el área de un triángulo rectángulo
     * como la base multiplicada por la altura sobre 2
     * @return Área de un triángulo rectángulo
     */
    @Override
    public double calcularArea() {
        return (base * altura / 2);
    }

    /**
     * Método que calcula y devuelve el perímetro de un triángulo rectángulo
     * como la suma de la base, la altura y la hipotenusa
     * @return Perímetro de un triángulo rectángulo
     */
    @Override
    public double calcularPerimetro() {
        return (base + altura + calcularHipotenusa()); /* Invoca al método calcular hipotenusa */
    }

    /**
     * Método que calcula y devuelve la hipotenusa de un triángulo rectángulo
     * utilizando el teorema de Pitágoras
     * @return Hipotenusa de un triángulo rectángulo
     */
    double calcularHipotenusa() {
        return Math.pow(base * base + altura * altura, 0.5);
    }

    /**
     * Método que determina si un triángulo es:
     * - Equilatero: si sus tres lados son iguales
     * - Escaleno: si sus tres lados son todos diferentes
     * - Isósceles: si dos de sus lados son iguales y el otro es diferente de
     * los demás
     */
    void determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
            System.out.println("Es un triángulo equilátero"); /* Todos sus lados son iguales */
        else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
            System.out.println("Es un triángulo escaleno"); /* Todos sus lados son diferentes */
        else
            System.out.println("Es un triángulo isósceles"); /* De otra manera, es isósceles */
    }
}
