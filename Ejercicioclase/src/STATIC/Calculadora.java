package STATIC;

public class Calculadora {
   //Ejercicio 2: Calculadora Simple
    // Objetivo: Implementar una calculadora simple con métodos estáticos.
    // Descripción:- Crea una clase llamada Calculadora.- Añade métodos estáticos para operaciones básicas: suma, resta, multiplicación y división.
    // Cada método debe tomar dos parámetros numéricos y devolver el resultado.- Prueba estos métodos en el método main.
   private static double suma;
   private static double resta;
   private static double multiplicacion;
   private static double division;

    public Calculadora() {
        this.suma = suma;
        this.resta = resta;
        this.multiplicacion = multiplicacion;
        this.division = division;

    }
    public static double sumar(double numero1, double numero2){
        return numero1 + numero2;
    }
    public static double restar(double numero1, double numero2){
        return numero1 - numero2;
    }
    public static double multiplicar(double numero1, double numero2){
        return numero1 * numero2;
    }
    public static double dividir(double numero1, double numero2){
        return numero1 / numero2;
    }

    public static void main(String[] args) {



        System.out.println(Calculadora.sumar(2,2));
        System.out.println(Calculadora.restar(10,5));
        System.out.println(Calculadora.multiplicar(5,5));
        System.out.println(Calculadora.dividir(100,10));

    }
}
