package br.com.estudo.exercicio.Gerson;

import java.util.Scanner;

public class ExercicioJava {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println(" 1. Classificr Idade ");
        System.out.print("Digite sua idade: ");
        int idade = leitor.nextInt();

        if (idade < 18) {
            System.out.println("Menor de idade");
        } else if (idade <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

        System.out.println("\n 2.  Par e Ímpar ");
        System.out.print("Quantos números quer ler? ");
        int n = leitor.nextInt();
        int pares = 0, impares = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            int num = leitor.nextInt();
            if (num % 2 == 0) pares++;
            else impares++;
        }
        System.out.println("Pares: " + pares + " | Ímpares: " + impares);

        System.out.println("\n 3. Positivo ou Negativo (0 para sair) ");
        int total = 0;
        while (true) {
            int num = leitor.nextInt();
            if (num == 0) break;

            String tipo = (num > 0) ? "Positivo" : "Negativo";
            System.out.println(tipo);
            total++;
        }
        System.out.println("Total digitado: " + total);


        System.out.println("\n 4. Análise de Array ");
        System.out.print("Tamanho do array: ");
        int tam = leitor.nextInt();
        double[] lista = new double[tam];
        double soma = 0;

        for (int i = 0; i < tam; i++) {
            System.out.print("Valor " + i + ": ");
            lista[i] = leitor.nextDouble();
            soma += lista[i];
        }

        double maior = lista[0];
        System.out.print("Valores: ");
        for (double v : lista) {
            System.out.print(v + " ");
            if (v > maior) maior = v;
        }

        System.out.println("\nMaior: " + maior);
        System.out.println("Média: " + (soma / tam));

        leitor.close();
    }
}