import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce un numerito:");
        int numerito = Integer.parseInt(br.readLine());
        int numeritoAñadido = numerito + 10;
        if (numeritoAñadido > 15) {
            System.out.println("tu numerito es mayor que 15");


        } else if (numeritoAñadido <= 15) {
            System.out.println("tu numerito es igual que 15");
        }else{
            System.out.println("tu numerito es menor que 15");
        }

        }

        }

