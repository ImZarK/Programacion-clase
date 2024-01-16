package ejerciciosarrays;

import java.util.Scanner;

public class ejercicios4 {
    public static void main(String[] args) {
         //4. Encontrar el Menor Valor: Pide al usuario 6 números enteros, almacénalos en un array y
        // encuentra el menor valor, mostrándolo luego en consola.
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Introduce un numero");
            numeros[i] = sc.nextInt();



        }
        int menorNumero = numeros[0];

        for (int i = 1; i < numeros.length ; i++) {
            if ( numeros[i] < menorNumero) {
                menorNumero = numeros[i];


            }

        }
        System.out.println("El menor valor de tu array es " + menorNumero);
        sc.close();
    }
}
