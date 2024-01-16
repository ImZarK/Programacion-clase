package EjerciciosFunciones;

import java.util.Scanner;

public class Ejer02 {
    public static void main(String[] args) {
        //Implementa una función en Java que encuentre el menor de dos números.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce un numero");
        int num2 = sc.nextInt();
        System.out.println("Tu numero menor es "+ numeroMenor(num1,num2));
    }
    public static int numeroMenor (int num1, int num2) {
       int menor = (num1 < num2) ? num1 : num2;


        return menor;
    }

        }


