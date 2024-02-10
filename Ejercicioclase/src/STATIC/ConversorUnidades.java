package STATIC;

import javax.swing.*;
import java.text.DecimalFormat;

public class ConversorUnidades {
        public static double kmAMillas(double kilometros) {
            return kilometros * 0.621371;
        }
        public static double millasAKm(double millas) {
            return millas / 0.621371;
        }
        public static double celsiusAFahrenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }
        public static double fahrenheitACelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }

    public static void main(String[] args) {
        double kmAMillas = Double.parseDouble(JOptionPane.showInputDialog("Introduce los kilometros"));
        double millasAKm = Double.parseDouble(JOptionPane.showInputDialog("Introduce las millas"));
        double celsiusAFahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Introduce la temperatura en Celsius"));
        double fahrenheitACelsius = Double.parseDouble(JOptionPane.showInputDialog("Introduce la temperatura en Fahrenheit"));


        JOptionPane.showMessageDialog(null, "Este es el resultado de tus conversiones: \n" +
                "KM > Millas = " + ConversorUnidades.kmAMillas(kmAMillas) + "\n" +
                "Millas > Km = " + ConversorUnidades.millasAKm(millasAKm)+ "\n" +
                "Cº > Fª = " + ConversorUnidades.celsiusAFahrenheit(celsiusAFahrenheit) +"\n"+
                "Fª > Cª = " + ConversorUnidades.fahrenheitACelsius(fahrenheitACelsius));


    }
}
