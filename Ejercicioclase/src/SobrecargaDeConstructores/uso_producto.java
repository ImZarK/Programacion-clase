package SobrecargaDeConstructores;

import java.sql.SQLOutput;

public class uso_producto {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Tarjeta Grafica Nvidia RTX 4090 ASUS",1800,17);
        Producto producto2 = new Producto("CPU Intel i9 15900k");
        Producto producto3 = new Producto("Monitor AOC 24G2W1G4 165Hz", 250);

        System.out.println("Producto 1 ");
        System.out.println("Nombre: " + producto1.getNombre());
        System.out.println("Precio: " + producto1.getPrecio());
        System.out.println("Stock: " + producto1.getStock());

        System.out.println("\nProducto 2 ");
        System.out.println("Nombre: " + producto2.getNombre());
        System.out.println("Precio: " + producto2.getPrecio());
        System.out.println("Stock: " + producto2.getStock());

        System.out.println("\nProducto 1 ");
        System.out.println("Nombre: " + producto3.getNombre());
        System.out.println("Precio: " + producto3.getPrecio());
        System.out.println("Stock: " + producto3.getStock());
    }
}
