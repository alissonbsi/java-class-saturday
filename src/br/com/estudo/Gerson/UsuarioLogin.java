package br.com.estudo.Gerson;

import java.util.Scanner;

public class UsuarioLogin {
    public static void main(String[] args) {
        loginApp();
    }
    private static void loginApp(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String enterName = leitor.nextLine();

        System.out.println("Enter Password: ");
        int enterPassword = leitor.nextInt();

        leitor.close();

        System.out.println("Name: " + enterName);
        System.out.println("Password: " + enterPassword);
        System.out.println("Parabéns, " + enterName + " Você Realizou Seu Cadastrado com Sucesso! ");

    }

}