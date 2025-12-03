package br.com.estudo.jeanderson;

import java.util.Scanner;

public class LoginUsuario {
    public static void main(String[] args) {
        int senha = 0;
        String nome = "";
        nome=username(nome);
        senha=password(senha);
        System.out.println("username: ".concat(nome));
        System.out.println("Password: ".concat(String.valueOf(senha)));
    }
    private static String username(String nome){
        Scanner sc= new Scanner(System.in);
        System.out.println("digite seu nome: ");
        nome= sc.nextLine();
        return nome;
    }
    private static int password(int senha){
        Scanner sc= new Scanner(System.in);
        System.out.println("digite sua senha");
        senha= sc.nextInt();
        senha=validarPassword(senha);
        return senha;
    }
    private static int validarPassword(int senha){
        Scanner sc= new Scanner(System.in);
        String valorSenha= String.valueOf(senha);
        if (valorSenha.length()==4) {
            System.out.println("senha valida\n");
            return senha;
        }
        else {
            System.out.println("senha invalida, digite novamente!");
            System.out.println("sua senha deve conter apenas 4 numeros inteiros!");
            senha = sc.nextInt();
            return validarPassword(senha);
        }
    }
}
