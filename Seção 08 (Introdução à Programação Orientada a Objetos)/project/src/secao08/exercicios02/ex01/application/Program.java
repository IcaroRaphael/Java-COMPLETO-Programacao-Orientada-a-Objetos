package secao08.exercicios02.ex01.application;

import secao08.exercicios02.ex01.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
        uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
        que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
        para ser responsável pelos cálculos.*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? A:");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? A:");
        double amountDollars = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f\n", CurrencyConverter.dollarToReal(amountDollars, dollarPrice));

        sc.close();
    }
}