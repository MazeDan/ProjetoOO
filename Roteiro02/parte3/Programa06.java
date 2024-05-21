package parte3;
import java.util.Scanner;

public class Programa06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int interup = 0;
        while (interup == 0) {
                System.out.println("DIGITE SUA NOTA");
                int nota = entrada.nextInt();
                if (nota >= 7) {
                    System.out.println("Aprovado" + interup);
                } else if (nota == -1) {    
                    interup = 1;
                } else {
                    System.out.println("Reprovado" + interup);
                }
        }
    }
}

