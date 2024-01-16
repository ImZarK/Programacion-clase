import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ejercicionotas {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Como te llamas?");

        String nombreEstudiante= sc.nextLine();
         char calificaion1;
         char calificacion2;
        int calificacion3;
        int calificacion4;
        double promedioCalificaciones;
        boolean aprobo;

        System.out.println("Introduce la nota de Matematicas:");
        calificaion1 = sc.next().charAt(0);
        System.out.println("Introduce la nota de Lengua::");
        calificacion2 = sc.next().charAt(0);
        System.out.println("Introduce la nota de Geografia:");
        calificacion3 = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce la nota de Historia");
        calificacion4 = Integer.parseInt(sc.nextLine());
        promedioCalificaciones = (calificaion1 + calificacion2 + calificacion3 + calificacion4) / 2.0;

        if (promedioCalificaciones >=70) {
            System.out.println("El estudiante "+nombreEstudiante+ " esta aprobado");
        }else{
            System.out.println("El estudiante "+nombreEstudiante+" esta reprobado");
        }



    }
}
