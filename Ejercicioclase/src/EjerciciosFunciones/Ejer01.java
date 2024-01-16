package EjerciciosFunciones;

import java.util.Scanner;

public class Ejer01 {
    public static void main(String[] args) {
       //Desarrolla una función en Java para verificar si un número es negativo.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();

        numeroNegativo(numero);
        sc.close();

    }
    public static void numeroNegativo(int numero) {
        if (numero < 0) {
            System.out.println("Tu numero es negativo");
        }else{
            System.out.println("Tu numero es positivo");

        }
    }
}
