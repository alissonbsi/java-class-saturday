package br.com.estudo.exercicio.jeanderson;

import java.util.Scanner;

public class QuestaoQuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        realizaLogin(sc);

    }

    public static void realizaLogin(Scanner sc) {
        int maxTentativas = 3;
        int tentativa = 1;
        String senha;
        String usuario;

        while (tentativa <= maxTentativas) {
            System.out.println("digite o nome de usuario");
            usuario = sc.nextLine();
            System.out.println("digite a senha");
            senha = sc.nextLine();

            if (validarUsuario(usuario) && validarSenha(senha)) {
                System.out.println("Login realizado com sucesso");
                break;
            }
        }

        if (tentativa == maxTentativas) {
            System.out.println("conta bloqueada");
        }
    }

    public static boolean validarUsuario(String user) {
        String usuarioReal = "admin";
        return user.equals(usuarioReal);
    }

    public static boolean validarSenha(String senha) {
        String senhaReal = "123";
        return senhaReal.equals(senha);
    }
}
