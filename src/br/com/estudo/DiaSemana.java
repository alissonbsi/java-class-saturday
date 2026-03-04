package br.com.estudo;

import java.util.Scanner;

public class DiaSemana {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float mediaFinal;
        float mediaAluno;
        float somaAlunos = 0;
        int numeroAlunos;
        int auxiliar = 1;

        System.out.println("Entre com a quantidade de alunos da turma: ");
        numeroAlunos = leitor.nextInt();

        while (numeroAlunos >= auxiliar) {
            System.out.println("Entre com a Média final do aluno " + auxiliar + ": ");
            mediaAluno = leitor.nextFloat();

            somaAlunos =  somaAlunos + mediaAluno;
            //somaAlunos += mediaAluno;
            auxiliar = auxiliar + 1;
//            auxiliar++;
        }
//garbageColector
        mediaFinal = somaAlunos / numeroAlunos;
        System.out.println("Media da turma é igual a: " + mediaFinal);

    }
}
