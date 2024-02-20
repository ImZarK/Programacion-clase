package SobrecargaDeConstructores;

public class Producto {
    // 3. Desarrolla una clase Producto que tenga constructores sobrecargados para inicializar su
    // nombre, precio y cantidad en stock. A continuación, en el programa principal, crea objetos de
    // esta clase utilizando diferentes variantes de los constructores para representar productos con
    // distintas características y cantidades disponibles.

    private String nombre;
    private double precio;

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto(String nombre) {
        this.nombre = nombre;
        this.precio = 0.0;
        this.stock = 0;


    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = 0;
    }
}