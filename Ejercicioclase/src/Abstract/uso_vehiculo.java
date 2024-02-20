package Abstract;

import javax.swing.*;

public class uso_vehiculo {
    public static void main(String[] args) {
        Vehiculo carro = new Automovil();
        Vehiculo moto = new Motocicleta();

        ;


        int escogerVehiculo = Integer.parseInt(JOptionPane.showInputDialog("Elige 1 para Automovil y 2 para Motocicleta"));
        if (escogerVehiculo == 1) {
            int acelerar = Integer.parseInt(JOptionPane.showInputDialog("Introduce 3 para acelerar y 4 para frenar"));
            if (acelerar == 3) {
                System.out.println(carro.acelerar());
            } else if (acelerar == 4) {
                System.out.println(carro.frenar());
            }

        }else if (escogerVehiculo == 2) {
                int acelerar = Integer.parseInt(JOptionPane.showInputDialog("Introduce 3 para alcererar y 4 para frenar"));

             if (acelerar == 3) {
                System.out.println(moto.acelerar());
            } else if (acelerar == 4) {
                System.out.println(moto.frenar());

            }

        }


        }


        }





















