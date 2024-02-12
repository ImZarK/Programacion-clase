package Herencia;

import javax.swing.*;
import java.sql.SQLOutput;

public class uso_estudiante {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del estudiante");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del estudiante"));
        String carrera = JOptionPane.showInputDialog("Introduce la carrera del estudiante");

        Estudiante alumno = new Estudiante(nombre, edad, carrera);
        System.out.println("Estos son los atributos del estudiante: ");
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Edad: " + alumno.getEdad());
        System.out.println("Carrera: " + alumno.getCarrera());
    }
}
