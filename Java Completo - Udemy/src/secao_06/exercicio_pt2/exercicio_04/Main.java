package secao_06.exercicio_pt2.exercicio_04;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do
        primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"
        */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantos pares serão lidos: ");
        int N = sc.nextInt();
        System.out.println();

        for(int i = 1; i <= N; i++){
            System.out.printf("Insira o %dº par: ", i);
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();

            if(n2 == 0){
                System.out.printf("Resultado da %dº divisão: Divisão impossível\n", i);
            }else{
                double divisao = n1 / n2;
                System.out.printf("Resultado da %dº divisão: %.1f\n", i, divisao);
            }
            System.out.println();
        }

        sc.close();
    }
}
