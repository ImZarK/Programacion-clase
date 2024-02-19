package SobrecargaDeConstructores;

public class uso_rectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(18,25);
        Rectangulo rectangulo2 = new Rectangulo(15);
        Rectangulo rectangulo3 = new Rectangulo();

        System.out.println("\n"+"Rectangulo 1: ");
        System.out.println("Anchura: " + rectangulo1.getAnchura());
        System.out.println("Altura: " + rectangulo1.getAltura());

        System.out.println("\n"+"Rectangulo 2: ");
        System.out.println("Anchura: " + rectangulo2.getAnchura());
        System.out.println("Altura: " + rectangulo2.getAltura());

        System.out.println("\n"+"Rectangulo 3: ");
        System.out.println("Anchura: " + rectangulo3.getAnchura());
        System.out.println("Altura: " + rectangulo3.getAltura());


    }
}
