package Roteiro04.parte1;


public class Principal {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();
        aluno01.matricula = 111;
        aluno01.nome = "Jose";
        aluno01.curso = "Sistema de Informação";
        aluno01.anoIngresso = 2019;

        Aluno aluno02 = new Aluno();
        aluno01.matricula = 112;
        aluno01.nome = "Maria";
        aluno01.curso = "Sistema de Informação";
        aluno01.anoIngresso = 2019;

        System.out.println("Matricula : " + aluno01.matricula);
        System.out.println("Nome : " + aluno01.nome);
        System.out.println("Curso : " + aluno01.curso);
        System.out.println("Ano Ingresso : " + aluno01.anoIngresso);    

    }

}
