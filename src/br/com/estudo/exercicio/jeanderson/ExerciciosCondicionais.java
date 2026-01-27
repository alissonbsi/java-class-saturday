package br.com.estudo.exercicio.jeanderson;

import java.util.Scanner;

public class ExerciciosCondicionais {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("qual sua idade?");
        int idade = sc.nextInt();
        maioridade(idade);

        System.out.println("digite um numero para verificar se ele é par ou impar");
        int numero = sc.nextInt();
        parImpar(numero);

        System.out.println("digite sua nota final para saber se voce foi aprovado");
        double notaFinal = sc.nextDouble();
        aprovacaoAluno(notaFinal);

        System.out.println("digite o valor da sua compra");
        double compra = sc.nextDouble();
        descontoCompra(compra);
        sc.nextLine();

        System.out.println("digite seu nome de usuario");
        String usuario = sc.nextLine();
        System.out.println("digite sua senha de usuario");
        String senha = sc.nextLine();
        login(senha, usuario);
    }

    public static void maioridade(int idade) {
        if (idade >= 18) {
            System.out.println("maior de idade");
        }
        else if( idade >= 0) {
            System.out.println("menor de idade");
        }
    }

    public static void parImpar(int numero) {
        String parOuImpar= (numero % 2 == 0) ? "par" : "impar";

        System.out.println("o numero é".concat(parOuImpar));
    }

    public static void aprovacaoAluno(double nota) {
        if (nota >= 0 && nota <= 10 )
            if (nota >= 7.0) {
                System.out.println("aluno aprovado com nota alta! ");
            }
            else if (nota >= 5.0) {
                System.out.println("aprovado raspando! ");
            }
            else {
                System.out.println("reprovado! ");
            }
        else {
            System.out.println("a nota tem que estar entre 0 e 10");
        }
    }

    public static void descontoCompra(double valor) {
        double valorDesconto;
        double desconto = (valor >= 100.0) ? 0.1 : 0;

        valorDesconto = valor * desconto;

        System.out.println("o valor total è: ".concat(String.valueOf(valor)).concat("R$"));
        System.out.println("voce ganhou ".concat(String.valueOf(desconto * 100)).concat("% de desconto!"));
        System.out.println("isso da ".concat(String.valueOf(valorDesconto)).concat("R$ de desconto"));
        System.out.println("o valor total com desconto é de ".concat(String.valueOf(valor- valorDesconto)).concat("R$"));
    }

    public static void login(String senha, String usuario) {
        String senhaCorreta = "123";
        String usuarioCorreto = "admin";

        if (senha.equals(senhaCorreta) && usuario.equals(usuarioCorreto)) {
            System.out.println("usuario correto, acesso liberado");
        }
        else {
            System.out.println("usuario errado, acesso bloqueado");
        }
    }
}
