package parte4;

import java.util.Scanner;

public class Programa08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] VetorNotas = new int[5];

        for (int count = 0; count < 5; count++) {
            System.out.println("Informe uma Nota");
            int nota = entrada.nextInt();

            VetorNotas[count] = nota;
        }
        for (int count = 0; count < 5; count++) {
            System.out.println(VetorNotas[count]);
        }
    }
}