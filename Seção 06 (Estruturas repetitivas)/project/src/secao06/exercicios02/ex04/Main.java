package secao06.exercicios02.ex04;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantas divisões serão feitas: ");
        int n = sc.nextInt();
        System.out.println();

        for(int i = 1; i <= n; i++){
            System.out.print("Insira o numerador: ");
            int numerador = sc.nextInt();
            System.out.print("Insira o denominador: ");
            int denominador = sc.nextInt();

            if(denominador == 0){
                System.out.println("Divisao impossivel");
            }
            else{
                double divisao = (double) numerador / denominador;
                System.out.printf("Resultado: %.1f\n", divisao);
            }
            System.out.println();
        }

        sc.close();
    }
}
