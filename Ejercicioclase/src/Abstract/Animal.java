package Abstract;

abstract class Animal {
    //Crea una clase abstracta Animal con métodos abstractos como hacerSonido() y moverse().
    //Luego, implementa subclases concretas como Perro y Gato que hereden de esta clase y
    //proporcionen implementaciones específicas para los sonidos y movimientos de cada animal
    abstract String hacerSonido();

    abstract String moverse();
}
class Perro extends Animal {


    @Override
    String hacerSonido() {
        return "*hace literalmente un sonido de perro porque obviamente es un perro pero si en verdad lo vez desde un punto filosofico te das cuenta que gay el que lo lea"
                ;
    }

    @Override
    String moverse() {
        return "*el perro se mueve*";
    }
}
    class Gato extends Animal {
        @Override
        String hacerSonido() {
            return "*miau*";
        }

        @Override
        String moverse() {
            return "*se mueve por una cornisa";
        }
    }

