package Roteiro03.parte1;

import java.util.Scanner;

public class Programa12 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu numero: ");
        double Sb = entrada.nextInt();
        double Sb_Total = Programa12.calc_Salario(Sb);

        System.out.println("Salario Total: " + Sb_Total);
    }

    public static double calc_Salario(double Sb) {

        double Grat = Sb + Sb * 0.05;
        double Imp = Sb + Sb * 0.07;

        return Sb + Grat - Imp;

    }
}
