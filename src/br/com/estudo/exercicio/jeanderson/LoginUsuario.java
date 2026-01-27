package br.com.estudo.jeanderson;

import java.util.Scanner;

public class LoginUsuario {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String username = username();
        int password = password();
        System.out.println("username: ".concat(username));
        System.out.println("Password: ".concat(String.valueOf(password)));
        System.out.println("parabens, ".concat(username).concat("! Você realizou seu cadastro com sucesso!"));
    }

    private static String username(){
        System.out.println("Digite seu nome: ");

        return sc.nextLine();
    }

    private static int password(){
        System.out.println("Digite sua senha");

        return validarPassword(sc.nextInt());
    }

    private static int validarPassword(Integer senha){
        if (senha.toString().length() == 4) {
            System.out.println("senha valida\n");

            return senha;
        }
        else {
            System.out.println("senha invalida, digite novamente!");
            System.out.println("sua senha deve conter apenas 4 numeros inteiros!");

            return validarPassword(sc.nextInt());
        }
    }
}
