package Polimorfismo;

import com.sun.tools.javac.Main;

abstract class Figura {
    abstract double calcularArea();
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo extends Figura {
    private double altura;
    private double base;

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    double calcularArea() {
        return base * altura;
    }


   }



