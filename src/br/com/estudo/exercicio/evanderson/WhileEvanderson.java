package br.com.estudo.exercicio.evanderson;

import java.util.Scanner;

public class WhileEvanderson {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // QUESTÃO 1 - Validação de senha
        String senha;

        System.out.println("Digite a senha:");
        senha = scanner.nextLine();

        while (senha.compareTo("java123") != 0) {
            System.out.println("Senha incorreta. Digite novamente:");
            senha = scanner.nextLine();
        }

        System.out.println("Acesso permitido!");

        // QUESTÃO 2 - Soma até número negativo
        int numero = 0;
        int soma = 0;

        System.out.println("Digite números positivos (negativo encerra):");
        numero = scanner.nextInt();

        while (numero >= 0) {
            soma += numero;
            numero = scanner.nextInt();
        }

        System.out.println("Soma total: " + soma);

        // QUESTÃO 3 - Menu
        int opcao = 0;

        while (opcao != 3) {

            System.out.println("\n1 - Par");
            System.out.println("2 - Ímpar");
            System.out.println("3 - Sair");

            opcao = scanner.nextInt();

            if (opcao == 1 || opcao == 2) {

                System.out.println("Digite um número:");
                int n = scanner.nextInt();

                if (n % 2 == 0) {
                    System.out.println("Número é PAR");
                } else {
                    System.out.println("Número é ÍMPAR");
                }

            } else if (opcao != 3) {
                System.out.println("Opção inválida");
            }
        }

        // QUESTÃO 4 - Login com tentativas
        String usuario;
        String senhaLogin;

        int tentativas = 0;

        while (tentativas < 3) {

            System.out.println("Usuário:");
            usuario = scanner.next();

            System.out.println("Senha:");
            senhaLogin = scanner.next();

            if (usuario.compareTo("admin") == 0 && senhaLogin.compareTo("1234") == 0) {
                System.out.println("Login realizado com sucesso");
                break;
            }

            tentativas++;

            if (tentativas == 3) {
                System.out.println("Conta bloqueada");
            } else {
                System.out.println("Dados incorretos. Tentativas restantes: " + (3 - tentativas));
            }
        }
        scanner.close();
    }
}