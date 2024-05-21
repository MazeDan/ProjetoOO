
package Roteiro07.parte2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
 
        Aluno aluno01 = new Aluno(111, "Jose", "Sistema de Informação", 2019);
        Aluno aluno02 = new Aluno(222, "Maria", "Engenharia Civil", 2020);
        Aluno aluno03 = new Aluno(333, "Carlos", "Quimica", 2021);
        listaAlunos.add(aluno01);
        listaAlunos.add(aluno02);
        listaAlunos.add(aluno03); 


    
    //Criando um vetor estático de objetos Aluno
    
    System.out.println(listaAlunos.get(1));

    System.out.println("Listando os Alunos : ");
    System.out.println("********************************");
    for (int i = 0; i < 3; i++) {
        Aluno aluno = listaAlunos.get(i);
        System.out.println("Matricula : " + aluno.getMatricula());
        System.out.println("Nome : " + aluno.getNome());
        System.out.println("Curso : " + aluno.getCurso());
        System.out.println("Ano Ingresso : " + aluno.getAnoDeIngresso()); 
        System.out.println("********************************");
        }
    }
   }
   