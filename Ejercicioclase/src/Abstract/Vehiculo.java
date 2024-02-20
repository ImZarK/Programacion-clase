package Abstract;

abstract class Vehiculo {
    //Diseña una clase abstracta Vehiculo con métodos abstractos como acelerar() y frenar().
    //Implementa subclases concretas como Automovil y Motocicleta que hereden de esta clase y
    //proporcionen implementaciones específicas de aceleración y frenado para cada tipo de
    //vehículo.

     abstract String frenar();
     abstract String acelerar();
}
class Automovil extends Vehiculo {


    @Override
    String frenar() {
        return "frenao en seco";
    }

    @Override
    String acelerar() {
        return "Aceleracion de 0 a 60 en 2 segundos";
    }
}
    class Motocicleta extends Vehiculo {

        @Override
        String frenar() {
            return "frenao en seco";
        }

        @Override
        String acelerar() {
            return "Aceleracion de 0 a 47 en 4 segundos";
        }
    }


