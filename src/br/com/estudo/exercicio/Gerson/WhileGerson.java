package br.com.estudo.exercicio.Gerson;

import java.util.Scanner;

public class WhileGerson {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // QUESTÃO 1
        String senha = "";
        while (senha != "java123") {
            System.out.print("Senha: ");

            senha = s.next().intern();
            if (senha != "java123") System.out.println("Senha incorreta");
        }
        System.out.println("Acesso permitido!");

        // QUESTÃO 2
        int n = 0, soma = 0;
        while (n >= 0) {
            System.out.print("Número (negativo sai): ");
            n = s.nextInt();
            if (n >= 0) soma += n;
        }
        System.out.println("Soma: " + soma);

        // QUESTÃO 3
        int op = 0;
        while (op != 3) {
            System.out.print("1-Par, 2-Ímpar, 3-Sair: ");
            op = s.nextInt();
            if (op == 1 || op == 2) {
                int num = s.nextInt();
                System.out.println(num % 2 == 0 ? "Par" : "Ímpar");
            }
        }

        // QUESTÃO 4
        int t = 3;
        while (t > 0) {
            System.out.print("Usuário: ");
            String u = s.next().intern();
            System.out.print("Senha: ");
            String p = s.next().intern();

            if (u == "admin" && p == "1234") {
                System.out.println("Login Sucesso!");
                break;
            } else {
                t--;
                System.out.println(t > 0 ? "Erro! Tentativas: " + t : "Conta bloqueada.");
            }
        }
    }
}