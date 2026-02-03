package br.com.estudo.exercicio.jeanderson;

import java.util.Scanner;

public class ExerciciosCondicionais2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        float km;
        float l;

        System.out.println("digite a distancia percorrida em km");
        km = sc.nextFloat();

        System.out.println("digite a quantia de combustivel consumida");
        l = sc.nextFloat();

        consumoCombustivel(km, l);

        System.out.println("Digite a temperatura atual em graus Celsius:");
        int celsius = sc.nextInt();

        temperatura(celsius);

        System.out.println("Digite o tipo do ingresso (1 = comum, 2 = VIP):");
        int ingresso = sc.nextInt();

        System.out.println("Digite o dia da semana (1 = segunda, ..., 7 = domingo):");
        int diaSemana = sc.nextInt();

        valorIngresso(diaSemana, ingresso);

        System.out.println("\nDigite o consumo mensal de energia (kWh):");
        double kWh = sc.nextDouble();

        consumoEnergia(kWh);

        sc.close();
    }

    public static void consumoCombustivel(float km, float l) {
        float consumoMedio = km/l;

        if (consumoMedio >= 12) {
            System.out.println("o carro está tendo um bom desempenho com ".concat(String.valueOf(consumoMedio).concat("km/l(if/else)")));
        }
        else {
            System.out.println("o carro está tendo um desempenho abaixo do esperado com ".concat(String.valueOf(consumoMedio).concat("km/l(if/else)")));
        }

        System.out.println((consumoMedio >= 12)? "o consumo medio está bom(ternario)" : "o consumo medio está abaixo da media(ternario)");
    }

    public static void temperatura(int celsius) {
        if (celsius < 18) {
            System.out.println("frio (if/else)");
        } else if (celsius <= 26) {
            System.out.println("agradavel (if/else) ");
        }
        else {
            System.out.println("quente(if/else)");
        }
        System.out.println((celsius < 18) ? "frio (ternario)" : (celsius <= 26) ? "agradavel (ternario)" : "quente (ternario)");
    }

    public static void valorIngresso(int diaSemana, int ingresso) {
        int precoIngresso = 0;
        if (ingresso == 1) {
            precoIngresso = 50;
        }
        else if (ingresso == 2) {
            precoIngresso = 100;
        }

        if (diaSemana > 5) {
            precoIngresso += 20;
        }

        System.out.println("o ingresso custa ".concat(String.valueOf(precoIngresso)));
    }

    public static void consumoEnergia(double kWh) {
        double tarifa = kWh;
        double tarifaTernario = kWh;
        if (kWh <= 100) {
            tarifa *= 0.50;
        }
        else if (kWh <= 300) {
            tarifa *= 0.75;
        }

        System.out.println("(if/else) o valor da tarifa é de ".concat(String.valueOf(tarifa)));
        tarifaTernario *= (kWh <= 100) ?  0.50 : (kWh <= 300) ? 0.75 : 1;
        System.out.println("(ternario) o valor da tarifa é de ".concat(String.valueOf(tarifaTernario)));
    }

}
