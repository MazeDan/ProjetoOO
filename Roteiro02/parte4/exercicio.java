package parte4;

import java.util.Random;
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {

        Random random = new Random();
        int NumeroSecreto = random.nextInt(100) + 1;
        Scanner entrada = new Scanner(System.in);
        System.out.println(NumeroSecreto);


        int controle = 0;
        while (controle == 0) {
            System.out.println("Digite o Numero proximo");
            int nota = entrada.nextInt();
            if (NumeroSecreto == nota){
                System.out.println("Numero Certo");
                controle = 1;
            }
            else{
                if(nota > NumeroSecreto){
                    System.out.println("Numero Errado tente novamente Mais Baixo");
                }else{
                    System.out.println("Numero Errado tente novamente Mais Alto");
                }
            }  
        }
    }

}
