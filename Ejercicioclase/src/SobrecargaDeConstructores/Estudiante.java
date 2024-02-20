package SobrecargaDeConstructores;

public class Estudiante {
    //5. Crea una clase Estudiante que tenga constructores sobrecargados para inicializar su
    // nombre, edad y promedio académico. Después, en el programa principal, genera instancias de
    // esta clase utilizando distintas combinaciones de parámetros en los constructores para
    // representar estudiantes con diferentes perfiles y logros académicos.

    private String nombre;
    private int edad;
    private double promedio;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }
    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

}
