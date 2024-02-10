package STATIC;

public class ContadorMetodos {
    // Ejercicio 5: Contador de Llamadas a Método
    // Objetivo: Contar cuántas veces se ha llamado a un método específico.
    //Descripción:- Crea una clase con un método que realice alguna operación simple (como imprimir un
    // mensaje).- Añade una variable estática para contar cuántas veces se ha llamado a este método.- Cada vez que el
    // método se llame, incrementa el contador.- Añade un método estático que devuelva el número de veces que el método
    // ha sido llamado.

    private static int contador;

    public static void ContadorMetodos() {
        contador++;
    }
    public static int ContarLlamadas() {
        return contador;
    }

    public static void main(String[] args) {
      ContadorMetodos.ContadorMetodos();
        ContadorMetodos.ContadorMetodos();
        ContadorMetodos.ContadorMetodos();
        ContadorMetodos.ContadorMetodos();
        ContadorMetodos.ContadorMetodos();
        System.out.println("El metodo ha sido llamado " + ContadorMetodos.ContarLlamadas() + " veces");
    }
}
