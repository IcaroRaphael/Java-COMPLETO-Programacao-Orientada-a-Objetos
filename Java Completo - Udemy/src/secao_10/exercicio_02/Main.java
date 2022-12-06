package secao_10.exercicio_02;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quatos numeros serao lidos: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for(int i = 0; i < vect.length; i++){
            System.out.printf("Insira o %dº numero: ", (i+1));
            vect[i] = sc.nextDouble();
        }
        System.out.println();

        double soma = 0;
        System.out.print("VALORES: ");
        for(int i = 0; i < vect.length; i++){
            System.out.printf(" %.1f ", vect[i]);
            soma += vect[i];
        }
        System.out.println();

        double media = soma / vect.length;

        System.out.printf("SOMA: %.2f\n", soma);
        System.out.printf("MEDIA: %.2f\n", media);

        sc.close();
    }
}
