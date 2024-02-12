package Herencia;

import javax.swing.*;

public class uso_automovil {
    public static void main(String[] args) {
    String marca = JOptionPane.showInputDialog("Introduce la marca del vehiculo");
    String modelo = JOptionPane.showInputDialog("Introduce el modelo del vehiculo");
    int anno = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año del vehiculo"));
    String tipoDeCombustible = JOptionPane.showInputDialog("Introduce el tipo de combustible del vehiculo");
    Automovil auto = new Automovil(marca, modelo, anno,tipoDeCombustible);

    JOptionPane.showMessageDialog(null, "Los atributos de tu vehiculo son: \n" +
                                                                 "Marca: " + auto.getMarca() +"\n" +
                                                                 "Modelo: " + auto.getModelo() + "\n" +
                                                                 "Año: " + auto.getAnno() + "\n" +
                                                                 "Tipo de combustible: " + auto.getTipoDeCombustible());
    }

}
