import java.util.Scanner;

public class Programa07 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int cont = 0;
        while(cont < 5){
            System.out.println("DIGITE SUA NOTA 01");
            int nota01 = entrada.nextInt();
            System.out.println("DIGITE SUA NOTA 02");
            int nota02 = entrada.nextInt();
            System.out.println("DIGITE SUA NOTA 03");
            int nota03 = entrada.nextInt();

            int media = ((nota01 + nota02 + nota03)/3);

            if( media >= 7.5 ){
                System.out.println("Aprovado");
            }else{
                System.out.println("Reprovado");
            }

            cont++;
        }
    }
}