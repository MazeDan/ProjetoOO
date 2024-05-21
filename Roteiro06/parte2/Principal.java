package Roteiro06.parte2;

import java.text.ParseException;

public class Principal {
    public static void main(String[] args) throws ParseException{


        Tempo TempoInicial = new Tempo(10,50,55);
        Tempo TempoFinal = new Tempo(11,35,22);


        Ligacao lig01 = new Ligacao("121212", "565656", "A", "B", TempoInicial);
        System.out.println(lig01.getLocalDestino());

        // Resposta 05
        lig01.setHoraFim(TempoFinal);
        lig01.ImprimirLigacao();

        
    }

}
