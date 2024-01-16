package ejerciciosarrays;

import java.util.Scanner;

public class ejercicios1 {
    public static void main(String[] args) {
        //1. Llenar un Array de Números Enteros: Crea un programa que pida al usuario 5 números enteros y los almacene
        // en un array. Luego, muestra los números almacenados.
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("Introduce el numero " + (i + 1));
            numeros[i] = sc.nextInt();


        }
        for (int numero : numeros){
            System.out.println(numero + " ");
        }
    sc.close();
    }
}


