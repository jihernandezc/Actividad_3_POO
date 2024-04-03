package Parte1.Ejercicio19;

class trianguloEquilatero {
    float lado;

    public trianguloEquilatero(float lado) {
        this.lado = lado;
    }

    float perimetro() {
        return lado * 3;
    }

    float altura() {
        return (float) (Math.sqrt(3) * lado / 2);
    }

    float area() {
        return (float) (Math.sqrt(3) / 4 * Math.pow(lado, 2));
    }
}
