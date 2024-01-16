package ejerciciosarrays;

import java.util.Scanner;

public class ejercicios3 {
    public static void main(String[] args) {
        //3. Promedio de Notas: Escribe un programa que pida al usuario 4 notas (valores decimales) y calcule el
        // promedio de estas.
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[4];
        for (int i = 0; i <4; i++) {
            System.out.println("Introduce tu nota del trimestre nª " + (i + 1));
            notas[i] = sc.nextInt();


        }
        double sumaNotas = 0;
        double divisionNotas = 0;
        for (double mediaNotas : notas){
            sumaNotas += mediaNotas;
            divisionNotas = sumaNotas / 4.0;

        }
        System.out.println("La media de todas tus notas es " + divisionNotas);
    sc.close();
    }

}
