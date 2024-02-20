package ABSTRACT;

abstract class Empleado {
   // Crea una clase abstracta Empleado con métodos abstractos como calcularSalario(). Luego,
    // implementa subclases concretas como EmpleadoTiempoCompleto y EmpleadoTiempoParcial
    // que hereden de esta clase y proporcionen implementaciones específicas para calcular el
    // salario de cada tipo de empleado.
    abstract double calcularSalario();

}
class EmpleadoTiempoCompleto extends Empleado {
private final double precioPorHoras = 7.88;
    private final int horasTrabajadas = 160;

    @Override
    double calcularSalario() {
        return precioPorHoras * horasTrabajadas;
    }
}
class EmpleadoTiempoParcial extends Empleado {
    private final double precioPorHoras = 6.54;
    private final int horasTrabajadas = 80;

    @Override
    double calcularSalario() {
        return precioPorHoras * horasTrabajadas;
    }
}