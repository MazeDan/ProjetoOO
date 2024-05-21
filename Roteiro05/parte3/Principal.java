package Roteiro05.parte3;

public class Principal {
    public static void main(String[] args) {

        Loja loja01 = new Loja("Loja do Carlos", "Loja do Jorge S/a", "1588875");
        Loja loja02 = new Loja("Loja do Antonio", "", "1588875");

        loja01.setValorFat(30000);
        loja02.setValorFat(20000);

        System.out.println(loja01.getNomeFantasia());
        System.out.println(loja02.getRazaoSocial());
        System.out.println(loja01.getRazaoSocial());

        Loja.compararFat_static(loja01, loja02);

        System.out.println(" ****** Comparação com método estático ********");
        Loja.compararFat_static(loja01, loja02);
 
        System.out.println(" ****** Comparação com método NÃO estático ********");
        loja02.compararFat_naoStatic(loja01);
 
        System.out.println(" ****** Comparação com método NÃO estático ********");
        loja02.compararFat_naoStatic(loja01);

        System.out.println("***** Comparação com metodo não estatico com retorno******");
        Loja LojaMaior = Loja.compararFat_static_Return(loja01,loja02);
        
        System.out.println(LojaMaior.getNomeFantasia());
        /*
         * System.out.println(" ****** Teste 1 ********");
         * if (loja01.getNomeFantasia() == loja02.getNomeFantasia()) {
         * System.out.println("Lojas Iguais");
         * } else {
         * System.out.println("Lojas Diferentes");
         * }
         * 
         * System.out.println(" ****** Teste 2 ********");
         * if (loja01.getNomeFantasia().equals(loja02.getNomeFantasia())) {
         * System.out.println("Lojas Iguais");
         * } else {
         * System.out.println("Lojas Diferentes");
         * }
         * 
         * System.out.println(" ****** Teste 3 ********");
         * if (loja01 == loja02) {
         * System.out.println("Lojas Iguais");
         * } else {
         * System.out.println("Lojas Diferentes");
         * }
         * 
         * System.out.println(" ****** Teste 4 ********");
         * if (loja01.equals(loja02)) {
         * System.out.println("Lojas Iguais");
         * } else {
         * System.out.println("Lojas Diferentes");
         * }
         * 
         * System.out.println(" ****** Teste 5 ********");
         * if (loja01.equals(loja01)) {
         * System.out.println("Faturamentos Iguais");
         * } else {
         * System.out.println("Faturamentos Diferentes");
         * }
         */
    }
}

/*
 * Questão 06: Sim foi corrigido totalmente
 */
