package secao_06.aula_050;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de vezes do laço: ");
        int N = sc.nextInt();

        int soma = 0;
        for(int i = 1; i <= N; i++){
            System.out.printf("Insira o %dº valor: ", i);
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println("Soma: " + soma);

        sc.close();
    }
}
