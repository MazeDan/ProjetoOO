package Roteiro04.parte4;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno(001, "DANIEL", "ARQUITETURA", 2020);

        System.out.println("Matricula : " + aluno01.getMatricula());
        System.out.println("Nome : " + aluno01.getNome());
        System.out.println("Curso : " + aluno01.getCurso());
        System.out.println("Ano Ingresso : " + aluno01.getAnoIngresso());

        aluno01.setMatricula(22);

        System.out.println("Matricula : " + aluno01.getMatricula());
        System.out.println("Nome : " + aluno01.getNome());
        System.out.println("Curso : " + aluno01.getCurso());
        System.out.println("Ano Ingresso : " + aluno01.getAnoIngresso());

        aluno01.setValores();

        System.out.println("Quantidade de Disciplinas: " + aluno01.getQtDeDisciplina());
        System.out.println(aluno01.getSituacao());

    }

}
