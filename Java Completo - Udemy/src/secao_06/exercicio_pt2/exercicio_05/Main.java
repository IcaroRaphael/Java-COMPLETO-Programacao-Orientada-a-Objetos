package secao_06.exercicio_pt2.exercicio_05;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2)
        * N-3) * ... * 1.
        Lembrando que, por definição, fatorial de 0 é 1.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor para calcular seu fatorial: ");
        int N = sc.nextInt();

        int fatorial = 1;
        if(N != 0){
            for(int i = N; i >= 1; i--){
                fatorial *= i;
            }
        }
        System.out.printf("Fatorial de %d: %d\n", N, fatorial);

        sc.close();
    }
}
