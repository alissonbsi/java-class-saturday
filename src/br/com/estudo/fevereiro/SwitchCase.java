package br.com.estudo.fevereiro;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String lgbtqiapn = "";

        System.out.println("Digite a letra da sigla que você se identifica: ");
        lgbtqiapn = leitor.nextLine();

        switch (lgbtqiapn) {
            case "L":
                System.out.println("Você é chupa charque!");
                break;
            case "G":
                System.out.println("Você é uma gayzinha pão ovo!");
                break;
            case "B":
                System.out.println("Você existe, apesar de ser uma biscate.");
                break;
            case "Q":
                System.out.println("Você ahaza queer!");
                break;
                default:
                    System.out.println("Sai LGBTfóbico!");
        }
        // L -> Lésbicas
        // G -> Gays
        // B -> Bissexuais
        // Q -> Queer


        System.out.println("==========================================");
        System.out.println("|| 1. Fazer pedido                      ||");
        System.out.println("|| 2. Solicitar Conta                   ||");
        System.out.println("|| 3. Deletar Item                      ||");
        System.out.println("==========================================");

        System.out.println("Digite uma opção do menu: ");
        int valor = leitor.nextInt();

        switch (valor) {
            case 1:
                System.out.println("Fazendo pedido....");
                break;
            case 2:
                System.out.println("Solicitando conta....");
                break;
                case 3:
                    System.out.println("Deletando Item...");
            default:
                System.out.println("Opção Inválida!");
        }

    }
}
