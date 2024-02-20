package Abstract;

public class uso_animal {
    public static void main(String[] args) {
        Animal firulais = new Perro();
        Animal michi = new Gato();

        System.out.println(firulais.hacerSonido());
        System.out.println(firulais.moverse());
    }
}
