package SobrecargaDeConstructores;

import org.w3c.dom.ls.LSOutput;

public class uso_empleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Kevin",1080,"Recursos Humanos");
        Empleado empleado2 = new Empleado("Mario");
        Empleado empleado3 = new Empleado("Rayo",50000);

        System.out.println("Empleado 1:");
        System.out.println("Nombre " + empleado1.getNombre());
        System.out.println("Salario: " + empleado1.getSalario()+ "€");
        System.out.println("Departamento: " + empleado1.getDepartamento());

        System.out.println("\nEmpleado 2:");
        System.out.println("Nombre " + empleado2.getNombre());
        System.out.println("Salario: " + empleado2.getSalario()+ "€");
        System.out.println("Departamento: " + empleado2.getDepartamento());

        System.out.println("\nEmpleado 3:");
        System.out.println("Nombre " + empleado3.getNombre());
        System.out.println("Salario: " + empleado3.getSalario() + "€");
        System.out.println("Departamento: " + empleado3.getDepartamento());
    }


}
