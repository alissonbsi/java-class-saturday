
import java.util.Scanner;

public class ExerciciosCondicionais {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        questao1Maioridade(scanner);
        questao2ParOuImpar(scanner);
        questao3AprovacaoAluno(scanner);
        questao4DescontoCompra(scanner);
        questao5Login(scanner);

        scanner.close();
    }

    // Questão 1 – Maioridade (if/else)
    public static void questao1Maioridade(Scanner scanner) {
        System.out.println("Questão 1 - Maioridade");
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
        System.out.println();
    }

    // Questão 2 – Par ou Ímpar (ternário)
    public static void questao2ParOuImpar(Scanner scanner) {
        System.out.println("Questão 2 - Par ou Ímpar");
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
        System.out.println(resultado);
        System.out.println();
    }

    // Questão 3 – Aprovação de aluno (if/else)
    public static void questao3AprovacaoAluno(Scanner scanner) {
        System.out.println("Questão 3 - Aprovação do Aluno");
        System.out.print("Digite a nota final: ");
        double nota = scanner.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        System.out.println();
    }

    // Questão 4 – Desconto em compra (ternário)
    public static void questao4DescontoCompra(Scanner scanner) {
        System.out.println("Questão 4 - Desconto em Compra");
        System.out.print("Digite o valor da compra: ");
        double valor = scanner.nextDouble();

        double valorFinal = (valor >= 100) ? valor * 0.9 : valor;
        System.out.println("Valor final: " + valorFinal);
        System.out.println();
    }

    // Questão 5 – Login simples (if + ternário)
    public static void questao5Login(Scanner scanner) {
        System.out.println("Questão 5 - Login");
        scanner.nextLine(); // limpar buffer

        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        boolean valido = false;

        if (usuario.equals("admin") && senha.equals("123")) {
            valido = true;
        }

        String mensagem = valido ? "Login realizado com sucesso" : "Usuário ou senha inválidos";
        System.out.println(mensagem);
        System.out.println();
    }
}