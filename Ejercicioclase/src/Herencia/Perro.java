package Herencia;

public class Perro extends Animal {

    //3. Clase Animal y Clase Perro: Diseña una clase Animal con un método emitirSonido que
    //simplemente imprima "Este animal hace un sonido". Luego, crea una clase Perro que herede
    //de Animal y sobrescribe el método emitirSonido para que imprima "El perro ladra".
    @Override
    public void emitirElSonido() {
        System.out.println("*ladra epicamente*");
    }
}
