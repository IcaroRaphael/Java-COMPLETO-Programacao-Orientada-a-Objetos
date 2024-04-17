package secao06.exercicios02.ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um numero inteiro: ");
        int n = sc.nextInt();

        int fatorial = 1;
        for(int i = 0; i < n; i++){
            fatorial *= (n - i);
        }

        System.out.println("Fatorial: " + fatorial);

        sc.close();
    }
}
