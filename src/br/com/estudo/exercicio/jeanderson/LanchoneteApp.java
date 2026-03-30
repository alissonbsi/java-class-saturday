package br.com.estudo.exercicio.jeanderson;

import java.util.ArrayList;
import java.util.Scanner;

public class LanchoneteApp {

    public static void main(String[] args) {
        double total = 0;
        double desconto = 0;
        boolean descontoAplicado = false;
        String sentinela;
        int escolha;
        boolean start = true;
        Scanner sc = new Scanner(System.in);

        ArrayList<String> cardapio = new ArrayList<>();
        ArrayList<Double> precos = new ArrayList<>();
        inicializarItensBasicos(cardapio, precos);

        while (start) {
            imprimirEscolhas();
            escolha = (sc.hasNextInt()) ? sc.nextInt() : testarInteiro(sc);
            sentinela = "0";
            switch (escolha) {
                case (1):
                    while (!sentinela.equals("x")) {
                        listarProdutos(cardapio, precos);
                        total += compra(precos, sc);
                        sc.nextLine();
                        System.out.println(total);
                        System.out.println("digite x caso queira sair dos pedidos");
                        sentinela = sc.nextLine();
                    }
                    break;

                case (2):
                    total = encerrarPedido(total, desconto);
                    descontoAplicado = false;
                    desconto = 0;
                    break;

                case (3):
                    while (!sentinela.equals("x")) {
                        addCardapio(cardapio, precos, sc);
                        System.out.println("digite x caso queira parar de adicionar");
                        sentinela = sc.nextLine();
                    }
                    break;

                case (4):
                    while (!sentinela.equals("x")) {
                        removerProduto(cardapio, precos, sc);
                        System.out.println("digite x caso queira parar de remover");
                        sentinela = sc.nextLine();
                    }
                    break;

                case (5):
                    if (!descontoAplicado) {
                        descontoAplicado = true;
                        desconto = aplicarPromocoes(total);
                        System.out.println("valor com desconto aplicado: ".concat(String.valueOf(total - desconto)).concat("R$"));
                    }
                    else {
                        System.out.println("não é possivel adicionar o desconto mais de uma vez");
                    }
                    break;

                case (6):
                    start = false;
                    break;

                default:
                    System.out.println("digite um opcao que exista");
            }
        }
    }

    public static int testarInteiro (Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("o numero digitado deve ser um inteiro. Ex: 1");
            sc.next();
        }
        return sc.nextInt();
    }

    public static void addCardapio(ArrayList<String> cardapio, ArrayList <Double> precos, Scanner sc) {
        double valores;
        String produtos;

        System.out.println("diga qual nome do produto");
        produtos = sc.nextLine();

        System.out.println("diga o preço");
        valores = sc.nextDouble();

        sc.nextLine();
        cardapio.add(produtos);
        precos.add(valores);

    }

    public static double encerrarPedido(double total, double desconto) {
        System.out.println("o total do pedido sem desconto foi: ".concat(String.valueOf(total)).concat("R$"));
        System.out.println("o desconto foi de".concat(String.valueOf(desconto)));
        System.out.println("o total do pedido foi: ".concat(String.valueOf(total - desconto)).concat("R$"));
        System.out.println("pedido finalizado");
        return 0;
    }

    public static void imprimirEscolhas() {
        System.out.println("[1]-comprar");
        System.out.println("[2]-encerrar pedido");
        System.out.println("[3]-adicionar ao cardapio");
        System.out.println("[4]-remover do cardapio");
        System.out.println("[5]-promocao");
        System.out.println("[6]-encerrar programa");
    }

    public static void listarProdutos(ArrayList<String> cardapio, ArrayList <Double> precos) {
        System.out.println("cardapio");
        for (int i = 0; i < cardapio.size(); i++) {
            System.out.println(String.valueOf(i)
                    .concat("-")
                    .concat(cardapio.get(i)
                    .concat(":  ")
                    .concat(String.valueOf(precos.get(i)))
                    .concat("R$")));

        }
    }

    public static void removerProduto(ArrayList<String> cardapio, ArrayList <Double> precos, Scanner sc) {
        int posicao;
        System.out.println("diga a posicao do produto que vc deseja remover: ");
        posicao = (sc.hasNextInt()) ? sc.nextInt() : testarInteiro(sc);
        if (posicao < 0 || posicao >= precos.size()){
            System.out.println("posicao invalida");
            return;
        }
        cardapio.remove(posicao);
        precos.remove(posicao);
        sc.nextLine();
    }

    public static void inicializarItensBasicos(ArrayList<String> cardapio, ArrayList <Double> precos) {
        cardapio.add(0,"X-Burger" );
        cardapio.add(1,"X-Salada" );
        cardapio.add(2,"Refrigerante" );
        cardapio.add(3,"Batata Frita" );

        precos.add(0, 12.0);
        precos.add(1, 15.0);
        precos.add(2, 6.0);
        precos.add(3, 10.0);
    }

    public static double compra(ArrayList <Double> precos, Scanner sc) {

        System.out.println("qual produto voce deseja comprar: ");
        int posicao = (sc.hasNextInt())? sc.nextInt() : testarInteiro(sc);
        System.out.println("quantidade: ");
        int quantidade = (sc.hasNextInt())? sc.nextInt() : testarInteiro(sc);

        if (posicao >= precos.size() || posicao < 0) {
            System.out.println("este produto não existe");
            return 0;
        }

        return precos.get(posicao) * quantidade;
    }

    public static double aplicarPromocoes(double total) {
        if (total > 50) {
            return total * 0.10;
        }
        else if (total > 30) {
            return total * 0.05;
        }
        return 0;
    }
}
