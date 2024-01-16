package EjerciciosFunciones;

import java.util.Scanner;

public class Ejer03 {
    public static void main(String[] args) {
        //Escribe una función en Java para comprobar si un año es bisiesto.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un año");
        int año = sc.nextInt();
        boolean añoBisiesto = bisiesto(año);
        if (añoBisiesto) {
            System.out.println("Tu año es bisiesto");
        } else {
            System.out.println("Tu año no es bisiesto");
        }
    }

    public static boolean bisiesto(int anno) {

        return ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0));


        }
    }
