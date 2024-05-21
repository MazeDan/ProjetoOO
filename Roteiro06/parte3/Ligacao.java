package Roteiro06.parte3;
import java.util.Scanner;

public class Ligacao {

    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private Tempo horaInicio;
    private Tempo horaFim;
    private Scanner entrada = new Scanner(System.in);


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

    public void VerificarNumero(String numero){
        System.out.println("Digite Abaixo para saber se o numero é valido: ");
        if(numero.equals(this.numOrigem)){
            System.out.println("O numero: " + numero + "é Valido. Além disso é o número de Origem");
        }
        else if(numero.equals(this.numDestino)){
            System.out.println("O numero: " + numero + "é Valido. Além disso é o número de Destino");
        }
        else{
            System.out.println("O numero: " + numero + " Não é Valido.");
        }
       
    }

    public void  calcularValor() {

    int[] horaInicio = getHoraInicio();
    int[] horaFim = getHoraFim();
    int min = (horaFim[0] - horaInicio[0]) * 60 + (horaFim[1] - horaInicio[1]);
    if ((horaFim[2] - horaInicio[2]) > 0) {
        min++;
    }

    double valorLigacao = 1.00 * min;

    System.out.println("Valor da ligação: R$" + valorLigacao);

    }


}
