package secao_04.exercicio_05;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de
        cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
        Calcule e mostre o valor a ser pago.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code1, quantCode1, code2, quantCode2;
        double valorCode1, valorCode2;

        System.out.print("Dados da 1º peça (Código|Quantidade|Valor): ");
        code1 = sc.nextInt();
        quantCode1 = sc.nextInt();
        valorCode1 = sc.nextDouble();

        System.out.print("Dados da 2º peça (Código|Quantidade|Valor): ");
        code2 = sc.nextInt();
        quantCode2 = sc.nextInt();
        valorCode2 = sc.nextDouble();

        System.out.printf("VALOR A PAGAR: R$%.2f\n", (quantCode1*valorCode1)+(quantCode2*valorCode2));

        sc.close();
    }
}
