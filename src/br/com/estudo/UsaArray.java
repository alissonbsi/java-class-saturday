package br.com.estudo;

import java.util.Scanner;

public class UsaArray {

    private static final String CONSTANTE_EXEMPLO = "constante exemplo aula";
    public static void main(String[] args) {
//        usarVariavelArray();
        lendoValoresArrayUser();
    }

    private static void usarVariavelArray() {

        String[] nomes = new String[5];

        nomes[0] = "Abner";
        nomes[1] = "Alisson";
        nomes[2] = "Evanderson";
        nomes[3] = "Gerson";
        nomes[4] = "Jeanderson";
        nomes[0] = "João";

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);
        System.out.println(nomes[3]);
        System.out.println(nomes[4]);

        int[] numeros = new int[5];

        numeros[0] = 25;
        numeros[1] = 34;
        numeros[2] = 28;
        numeros[3] = 34;
        numeros[4] = 19;
//        index = indice

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);

        String[] cidades = {"Itabaiana", "Itabaianinha", "Lagarto", "Aracaju", "Estância", "Propriá", "Boquim"};

        for (String cidade : cidades) {
            System.out.println(cidade);
        }

        var name = 10; // var identifica o tipo (String, int, double...) de variavel pelo valor a ela atribuída.
        System.out.println(name);
        System.out.println(name);

        System.out.println(CONSTANTE_EXEMPLO);

    }

    private static void lendoValoresArrayUser() {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[3];

        System.out.println("Digite um nome para a posição 0:");
        nomes[0] = scanner.nextLine();
        System.out.println("Digite um nome para a posição 1:");
        nomes[1] = scanner.nextLine();
        System.out.println("Digite um nome para a posição 2:");
        nomes[2] = scanner.nextLine();

        System.out.println("O nome digitado para a posição 0: " + nomes[0]);
        System.out.println("O nome digitado para a posição 1: " + nomes[1]);
        System.out.println("O nome digitado para a posição 2: " + nomes[2]);

        scanner.close();
    }
}
