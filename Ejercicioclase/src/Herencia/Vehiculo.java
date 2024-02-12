package Herencia;

public class Vehiculo {
    //Ejercicio 1: Clase Base y Clase Derivada Básicas
    //1. Clase Vehículo y Clase Automóvil: Crea una clase base Vehículo que tenga atributos como
    //marca, modelo y año. Luego, crea una clase Automóvil que herede de Vehículo y añade un
    //atributo específico de Automóvil, como tipoDeCombustible. Implementa métodos en ambas
    //clases para establecer y obtener los valores de los atributos.

    private String marca;
    private String modelo;
    private int anno;

    public Vehiculo(String marca, String modelo, int anno) {
        this.marca = marca;
        this.modelo = modelo;
        this.anno = anno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }


}
