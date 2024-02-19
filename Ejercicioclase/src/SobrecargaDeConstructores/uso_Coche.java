package SobrecargaDeConstructores;

public class uso_Coche {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Niisan","GT-R R34","Azul",1999);
        Coche coche2 = new Coche("Mustang","GT 500","Verde");
        Coche coche3 = new Coche("Porshe","911 GT3");

        System.out.println("\nCoche 1: ");
        System.out.println("Marca: " + coche1.getMarca());
        System.out.println("Modelo: "+ coche1.getModelo());
        System.out.println("Color: " + coche1.getColor());
        System.out.println("Año: " + coche1.getAnno());

        System.out.println("\nCoche 2: ");
        System.out.println("Marca: " + coche2.getMarca());
        System.out.println("Modelo: "+ coche2.getModelo());
        System.out.println("Color: " + coche2.getColor());
        System.out.println("Año: " + coche2.getAnno());

        System.out.println("\nCoche 3: ");
        System.out.println("Marca: " + coche3.getMarca());
        System.out.println("Modelo: "+ coche3.getModelo());
        System.out.println("Color: " + coche3.getColor());
        System.out.println("Año: " + coche3.getAnno());
    }
}
