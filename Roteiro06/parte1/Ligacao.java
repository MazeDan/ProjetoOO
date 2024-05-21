package Roteiro06.parte1;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Ligacao {

    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private String horaInicio;
    private String horaFim;

    public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino, String horaInicio){
        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horaInicio = horaInicio;
        this.horaFim = ""; 
    }   

    public String getNumOrigem() {
        return this.numOrigem;
    }

    public void setNumOrigem(String numOrigem) {
        this.numOrigem = numOrigem;
    }

    public String getNumDestino() {
        return this.numDestino;
    }

    public void setNumDestino(String numDestino) {
        this.numDestino = numDestino;
    }

    public String getLocalOrigem() {
        return this.localOrigem;
    }

    public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }

    public String getLocalDestino() {
        return this.localDestino;
    }

    public void setLocalDestino(String localDestino) {
        this.localDestino = localDestino;
    }

    public String getHoraInicio() {
        return this.horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return this.horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }


    // Resposta 06
    public void calcularDiferenca(String horario01,String horario02) throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

        Date data01 = simpleDateFormat.parse(horario01);
        Date data02 = simpleDateFormat.parse(horario02);

        long diferencaEmMilisegundos = Math.abs(data02.getTime() - data01.getTime());

        long diferencaEmHoras= (diferencaEmMilisegundos / (60 * 60 * 1000)) % 24;

        long diferencaEmMinutos = (diferencaEmMilisegundos / (60 * 1000)) % 60;

        long diferencaEmSegundos = (diferencaEmMilisegundos / 1000) % 60;
     
        System.out.println("A diferença é " + diferencaEmHoras + " Horas "+ diferencaEmMinutos  + " Minutos "+ diferencaEmSegundos + " Segundos. ");
 

    }

}
