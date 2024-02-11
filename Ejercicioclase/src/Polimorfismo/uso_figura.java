package Polimorfismo;

public class uso_figura {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(5,2);

        Figura[] figuras = {circulo,rectangulo};

        for (Figura figura : figuras) {
            System.out.println("Area: " + figura.calcularArea());
        }
    }
}
