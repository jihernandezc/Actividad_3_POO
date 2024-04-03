package Parte1.Ejercicio7;
class compararNumeros {
    float a, b;

    public compararNumeros(float a , float b){
        this.a = a;
        this.b = b;
    }

    String compararNumeros() {
        if (a > b) {
            return "El número " + a + " es mayor que " + b;
        } else if (a < b) {
            return "El número " + a + " es menor que " + b;
        } else {
            return "Los números son iguales";
        }
    }
}
