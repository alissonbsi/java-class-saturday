package br.com.estudo.abner;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome de usuário: ");
        String username = scanner.nextLine();

        System.out.print("Digite sua senha (4 números): ");
        int password = scanner.nextInt();

        System.out.println("\nUserName: " + username);
        System.out.println("Password: " + password);
        System.out.println("Parabéns, " + username + ", você realizou seu cadastro com sucesso!");

        scanner.close();
    }
}