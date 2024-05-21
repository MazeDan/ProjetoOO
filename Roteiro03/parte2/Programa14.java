package Roteiro03.parte2;

import java.util.Scanner;

public class Programa14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de x: ");
        double x = entrada.nextDouble();
        System.out.println("Informe a operação (+, -, *, /): ");
        String op = entrada.next();
        System.out.println("Informe o valor y: ");
        double y = entrada.nextDouble();

        switch (op) {
            case "+":
                double valorSoma = Programa14.soma(x, y);
                System.out.println("Valor da Soma é: " + valorSoma);
            break;
            case "-":
                double valorSub = Programa14.subtracao(x, y);
                System.out.println("Valor da Subtração é: " + valorSub);
            break;
            case "*":
                double valorMul = Programa14.multiplicacao(x, y);
                System.out.println("Valor da Multiplicacao é: " + valorMul);
            break;
            case "/":
                double valorDiv = Programa14.divisao(x, y);
                System.out.println("Valor da divisao é: " + valorDiv);

            break;
     
            default:
                System.out.println("Operacao invalida");
                break;
        }
        
    }

    public static double soma(double x, double y) {
        return (x + y);
    }
    public static double subtracao(double x, double y) {
        return (x - y);
    }
    public static double multiplicacao(double x, double y) {
        return (x * y);
    }
    public static double divisao(double x, double y) {
        return (x / y);
    }
/* 
    public static double subtracao(double x, double y) {
        System.out.println("Resultado : " + (x - y));
    }

    public static double multiplicacao(double x, double y) {
        System.out.println("Resultado : " + (x * y));
    }

    public static double divisao(double x, double y) {
        System.out.println("Resultado : " + (x / y));
    }
    */
}
