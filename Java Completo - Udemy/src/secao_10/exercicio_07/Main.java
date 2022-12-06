package secao_10.exercicio_07;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
        mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar
        todos os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos serão lidos? R:");
        int n = sc.nextInt();
        System.out.println();

        double[] numeros = new double[n];

        double soma = 0;
        for(int i = 0; i < numeros.length; i++){
            System.out.printf("Insira o %dº valor: ", (i+1));
            numeros[i] = sc.nextDouble();
            soma += numeros[i];
        }
        System.out.println();

        double media = soma / numeros.length;
        System.out.printf("MÉDIA DO VETOR: %.3f\n", media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < media){
                System.out.printf("%.1f\n", numeros[i]);
            }
        }

        sc.close();
    }
}
