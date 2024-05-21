package Roteiro06.parte2;

public class Ligacao {

    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private Tempo horaInicio;
    private Tempo horaFim;

    public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino, Tempo horaInicio){
        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horaInicio = horaInicio;
        this.horaFim = null; 
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

    public int[] getHoraInicio() {
        int [] Horario = new int [3];
        Horario[0] = this.horaInicio.getHora();
        Horario[1] = this.horaInicio.getMinuto();
        Horario[2] = this.horaInicio.getSegundo();

        return Horario;
    }

  

    public void setHoraInicio(Tempo horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int[] getHoraFim() {
        int [] Horario = new int [3];
        Horario[0] = this.horaFim.getHora();
        Horario[1] = this.horaFim.getMinuto();
        Horario[2] = this.horaFim.getSegundo();

        return Horario;
    }

    public void setHoraFim(Tempo horaFim) {
        this.horaFim = horaFim;
    }

    public void ImprimirLigacao() {

        int [] HoraDeInicioImpressao = getHoraInicio();
        int [] HoraDeFImImpressao = getHoraFim();


        System.out.println("Numero de Origem: " + getNumOrigem() );
        System.out.println("Numero de Destino: " + getNumDestino() );
        System.out.println("Local de Origem: " + getLocalOrigem() );
        System.out.println("Local de Destino: " + getLocalDestino() );
        System.out.println("Hora de Inicio: " + HoraDeInicioImpressao[0] + ":" + HoraDeInicioImpressao[1] + ":" + HoraDeInicioImpressao[2]);
        System.out.println("Hora de Fim: " + HoraDeFImImpressao[0] + ":" + HoraDeFImImpressao[1] + ":" + HoraDeFImImpressao[2]);
        
    }



}
