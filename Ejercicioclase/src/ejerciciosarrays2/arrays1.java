package ejerciciosarrays2;

import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
        //1.Inicializar dos matrices de tamaño 3x3: Puedes llenarlas con números estáticos o pedir al usuario que los
        // ingrese.
        //2.Crear una matriz vacía para la suma: Esta matriz también debe ser de tamaño 3x3.
        //3.Sumar las matrices: Utiliza bucles anidados para recorrer las matrices. En cada iteración, suma los elementos
        // correspondientes de ambas matrices y almacena el resultado en la matriz de suma.
        //4.Imprimir la matriz resultante: Recorre la matriz de suma y muestra sus elementos.
        Scanner sc = new Scanner(System.in);
        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matriz2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] suma = new int[3][3];

        for (int i = 0; i < 3; i++) {         
            for (int j = 0; j < 3; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];

            }

        }
        System.out.println("Suma de matriz");
        ImprimirMatriz(suma);
    }


public static void ImprimirMatriz(int[][] Matriz) {
    for (int i = 0; i < Matriz.length ; i++) {
        for (int j = 0; j < Matriz.length ; j++) {
            System.out.print(Matriz[i][j] + " ");

        }

    }

    }
}