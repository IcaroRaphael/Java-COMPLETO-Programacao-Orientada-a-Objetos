package secao_06.exercicio_pt2.exercicio_07;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela
        N linhas, começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado
        e o cubo do valor, conforme exemplo.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número inteiro positivo: ");
        int N = sc.nextInt();

        for(int i = 1; i <= N; i++){
            System.out.printf("%d  %.0f  %.0f\n", i, Math.pow(i, 2), Math.pow(i, 3));
        }

        sc.close();
    }
}
