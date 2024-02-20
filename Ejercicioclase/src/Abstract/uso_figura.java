package Abstract;

public class uso_figura {
    public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo(5);
        FiguraGeometrica rectangulo = new Rectangulo(10,5);

        FiguraGeometrica[] figuras = {circulo,rectangulo};

        for (FiguraGeometrica figura : figuras) {
            System.out.println("Radio: " + figura.calcularArea());
        }
    }
}
