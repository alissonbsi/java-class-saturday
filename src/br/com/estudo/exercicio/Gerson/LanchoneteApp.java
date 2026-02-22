package br.com.estudo.exercicio.Gerson;

import java.util.Scanner;

public class LanchoneteApp {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double totalPedido = 0;
        int opcao = -1;

        System.out.println("BEM VINDOS(AS) AO GDS LANCHES)");

        while (opcao != 0) {
            mostrarMenu();
            System.out.print("Escolha seu lanche pelo  numero (0 para fechar pedido): ");
            opcao = leitor.nextInt();

            if (opcao != 0) {
                // Chamei  o método para saber o preço
                double precoItem = identificarPreco(opcao);

                // caso o preço seja maior que 0, significa que o item existe
                if (precoItem > 0) {
                    System.out.print("quantidade?: ");
                    int qtd = leitor.nextInt();

                    if (qtd > 0) {
                        totalPedido += (precoItem * qtd);
                        System.out.println("Item adicionado!");
                    } else {
                        System.out.println("Quantidade inválida!");
                    }
                } else {
                    // Se cai aqui, o switch não acha o código
                    System.out.println("Produto não encontrado!");
                }
            }
        }

        finalizarPedido(totalPedido);
        leitor.close();
    }

    public static void mostrarMenu() {
        System.out.println("\nCARDÁPIO");
        System.out.println("1 - X-Burger     R$ 12,00");
        System.out.println("2 - X-Salada     R$ 15,00");
        System.out.println("3 - Refrigerante R$ 6,00");
        System.out.println("4 - Batata Frita R$ 10,00");
        System.out.println("0 - Finalizar");
    }

    public static double identificarPreco(int codigo) {
        // O switch identifica o código e já mostra o que foi escolhido
        switch (codigo) {
            case 1:
                System.out.println("Você escolheu: X-Burger");
                return 12.00;
            case 2:
                System.out.println("Você escolheu: X-Salada");
                return 15.00;
            case 3:
                System.out.println("Você escolheu: Refrigerante");
                return 6.00;
            case 4:
                System.out.println("Você escolheu: Batata Frita");
                return 10.00;
            default:
                return 0.0;
        }
    }

    public static void finalizarPedido(double total) {
        double desc = 0;
        // Lógica de promoção
        if (total > 50) {
            desc = total * 0.10;
        } else if (total >= 30) {
            desc = total * 0.05;
        }


        System.out.printf("Total Bruto:   R$ %.2f\n", total);
        System.out.printf("Desconto:      R$ %.2f\n", desc);
        System.out.printf("Total a Pagar: R$ %.2f\n", (total - desc));

    }
}