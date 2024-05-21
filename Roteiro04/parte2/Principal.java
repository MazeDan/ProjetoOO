package Roteiro04.parte2;


public class Principal {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno(001,"DANIEL","ARQUITETURA",2020);

        System.out.println("Matricula : " + aluno01.matricula);
        System.out.println("Nome : " + aluno01.nome);
        System.out.println("Curso : " + aluno01.curso);
        System.out.println("Ano Ingresso : " + aluno01.anoIngresso);    

    }

}
