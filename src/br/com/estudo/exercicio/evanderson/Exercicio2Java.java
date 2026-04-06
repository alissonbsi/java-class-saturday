package br.com.estudo.exercicio.evanderson;

import java.util.Scanner;

public class Exercicio2Java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Condicionais (Idade)");
            System.out.println("2 - Pares e Ímpares");
            System.out.println("3 - Positivo ou Negativo");
            System.out.println("4 - Array (Maior e Média)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    exercicio1(sc);
                    break;
                case 2:
                    exercicio2(sc);
                    break;
                case 3:
                    exercicio3(sc);
                    break;
                case 4:
                    exercicio4(sc);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }

    // ================= EXERCÍCIO 1 =================
    public static void exercicio1(Scanner sc) {
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade < 18) {
            System.out.println("Menor de idade");
        } else if (idade <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }

    // ================= EXERCÍCIO 2 =================
    public static void exercicio2(Scanner sc) {
        System.out.print("Digite um número inteiro N: ");
        int N = sc.nextInt();

        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
    }

    // ================= EXERCÍCIO 3 =================
    public static void exercicio3(Scanner sc) {
        int contador = 0;
        int numero;

        do {
            System.out.print("Digite um número (0 para sair): ");
            numero = sc.nextInt();

            if (numero != 0) {
                String resultado = (numero > 0) ? "Positivo" : "Negativo";
                System.out.println(resultado);
                contador++;
            }

        } while (numero != 0);

        System.out.println("Total de números digitados: " + contador);
    }

    // ================= EXERCÍCIO 4 =================
    public static void exercicio4(Scanner sc) {
        System.out.print("Digite o tamanho do array: ");
        int tamanho = sc.nextInt();

        int[] numeros = new int[tamanho];
        int soma = 0;
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            numeros[i] = sc.nextInt();

            soma += numeros[i];

            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("Valores armazenados:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(numeros[i]);
        }

        double media = (double) soma / tamanho;

        System.out.println("Maior valor: " + maior);
        System.out.println("Média: " + media);
    }
}