import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejerciciosif3 {
    public static void main(String[] args) throws IOException {
        //1.3. Enunciado:
        //Verifica si un número `x` es igual a 10. Si es igual, imprime "El número es 10".
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un numero (preferiblemente 10 xd)");
        int x = Integer.parseInt(br.readLine());
        if (x == 10) {
            System.out.println("El numero es 10");
            br.close();

        }
    }
}
