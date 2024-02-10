package STATIC;

public class Instancias {
    //Ejercicio 1: Contador de Instancias
    // Objetivo: Crear una clase que cuente cuántas instancias de esa clase han sido creadas.
    // Descripción:- Crea una clase llamada ContadorInstancias.- Añade una variable estática que mantenga el recuento de
    // las instancias creadas.- Añade un constructor que incremente esta variable cada vez que se cree una nueva
    // instancia.- Añade un método estático que devuelva el número actual de instancias.

    private static int ContadorDeInstancias = 0;

    public Instancias() {
        ContadorDeInstancias++;
    }
    public static int obtenerNumeroDeInstancias() {
        return ContadorDeInstancias;


    }

    public static void main(String[] args) {
        Instancias instancia1 = new Instancias();
        Instancias instancia2 = new Instancias();
        Instancias instancia3 = new Instancias();
        Instancias instancia4 = new Instancias();
        Instancias instancia5 = new Instancias();

        System.out.println(Instancias.obtenerNumeroDeInstancias());

    }
}
