package Parte2_figurasGeometricas;

import Parte1.Entradas;

import javax.swing.*;

import static java.util.function.Predicate.not;

/**
 * Esta clase prueba diferentes acciones realizadas en diversas figuras geométricas.
 * @version 1.2/2020
 */
public class PruebaFiguras implements Entradas {
    /**
     * Método main que crea un círculo, un rectángulo, un cuadrado,
     * un triángulo rectángulo, un rombo y un trapecio. Para cada una de estas figuras geométricas,
     * se calcula su área y perímetro.
     */
    public static void main(String args[]) {
        String figura;
        boolean start = true;

        while (start) {
            figura = Entradas.alfanumerica("Ingrese la figura geométrica que desea calcular.\n(circulo, rectangulo, cuadrado, triangulo rectangulo, rombo, trapecio): ");
            switch (figura) {
                case "circulo":
                    Float radio = Entradas.flotantePositivo("Ingrese el radio del círculo: ");
                    FiguraGeometrica figura1 = new Circulo(radio);
                    JOptionPane.showMessageDialog(null, "El área del círculo es = " + figura1.calcularArea() + "\nEl perímetro del círculo es = " + figura1.calcularPerimetro());
                    break;
                case "rectangulo":
                    Float baseRectangulo = Entradas.flotantePositivo("Ingrese la base del rectángulo: ");
                    Float alturaRectangulo = Entradas.flotantePositivo("Ingrese la altura del rectángulo: ");
                    FiguraGeometrica figura2 = new Rectangulo(baseRectangulo, alturaRectangulo);
                    JOptionPane.showMessageDialog(null, "El área del rectángulo es = " + figura2.calcularArea() + "\nEl perímetro del rectángulo es = " + figura2.calcularPerimetro());
                    break;
                case "cuadrado":
                    Float lado = Entradas.flotantePositivo("Ingrese el lado del cuadrado: ");
                    FiguraGeometrica figura3 = new Cuadrado(lado);
                    JOptionPane.showMessageDialog(null, "El área del cuadrado es = " + figura3.calcularArea() + "\nEl perímetro del cuadrado es = " + figura3.calcularPerimetro());
                    break;
                case "triangulo rectangulo":
                    Float baseTriangulo = Entradas.flotantePositivo("Ingrese la base del triángulo rectángulo: ");
                    Float alturaTriangulo = Entradas.flotantePositivo("Ingrese la altura del triángulo rectángulo: ");
                    FiguraGeometrica figura4 = new TrianguloRectangulo(baseTriangulo, alturaTriangulo);
                    JOptionPane.showMessageDialog(null, "El área del triángulo es = " + figura4.calcularArea() + "\nEl perímetro del triángulo es = " + figura4.calcularPerimetro());
                    break;
                case "rombo":
                    Float diagonalMayor = Entradas.flotantePositivo("Ingrese la diagonal mayor del rombo: ");
                    Float diagonalMenor = Entradas.flotantePositivo("Ingrese la diagonal menor del rombo: ");
                    FiguraGeometrica figura5 = new Rombo(diagonalMayor, diagonalMenor);
                    JOptionPane.showMessageDialog(null, "El área del rombo es = " + figura5.calcularArea() + "\nEl perímetro del rombo es = " + figura5.calcularPerimetro());
                    break;
                case "trapecio":
                    Float baseMayor = Entradas.flotantePositivo("Ingrese la base mayor del trapecio: ");
                    Float baseMenor = Entradas.flotantePositivo("Ingrese la base menor del trapecio: ");
                    Float alturaTrapecio = Entradas.flotantePositivo("Ingrese la altura del trapecio: ");
                    FiguraGeometrica figura6 = new Trapecio(baseMayor, baseMenor, alturaTrapecio);
                    JOptionPane.showMessageDialog(null, "El área del trapecio es = " + figura6.calcularArea() + "\nEl perímetro del trapecio es = " + figura6.calcularPerimetro());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Por favor, revise la entrada.");
                    break;
            }
            String continuar = Entradas.alfanumerica("¿Desea continuar? \n(Ingrese cualquier caracter o enter para 'si', o 'no' para salir.): ");
            if (continuar.equals("no")) {
                start = false;
            }
        }
    }
}