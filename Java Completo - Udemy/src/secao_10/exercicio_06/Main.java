package secao_10.exercicio_06;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
        terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B.
        Imprima o vetor C gerado.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores terão nos vetores? R:");
        int n = sc.nextInt();
        System.out.println();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        System.out.println("Insira os valores do vetor A...");
        for(int i = 0; i < vetorA.length; i++){
            System.out.printf("Insira o %dº valor: ", (i+1));
            vetorA[i] = sc.nextInt();
        }
        System.out.println();

        System.out.println("Insira os valores do vetor B...");
        for(int i = 0; i < vetorB.length; i++){
            System.out.printf("Insira o %dº valor: ", (i+1));
            vetorB[i] = sc.nextInt();
        }
        System.out.println();

        System.out.println("VETOR RESULTANTE: ");
        for(int i = 0; i < vetorC.length; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.printf("%d\n", vetorC[i]);
        }

        sc.close();
    }
}
