package secao_04.exercicio_03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a
        diferença do produto de A e B pelo produto de C e D segundo a fórmula:
        DIFERENCA = (A * B - C * D).
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, diferenca;

        System.out.print("Insira um valor para A: ");
        A = sc.nextInt();
        System.out.print("Insira um valor para B: ");
        B = sc.nextInt();
        System.out.print("Insira um valor para C: ");
        C = sc.nextInt();
        System.out.print("Insira um valor para D: ");
        D = sc.nextInt();

        System.out.println("Aplicando a fórmula 'DIFERENCA = (A * B - C * D)'");
        diferenca = A * B - C * D;
        System.out.println("DIFERENÇA = " + diferenca);

        sc.close();

    }
}
