package SobrecargaDeConstructores;

public class uso_estudiante {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Kevin",19,7.2);
        Estudiante estudiante2 = new Estudiante("Genesis",18);
        Estudiante estudiante3 = new Estudiante("juan");

        System.out.println("Estudiante 1: ");
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Promedio: " + estudiante1.getPromedio());

        System.out.println("\nEstudiante 2: ");
        System.out.println("Nombre: " + estudiante2.getNombre());
        System.out.println("Edad: " + estudiante2.getEdad());
        System.out.println("Promedio: " + estudiante2.getPromedio());

        System.out.println("\nEstudiante 3: ");
        System.out.println("Nombre: " + estudiante3.getNombre());
        System.out.println("Edad: " + estudiante3.getEdad());
        System.out.println("Promedio: " + estudiante3.getPromedio());



    }
}
