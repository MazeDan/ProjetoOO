package Roteiro06.parte1;

import java.text.ParseException;

public class Principal {
    public static void main(String[] args) throws ParseException{

        Ligacao lig01 = new Ligacao("121212", "565656", "A", "B", "10:15:02");
        System.out.println(lig01.getLocalDestino());

        // Resposta 05
        lig01.setHoraFim("10:40:35");
        System.out.println(lig01.getHoraFim());

        lig01.calcularDiferenca(lig01.getHoraInicio(),lig01.getHoraFim());
        
    }

}
