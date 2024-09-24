package secao06.aula049;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros serão somados? R:");
        int N = sc.nextInt();
        System.out.println();

        int soma = 0;
        for(int i=0; i<N; i++){
            System.out.print("Insira o numero: ");
            int x = sc.nextInt();
            soma += x;
        }
        System.out.println();

        System.out.println("Soma: " + soma);

        sc.close();
    }
}
