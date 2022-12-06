package secao_06.exercicio_pt2.exercicio_03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de
        teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média
        ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o
        segundo valor tem peso 3 e o terceiro valor tem peso 5.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantos casos serão lidos: ");
        int N = sc.nextInt();
        System.out.println();

        for(int i = 1; i <= N; i++){
            System.out.printf("Insira os valores do %dº caso: ", i);
            double caso1 = sc.nextDouble();
            double caso2 = sc.nextDouble();
            double caso3 = sc.nextDouble();

            double media = ((2 * caso1) + (3 * caso2) + (5 * caso3)) / 10;
            System.out.printf("Média do %dº caso: %.1f\n", i, media);
            System.out.println();
        }

        sc.close();
    }
}
