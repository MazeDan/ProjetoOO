package parte3;
import java.util.Scanner;
public class Programa07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int interup = 0;
        int loop = 0;
        double media = 0;
        while (interup == 0) {
            loop++;
            System.out.println("DIGITE SUA NOTA");
            int nota = entrada.nextInt();
            if (nota >= 7) {
                System.out.println("Aprovado" );
                media += nota;
            } else if (nota == -1) {
                interup = 1;
                loop--;
            } else {
                System.out.println("Reprovado");
                media += nota;
            }
            System.out.println("Total da Media: " + media);
        }
        double resultado = media / loop;
        System.out.println(" QUANTIDADE DE NOTAS: " + loop);
        System.out.println(" A media das notas são:" + resultado);
    }
}