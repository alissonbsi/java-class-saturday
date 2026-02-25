package br.com.estudo.exercicio.Gerson;

import java.util.Scanner;

public class ExerciciosCondicionais2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // QUESTÃO 1
        System.out.println(" Questão 1 ");
        System.out.print("Distância (km): ");
        double km = leitor.nextDouble();
        System.out.print("Combustível (L): ");
        double litros = leitor.nextDouble();
        double consumo = km / litros;

        // Versão if/else
        if (consumo >= 12) { System.out.println("If/Else: Econômico"); }
        else { System.out.println("Não econômico"); }

        // Versão Ternário
        System.out.println(" " + ((consumo >= 12) ? "Econômico" : "Não econômico"));


        //  QUESTÃO 2
        System.out.println("\n Questão 2");
        System.out.print("Valor do produto: ");
        double valorProd = leitor.nextDouble();
        System.out.print("Distância (km): ");
        double dist = leitor.nextDouble();
        double frete;

        // Versão if/else
        if (valorProd >= 200) { frete = 0; }
        else if (dist <= 50) { frete = 20; }
        else { frete = 40; }

        // Versão Ternário
        frete = (valorProd >= 200) ? 0 : (dist <= 50) ? 20 : 40;
        System.out.println("Valor final (Produto + Frete): R$ " + (valorProd + frete));


        // QUESTÃO 3
        System.out.println("\n Questão 3");
        System.out.print("Temperatura (°C): ");
        double temp = leitor.nextDouble();

        // Versão if/else
        if (temp < 18) { System.out.println("If/Else: Frio"); }
        else if (temp <= 26) { System.out.println("If/Else: Normal"); }
        else { System.out.println("If/Else: Calor"); }

        // Versão Ternário
        String clima = (temp < 18) ? "Frio" : (temp <= 26) ? "Normal" : "Calor";
        System.out.println("Ternário: " + clima);


        // QUESTÃO 4
        System.out.println("\n Questão 4");
        System.out.print("Tipo (1-Comum, 2-VIP): ");
        int tipo = leitor.nextInt();
        System.out.print("Dia (1-Seg a 7-Dom): ");
        int dia = leitor.nextInt();
        double preco;

        // Versão if/else
        if (tipo == 2) { preco = 100; }
        else { preco = 50; }
        if (dia >= 6) { preco += 20; }

        // Versão Ternário
        preco = (tipo == 2 ? 100 : 50) + (dia >= 6 ? 20 : 0);
        System.out.println("Valor do ingresso: R$ " + preco);


        //  QUESTÃO 5
        System.out.println("\n Questão 5");
        System.out.print("Consumo (kWh): ");
        double kwh = leitor.nextDouble();
        double tarifa;

        //Versão if/else
        if (kwh <= 100) { tarifa = 0.50; }
        else if (kwh <= 300) { tarifa = 0.75; }
        else { tarifa = 1.00; }

        // Versão Ternário
        tarifa = (kwh <= 100) ? 0.50 : (kwh <= 300) ? 0.75 : 1.00;
        System.out.println("Total da conta: R$ " + (kwh * tarifa));

        leitor.close();
    }
}