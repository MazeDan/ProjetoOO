package Roteiro04.parte4;
import java.util.Scanner;

public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;
    private int qtDeDisciplina;
    private String situacao;

    private Scanner entrada = new Scanner(System.in);


    Aluno(int pMatricula, String pNome, String pCurso, int pAnoIngresso){
        matricula = pMatricula;
        nome = pNome;
        curso = pCurso;
        anoIngresso = pAnoIngresso;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {   
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnoIngresso() {
        return this.anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
    
    public String getSituacao() {
        
        return this.situacao;
    }

    public void setValores() {
        System.out.println("Se o Aluno for não matriculado digite 0, \n caso o aluno for matriculado digite 1: ");
            int EscolhaMatri = entrada.nextInt();
            switch (EscolhaMatri) {
                case 0:
                    this.situacao = "Não Matriculado";
                break;
                case 1:
                    this.situacao = "Matriculado";
                break;
            
                default:
                    break;
            }
            if(EscolhaMatri == 1 ){
                System.out.println("Digite a Quantidade de Disciplinas: ");
                int EscolhaDis = entrada.nextInt();
                this.qtDeDisciplina = EscolhaDis;
            }else{
                this.qtDeDisciplina = 0;
            }
        }

        
    
 
    public int getQtDeDisciplina() {
        return this.qtDeDisciplina;
    }

   

}
