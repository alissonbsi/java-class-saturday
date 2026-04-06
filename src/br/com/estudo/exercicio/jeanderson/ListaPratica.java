package br.com.estudo.exercicio.jeanderson;

import java.util.Scanner;

public class ListaPratica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        do {
            imprimirOpcao();
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    idade(sc);
                    break;
                case 2:
                    parImpar(sc);
                    break;
                case 3:
                    positivoNegativo(sc);
                    break;
                case 4:
                    manipularArray(sc);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        sc.close();
    }

    public static void idade(Scanner sc) {
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

    public static void parImpar(Scanner sc) {
        System.out.print("Quantos números deseja digitar? ");
        int n = sc.nextInt();

        int pares = 0, impares = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Pares: " + pares + " | Ímpares: " + impares);
    }

    public static void positivoNegativo(Scanner sc) {
        int num, total = 0;

        while (true) {
            System.out.print("Digite um número (0 para sair): ");
            num = sc.nextInt();

            if (num == 0) break;

            String resultado = (num > 0) ? "Positivo" : "Negativo";
            System.out.println(resultado);

            total++;
        }
        System.out.println("Total de números digitados: " + total);
    }

    public static void manipularArray(Scanner sc) {
        System.out.print("Tamanho do array: ");
        int tam = sc.nextInt();

        double[] valores = new double[tam];
        double soma = 0;

        for (int i = 0; i < tam; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = sc.nextDouble();
            soma += valores[i];
        }

        double maior = valores[0];
        System.out.print("Valores: ");
        for (double v : valores) {
            System.out.print(v + " ");
            if (v > maior) maior = v;
        }

        System.out.println("\nMaior valor: " + maior);
        System.out.println("Média: " + (soma / tam));
    }

    public static void imprimirOpcao() {
        System.out.println("\n--- MENU ---");
        System.out.println("1 - Verificar idade");
        System.out.println("2 - Par ou ímpar");
        System.out.println("3 - Positivo ou negativo");
        System.out.println("4 - Manipular array");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
    }

}
