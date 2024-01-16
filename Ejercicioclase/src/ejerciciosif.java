import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejerciciosif {
    public static void main(String[] args) throws IOException {
        //1.1. Enunciado:
        //Determina si un número entero `edad` es mayor o igual a 18. Si es así, imprime un mensaje
        // que diga "Mayor de edad".
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¿Cuantos años tienes?");
        int edad = Integer.parseInt(br.readLine());
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        br.close();
        }
    }
}
