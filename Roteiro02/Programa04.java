import java.util.Scanner;

public class Programa04{
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int cont = 0;
        while(cont < 5){
            System.out.println("DIGITE SUA NOTA");
            int nota = entrada.nextInt();

            if( nota >= 7 ){
                System.out.println("Aprovado");
            }else{
                System.out.println("Reprovado");
            }

            cont++;
        }
    }
}