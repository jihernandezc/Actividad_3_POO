package Parte1.Ejercicio18;

public class Empleado {
    String codigo;
    protected String nombre;
    float horasTrabajadas, valorHora, porcentajeRetencion;

    public Empleado(String codigo, String nombre, float horasTrabajadas, float valorHora, float porcentajeRetencion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.porcentajeRetencion = porcentajeRetencion;
    }

    protected float SalarioBruto() {
        return horasTrabajadas * valorHora;
    }

    float SalarioNeto() {
        float salarioBruto = SalarioBruto();
        return salarioBruto - (salarioBruto * porcentajeRetencion / 100);
    }
}
