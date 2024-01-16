package ejerciciosarrays;

import java.util.Scanner;

public class ejercicios2 {
    public static void main(String[] args) {

        //2. Sumar Números de un Array: Pide al usuario 3 números, almacénalos en un array y calcula
        // la suma de estos números, mostrándola en consola.
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];
        for (int i = 0; i <3; i++) {
            System.out.println("Introduce un numero" + i);
            numeros[i] = sc.nextInt();


        }
        int suma = 0;
        for (int numero : numeros){
            suma += numero;
        }
        System.out.println("La suma de tus numeros es " + suma);
    sc.close();
    }

}