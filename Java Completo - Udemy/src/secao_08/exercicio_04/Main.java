package secao_08.exercicio_04;

import secao_08.exercicio_04.utilitarios.ConversorMoeda;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
        uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
        que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
        para ser responsável pelos cálculos.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor do dolar: ");
        ConversorMoeda.valorDolar = sc.nextDouble();

        System.out.print("Insira quantos dólares deseja comprar: ");
        double dolares = sc.nextDouble();

        System.out.printf("Valor a ser pago em reais: %.2f\n", ConversorMoeda.converterMoeda(dolares));

        sc.close();
    }
}
