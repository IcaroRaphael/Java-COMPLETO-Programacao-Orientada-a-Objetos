package secao06.exercicios02.ex07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.printf("%d %.0f %.0f\n", i, Math.pow(i, 2), Math.pow(i, 3));
        }

        sc.close();
    }
}
