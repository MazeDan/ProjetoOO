package Roteiro06.parte3;

import java.text.ParseException;

public class Principal {
    public static void main(String[] args) throws ParseException{


        Tempo TempoInicial = new Tempo(11,50,0);
        Tempo TempoFinal = new Tempo(11,50,22);
 

        Ligacao lig01 = new Ligacao("71996254123", "71996227788", "A", "B", TempoInicial);
        System.out.println(lig01.getLocalDestino());

        // Resposta 05
        lig01.setHoraFim(TempoFinal);
        lig01.ImprimirLigacao();
        lig01.VerificarNumero("7199625412");
        lig01.calcularValor();

        
    }

}
