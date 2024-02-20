package Abstract;

abstract class FiguraGeometrica {
    //Crea una clase abstracta FiguraGeometrica que contenga un método abstracto calcularArea().
    //Luego, implementa subclases concretas como Rectangulo y Circulo que hereden de esta clase
    //y proporcionen implementaciones para calcular el área específica de cada figura.
    abstract double calcularArea();
}

    class Circulo extends FiguraGeometrica {
        private double radio;

        public Circulo(double radio) {
            this.radio = radio;
        }

        @Override
        double calcularArea() {
            return Math.PI * radio * radio;
        }

    }
     class Rectangulo extends FiguraGeometrica{
        private double anchura;
        private double altura;

         public Rectangulo(double anchura, double altura) {
             this.anchura = anchura;
             this.altura = altura;
         }

         @Override
        double calcularArea() {
            return anchura * altura;
        }
    }

