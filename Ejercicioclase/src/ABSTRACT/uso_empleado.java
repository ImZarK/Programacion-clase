package ABSTRACT;

import javax.swing.*;

public class uso_empleado {
    public static void main(String[] args) {
    Empleado kevin = new EmpleadoTiempoParcial();
    Empleado pepe = new EmpleadoTiempoCompleto();

    JOptionPane.showMessageDialog(null,
            "El salario de kevin de este mes es: " + "\n" +
    kevin.calcularSalario());
    JOptionPane.showMessageDialog(null, "El salario de pepe de este mes es " + "\n" + pepe.calcularSalario());
    }
}
