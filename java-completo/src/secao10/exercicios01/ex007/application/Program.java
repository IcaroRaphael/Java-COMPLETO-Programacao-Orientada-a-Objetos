package secao10.exercicios01.ex007.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
        mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
        os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantos elementos terá o vetor: ");
        int n = sc.nextInt();
        System.out.println();

        double[] vect = new double[n];
        double somaTotal = 0;
        for(int i = 0; i < vect.length; i++){
            System.out.printf("Insira o %dº valor: ", (i+1));
            vect[i] = sc.nextDouble();
            somaTotal += vect[i];
        }
        System.out.println();

        double media = somaTotal / vect.length;
        System.out.printf("MEDIA DO VETOR: %.3f\n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for(double num : vect){
            if(num < media){
                System.out.printf("%.1f\n", num);
            }
        }

        sc.close();
    }
}
