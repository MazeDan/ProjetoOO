package Roteiro07.parte2;

public class Aluno {
    private int Matricula;
    private String Nome;
    private String Curso;
    private int AnoDeIngresso;
    private int qtDeDisciplina;
    private String situacao;

    Aluno(int Matricula,String Nome,String Curso,int AnoDeIngresso){
        this.Matricula = Matricula;
        this.Nome = Nome;
        this.Curso = Curso;
        this.AnoDeIngresso = AnoDeIngresso;
        this.qtDeDisciplina = qtDeDisciplina;
        this.situacao = "";
    }

    public int getMatricula() {
        return this.Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCurso() {
        return this.Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public int getAnoDeIngresso() {
        return this.AnoDeIngresso;
    }

    public void setAnoDeIngresso(int AnoDeIngresso) {
        this.AnoDeIngresso = AnoDeIngresso;
    }

    public int getQtDeDisciplina() {
        return this.qtDeDisciplina;
    }

    public void setQtDeDisciplina(int qtDeDisciplina) {
        this.qtDeDisciplina = qtDeDisciplina;
    }

    public String getSituacao() {
        return this.situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }


}
