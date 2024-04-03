package Parte1.Ejercicio41;

class numeroMayor {
    static String numeros;
    static float mayor = 0;

    public numeroMayor(String numeros) {
        this.numeros = numeros;
    }

    public static float encontrarMayor() {
        String[] numerosLista = numeros.split(" ");

        for(int i = 0; i < numerosLista.length; i++){
            Float num = Float.parseFloat(numerosLista[i]);
            if (num < 0) {
                throw new ArithmeticException();
            }
            if (num > mayor) {
                mayor = num;
            }
        }
        return mayor;
    }
}
