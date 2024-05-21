package Roteiro05.parte1;

public class Principal {
    public static void main(String[] args) {

        Loja loja01 = new Loja("Loja do Carlos", "Loja do Jorge S/a", "1588875");
        Loja loja02 = new Loja("Loja do Antonio", "", "1588875");

        System.out.println(loja01.getNomeFantasia());
        System.out.println(loja02.getRazaoSocial());
        System.out.println(loja01.getRazaoSocial());

    }
}

/*
 * Questão 06: Sim foi corrigido totalmente
 */
