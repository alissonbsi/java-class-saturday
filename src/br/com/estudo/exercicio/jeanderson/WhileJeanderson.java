package br.com.estudo.exercicio.jeanderson;

import java.util.Scanner;

public class WhileJeanderson {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Validação de Senha");
        conferirSenha(sc);

        System.out.println("Soma até número negativo");
        somaPositivos(sc);

        System.out.println("Menu com controle numérico");
        menuNumerico(sc);

        sc.nextLine();

        System.out.println("Sistema de login com tentativas");
        login(sc);

        sc.close();
    }

    public static void conferirSenha(Scanner sc) {
        System.out.println("digite uma senha");
        String senha = sc.nextLine();

        while (true) {
            if (senhaCorreta(senha)) {
                System.out.println("acesso permitido");
                break;
            }
            else {
                System.out.println("a senha esta errada");
            }
        }
    }

    public static boolean senhaCorreta(String senha) {
        String senhaReal = "java123";

        for (int i = 0; i < senha.length() - 1; i++) {
            if (senha.charAt(i) != senhaReal.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void somaPositivos(Scanner sc) {
        System.out.println("Digite números positivos (negativo encerra):");
        double numero = sc.nextDouble();
        double soma = 0;
        while (numero > 0) {
            soma += numero;
            System.out.println(soma);
            numero = sc.nextDouble();
        }
        System.out.println(soma);
    }

    public static void menuNumerico(Scanner sc) {
        tabelaMenu();
        int valor;
        int opcao = sc.nextInt();

        while (opcao != 3) {

            if (opcao == 2 || opcao == 1) {
                System.out.print("Digite um número: ");
                valor = sc.nextInt();

                if (valor % 2 == 0) {
                    System.out.println("O número " .concat(String.valueOf(valor)).concat(" é PAR."));
                }
                else {
                    System.out.println("O número ".concat(String.valueOf(valor)).concat(" é ÍMPAR.") );
                }

            } else {System.out.println("Opção inválida.");}

            tabelaMenu();
            opcao = sc.nextInt();

        }
    }

    public static void tabelaMenu() {
        System.out.println("1 - Par");
        System.out.println("2 - Ímpar");
        System.out.println("3 - Sair");
    }

    public static void login(Scanner sc) {
        int contador = 0;
        while (contador < 3) {
            System.out.println("digite o usuario");
            String user = sc.nextLine();
            System.out.println("digite a senha");
            String senha = sc.nextLine();

            if (usuario(user) && verificaSenha(senha)) {
                System.out.println("login realizado com sucesso");
                break;
            } else if (contador == 2) {
                System.out.println("conta bloqueada por excesso de tentativas");
            }
            ++contador;
        }
    }

    public static boolean usuario(String user) {
        String userReal = "admin";
        
        for (int i = 0; i < user.length() - 1; i++) {
            if (user.charAt(i) != userReal.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean verificaSenha(String senha) {
        String senhaReal = "1234";

        for (int i = 0; i < senha.length() - 1; i++) {
            if (senha.charAt(i) != senhaReal.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
