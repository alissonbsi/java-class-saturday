package br.com.estudo.evanderson;

import java.util.Scanner;

public class Login {
    public static void main(String[] args){

    //inicializa o scanner para a leitura do teclado
         Scanner leitor = new Scanner(System.in);

    //Solicita o UserName
    System.out.print("Digita seu UserName: ");
    String userName = leitor.nextLine();

    //Solicita a senha (número inteiro de 4 dígitos)
    System.out.print("Digite sua senha (4 dígitos): ");
    int senha = leitor.nextInt();

    //Exibe a mensagem final conforme solicitado
    System.out.println("\nUserName: " + userName);
    System.out.println("Passowrd: " + senha);
    System.out.println("Parabéns, " + userName + "! Você realizou seu cadastro com sucesso!");

    leitor.close();
    }
}
