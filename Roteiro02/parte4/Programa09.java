package parte4;

import java.util.Scanner;

public class Programa09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] VetorNotas = new int[5];

        for (int count = 0; count < 5; count++) {
            
            System.out.println("Informe uma Nota");
            int nota = entrada.nextInt();
        if(nota <= 10){
            VetorNotas[count] = nota;
            }else{             
                if( count != 0) count--;
                System.out.println("Nota Invalida");}
        }
        for (int count = 0; count < 5; count++) {
            System.out.println(VetorNotas[0]);
        }
    }
}
