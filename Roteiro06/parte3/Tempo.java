package Roteiro06.parte3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo(int hora,int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public int getHora() {
        return this.hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return this.segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

}

