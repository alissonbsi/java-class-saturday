package br.com.estudo.exercicio.jeanderson;

import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        imprimirDias();
        System.out.println("digite o dia da semana");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("é domingo");
                break;
            case 2:
                System.out.println("é segunda");
                break;
            case 3:
                System.out.println("é terca");
                break;
            case 4:
                System.out.println("é quarta");
                break;
            case 5:
                System.out.println("é quinta");
                break;
            case 6:
                System.out.println("é sexta");
                break;
            case 7:
                System.out.println("é sabado");
                break;
            default:
                System.out.println("por favor digite um dia da semana");
        }
    }

    public static void imprimirDias() {
        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda");
        System.out.println("3 - Terça");
        System.out.println("4 - Quarta");
        System.out.println("5 - Quinta");
        System.out.println("6 - Sexta");
        System.out.println("7 - Sábado");
    }
}
