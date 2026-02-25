package br.com.estudo.fevereiro;

import java.util.Scanner;

public class EstruturaCondicionalComplexa {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a média: ");
        double media = leitor.nextDouble();

        System.out.println("Digite a presença do aluno: ");
        double presenca = leitor.nextDouble();


        if ((media >= 7) && (presenca >= 80)) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        if ((media >= 8) || (presenca == 100)) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        if ((media >= 8) || !(presenca == 100)) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        boolean estaPresente = true;      // V
        boolean fezTrabalho = false;       // F
        boolean temJustificativa = false; // F

        if (estaPresente && (fezTrabalho || temJustificativa)) {
            System.out.println("Aluno autorizado a fazer a prova.");
        } else {
            System.out.println("Aluno não pode fazer a prova.");
        }
    }

    // && (Lê-se "e")
    // || (Lê-se "||")
    // ! (Lê-se negação)

    // Conjunção
    // V && V = V
    // V && F = F
    // F && V = F
    // F && F = F

    // V || V = V
    // V || F = V
    // F || V = V
    // F || F = F

    // !V = F (~)
    // !F = V (~)

    //SonarQube

    // V && (V || F) = ? => V && V = V

    // F && (V || F) = ? => F && V = F
}
