package Herencia;

public class Persona {
    //2. Clase Persona y Clase Estudiante: Define una clase Persona con atributos nombre y edad, y
    //un constructor para inicializar esos atributos. Luego, crea una clase Estudiante que herede de
    //Persona e incluya un atributo adicional carrera y un constructor que haga uso del constructor
    //de la clase base para inicializar todos los atributos.

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



}
