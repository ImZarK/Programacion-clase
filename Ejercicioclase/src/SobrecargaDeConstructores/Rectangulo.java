package SobrecargaDeConstructores;

public class Rectangulo {
    // 2. Crea una clase Rectángulo con constructores sobrecargados para definir su ancho y altura.
    // Posteriormente, en el código principal, instanciar objetos de esta clase utilizando distintas
    // combinaciones de parámetros en los constructores para representar rectángulos con diferentes
    // dimensiones.

    private double anchura;
    private double altura;

    public double getAnchura() {
        return anchura;
    }

    public double getAltura() {
        return altura;
    }

    public Rectangulo(double anchura, double altura) {
        this.anchura = anchura;
        this.altura = altura;
    }
    public Rectangulo(double anchura) {
        this.anchura = anchura;
        this.altura = 0;
    }
    public Rectangulo() {
        this.anchura = 0;
        this.altura = 0;
    }


}
