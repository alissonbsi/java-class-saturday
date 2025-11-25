import java.util.Scanner;

public class LeituraDados {
    public static void main(String[] args) {
//        dadosFixos("Evanderson Silva", 28);
//        dadosUsuario();
        vagaEmprego();
    }

    private static void dadosFixos(String meuNome, int idade) {

        // Eu me chamo ------- e tenho ---- anos.

        System.out.printf("Eu me chamo %s e tenho %d anos.\n", meuNome, idade);
    }

    private static void dadosUsuario() {
        Scanner leitor = new Scanner(System.in); //nova instância de Scanner

//        ESCREVA("Digite o seu nome: ")
        System.out.println("Digite o seu nome: ");
        String meuNome = leitor.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();

        System.out.printf("Eu me chamo %s e tenho %d anos.", meuNome, idade);

        leitor.close();
    }

    private static void vagaEmprego() {
        Scanner leitor = new Scanner(System.in);

        //Nome da Vaga - Gerson
        // Salário - Jeje
        // Tempo de Experiência - Evanderson
        System.out.println("Digite o nome da Vaga: ");
        String nomeVaga = leitor.nextLine();

        System.out.println("Digite o salário para a vaga: ");
        double salario = leitor.nextDouble();

        System.out.println("Digite o tempo em anos de experência para a vaga: ");
        int tempoExperiencia = leitor.nextInt();

        leitor.close();

        // Vaga: ------
        // Salário Previsto: -------
        //Tempo Mínimo de Experiência: ----- anos.
        // Cadastrado com Sucesso!

        System.out.println("Vaga: " + nomeVaga);
        System.out.printf("Salário Previsto: %.2f\n", salario);
        System.out.println("Tempo Mínimo de Experiência: " + tempoExperiencia + " anos.");
        System.out.println("Cadastrado com Sucesso!");
    }
}
