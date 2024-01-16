import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejerciciosif2 {
    public static void main(String[] args) throws IOException {
        //1.2. Enunciado:
        //Evalúa si una variable `temperatura` es menor a 0. Si es así, muestra un mensaje "Temperatura bajo cero".
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¿Cuantos grados hacen?");
        int temperatura = Integer.parseInt(br.readLine());
        if (temperatura < 0) {
            System.out.println("Que frio, estas bajo cero.");
        }
    }
}
