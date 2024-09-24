package secao06.exercicios02.ex03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantos casos serão lidos: ");
        int casos = sc.nextInt();

        for(int x = 1; x <= casos; x++){
            System.out.println();
            System.out.printf("Insira os valores do %dº caso:\n", x);

            System.out.print("1º valor: ");
            double n1 = sc.nextDouble();
            System.out.print("2º valor: ");
            double n2 = sc.nextDouble();
            System.out.print("3º valor: ");
            double n3 = sc.nextDouble();

            double media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
            System.out.printf("Média ponderada: %.1f\n", media);
            System.out.println();
        }

        sc.close();
    }
}
