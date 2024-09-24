package secao04.exercicios.ex05;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
        */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoPeca1 = sc.nextInt();
        int quantPeca1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();

        double valorTotalPeca1 = quantPeca1 * valorPeca1;

        int codigoPeca2 = sc.nextInt();
        int quantPeca2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();

        double valorTotalPeca2 = quantPeca2 * valorPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", (valorTotalPeca1 + valorTotalPeca2));

        sc.close();
    }
}
