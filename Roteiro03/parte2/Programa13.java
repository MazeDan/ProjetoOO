/*2 – Observe que no Programa13 as funções de soma, 
subtração, multiplicação e divisão, foram criadas com 
o retorno “void”. Ou seja, são funções que não geram 
resultado de retorno para quem as chama. Crie uma classe 
Programa14 idêntico ao Programa13, de forma que as funções 
de soma, subtração, multiplicação e divisão gerem o retorno 
para a função main, e que o resultado da operação seja 
apresentado na função main (output) .
*/
package Roteiro03.parte2;

import java.util.Scanner;

public class Programa13 {

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
                soma(x, y);
                break;
            case "-":
                subtracao(x, y);
                break;
            case "*":
                multiplicacao(x, y);
                break;
            case "/":
                divisao(x, y);
                break;
            default:
                System.out.println("Operacao invalida");
                break;
        }
    }

    public static void soma(double x, double y) {
        System.out.println("Resultado : " + (x + y));
    }

    public static void subtracao(double x, double y) {
        System.out.println("Resultado : " + (x - y));
    }

    public static void multiplicacao(double x, double y) {
        System.out.println("Resultado : " + (x * y));
    }

    public static void divisao(double x, double y) {
        System.out.println("Resultado : " + (x / y));
    }
}
