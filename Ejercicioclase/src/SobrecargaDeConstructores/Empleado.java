package SobrecargaDeConstructores;

public class Empleado {
    // 1. Implementa una clase llamada Empleado con constructores sobrecargados que permitan
    // inicializar el nombre, el salario y el departamento del empleado. Luego, en el programa
    // principal, crea instancias de esta clase utilizando diferentes combinaciones de parámetros en
    // los constructores para representar empleados con distintas características.
    private String nombre;
    private double salario;
    private String departamento;

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }
    public Empleado(String nombre, double salario, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }
    //sobrecarga del metodo empleado que solo imprime el nombre y lo demas 0 y null
    public Empleado(String nombre) {
        this.nombre = nombre;
        this.salario = 0;
        this.departamento = "";
    }
    //otra sobrecarga del metodo empleado que solo imprime el nombre y el salario el departamento quedaria en null
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = "";
    }
}
