package SobrecargaDeConstructores;

public class Coche {
    //4. Define una clase Coche con constructores sobrecargados para establecer propiedades como
    // la marca, el modelo, el año y el color. Luego, en el código principal, instancia objetos de esta
    // clase utilizando diversas combinaciones de parámetros en los constructores para representar
    // coches con diferentes características visuales y técnicas.

    private String marca;
    private int anno;
    private String modelo;
    private String color;

    public int getAnno() {
        return anno;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public Coche(String marca, String modelo, String color, int anno) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anno = anno;
    }
    public Coche(String marca) {
        this.marca = marca;
        this.modelo = "";
        this.color = "";
        this.anno = 0;
    }
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = "";
        this.anno = 0;
    }
    public Coche(String marca, String modelo,String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anno = 0;
    }
}
