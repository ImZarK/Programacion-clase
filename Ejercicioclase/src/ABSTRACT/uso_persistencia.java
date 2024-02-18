package ABSTRACT;

public class uso_persistencia {
    public static void main(String[] args) {
        PersistenciaArchivo persistenciaArchivo = new PersistenciaArchivo();
        PersistenciaBaseDatos persistenciaBaseDatos = new PersistenciaBaseDatos();

        persistenciaArchivo.guardarDatos();
        persistenciaArchivo.cargarDatos();

        persistenciaBaseDatos.guardarDatos();
        persistenciaBaseDatos.cargarDatos();
    }
}
