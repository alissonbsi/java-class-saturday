package br.com.estudo.exercicio.evanderson;

import java.util.Scanner;

public class LanchoneteApp {

    //Variavel global para acumular o valor( acessível por todos os métodos)
    static double totalGeral = 0.0;

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao = -1;

        System.out.println("===BEM-VINDO À LANCHONETE JAVA===");

//O loop 'while' permite que o usuário compre vários itens até digitar 0

        while (opcao != 0) {
            mostrarMenu();
            System.out.println("\nDigite o código do produto (ou 0 para finalizar): ");
            opcao = leitor.nextInt();

            if (opcao != 0) {
                processarEscolha(opcao, leitor);
            }
        }
        finalizarPedido();
    }

// -- MÉTODOS AUXILIARES --

    public static void mostrarMenu() {
        System.out.println("\n---------- CARDÁPIO --------");
        System.out.println("1 - X-Burger     R$ 12,00");
        System.out.println("2 - X-Salada     R$ 15,00");
        System.out.println("3 - Refrigerante R$ 6,00");
        System.out.println("4 - Batata Frita R$ 10,00");
        System.out.println("0 - FINALIZAR PEDIDO");
        System.out.println("------------------------------");
    }

    public static void processarEscolha(int opcao, Scanner leitor) {
        double precoUnitario = 0;
        String nomeProduto = "";

// O 'switch' é perfeito para menus: ele testa o valor da variável 'opcao'

        switch (opcao) {
            case 1:
                nomeProduto = "X-Burguer";
                precoUnitario = 12.00;
                break;
            case 2:
                nomeProduto = "X-Salada";
                precoUnitario = 15.00;
                break;
            case 3:
                nomeProduto = "Refrigerante";
                precoUnitario = 6.00;
                break;
            case 4:
                nomeProduto = "Batata Frita";
                precoUnitario = 10.00;
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
                return; // Sai do método se a opção for errada
        }
        System.out.print("Quantidade de " + nomeProduto + ": ");
        int qtd = leitor.nextInt();

        //Validação com if/else

        if (qtd > 0) {
            double subtotal = precoUnitario * qtd;
            totalGeral += subtotal; // Acúmulo de valor (totalGeral = totalGeral + subtotal)
            System.out.println("Adicionado: " + qtd + "x " + nomeProduto + " = R$ " + subtotal);
        } else {
            System.out.println("Erro: Quantidade deve ser maior que zero.");
        }
    }

    public static void finalizarPedido() {
        System.out.println("\n==============================");
        System.out.println("RESUMO DO PEDIDO");
        System.out.println("Total Bruto: R$ " + totalGeral);

        double desconto = calcularDesconto(totalGeral);
        double totalComDesconto = totalGeral - desconto;

        System.out.println("Desconto aplicado: R$ " + desconto);

        System.out.println("Desconto aplicado: R$ " + desconto);
        System.out.println("TOTAL A PAGAR: R$ " + totalComDesconto);
        System.out.println("==============================");
    }

    public static double calcularDesconto(double total) {
        // Lógica de promoção solicitada
        if (total > 50) {
            return total * 0.10; // 10%
        } else if (total >= 30) {
            return total * 0.05; // 5%
        } else {
            return 0;
        }
    }
}