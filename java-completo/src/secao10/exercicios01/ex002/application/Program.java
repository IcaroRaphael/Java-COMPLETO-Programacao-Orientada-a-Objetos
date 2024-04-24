package secao10.exercicios01.ex002.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor*/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantos números serão lidos: ");
        int n = sc.nextInt();
        System.out.println();

        double[] vect = new double[n];
        for(int i = 0; i < vect.length; i++){
            System.out.printf("Insira %dº número: ", (i+1));
            vect[i] = sc.nextDouble();
        }
        System.out.println();

        double sum = 0.0;

        System.out.print("VALORES = ");
        for(double num : vect){
            System.out.printf("%.1f  ", num);
            sum += num;
        }
        System.out.println();

        System.out.printf("SOMA = %.2f\n", sum);
        System.out.printf("MEDIA = %.2f\n", (sum/vect.length));

        sc.close();
    }
}
