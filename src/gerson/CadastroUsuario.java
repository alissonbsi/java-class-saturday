package gerson;

import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {
       LoginApp();
    }
    private static void LoginApp(){
        Scanner leitor = new Scanner(System.in);

        System.out.println(" Enter Name: ");
        String EnterName = leitor.nextLine();

        System.out.println(" Enter Password: ");
        int EnterPassword = leitor.nextInt();

        leitor.close();

        System.out.println(" Name: " + EnterName);
        System.out.println(" Password: " + EnterPassword);
        System.out.println(" Parabéns , Gerson , você Realizou Seu Cadastrado com Sucesso!");

    }

    }







