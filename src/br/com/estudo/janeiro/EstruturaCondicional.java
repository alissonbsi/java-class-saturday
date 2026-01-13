package br.com.estudo.janeiro;

import java.util.Scanner;

public class EstruturaCondicional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();

        if (num2 > num1) { //true
            System.out.printf("%d é maior que %d\n", num2, num1);
        } else {
            System.out.printf("%d é maior que %d\n", num1, num2);
        }

        int maior = 0;

        // Estrutura ternário: Expressao ? Valor se verdadeiro : Valor se falso
        maior = (num2 > num1) ? num2 : num1;

        System.out.printf("O número maior é %d\n", maior);

        // Condicionais aninhadas

        int idade = 0;

        if (idade >= 18) {
            System.out.println("É maior de idade.");

            if (idade < 65) {
                System.out.println("É adulto.");
            } else {
                System.out.println("É idoso");
            }
        } else {
            if (idade <= 0) {
                System.out.println("Idade Inválida");
            } else {
                System.out.println("É menor de idade.");
            }
        }

        // Exemplo Status Aprovação

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2; // media = 7,5

        System.out.println("A média é igual a " + media);

        if (media >= 7) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }

        // Com Ternário
        String situacao = (media >= 7) ? "Situação: Aprovado" : "Situação: Reprovado";

        System.out.println(situacao);
    }
}
