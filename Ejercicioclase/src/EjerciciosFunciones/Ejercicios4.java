package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicios4 {
    public static void main(String[] args) {
        //Crea una función en Java para contar el número de dígitos en un entero.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        System.out.println("La cantidad de digitos de tu numero es " + contador(numero));

    }
    public static int contador (int numero) {
        String numeroString = Integer.toString(numero);
        return numeroString.length();

    }
}
