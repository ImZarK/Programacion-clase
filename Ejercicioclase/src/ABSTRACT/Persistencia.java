package ABSTRACT;



// Clase abstracta Persistencia
public abstract class Persistencia {
    // Diseña una clase abstracta Persistencia con métodos abstractos como guardarDatos() y
    // cargarDatos(). Implementa subclases concretas como PersistenciaArchivo y
    // PersistenciaBaseDatos que hereden de esta clase y proporcionen implementaciones
    // específicas para guardar y cargar datos en diferentes tipos de almacenamiento
    public abstract void guardarDatos();
    public abstract void cargarDatos();
}

class PersistenciaArchivo extends Persistencia {
    @Override
    public void guardarDatos() {

        System.out.println("guardando datos en el archivo...");
    }


    @Override
    public void cargarDatos() {

        System.out.println("cargando datos desde el archivo...");
    }
}

class PersistenciaBaseDatos extends Persistencia {

    @Override
    public void guardarDatos() {

        System.out.println("guardando datos en base de datos...");
    }


    @Override
    public void cargarDatos() {
        System.out.println("cargando datos desde base de datos...");
    }
}




