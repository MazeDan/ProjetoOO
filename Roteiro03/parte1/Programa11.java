package Roteiro03.parte1;

import java.util.Scanner;

public class Programa11 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu numero: ");
        double Sb = entrada.nextInt();

        double gratificacao = Programa11.calc_Grat(Sb);
        double imposto = Programa11.calc_Impost(Sb);
        double salarioTotal = Sb + gratificacao - imposto;

        System.out.println("Gratificação: " + gratificacao);
        System.out.println("Imposto: " + imposto);

        System.out.println("Salario Total: " + salarioTotal);
    }

    public static double calc_Grat(double Sb) {

        double Grat = Sb * 0.05;

        return Grat;
    }

    public static double calc_Impost(double Sb) {

        double Imp = Sb * 0.07;

        return Imp;
    }
}
