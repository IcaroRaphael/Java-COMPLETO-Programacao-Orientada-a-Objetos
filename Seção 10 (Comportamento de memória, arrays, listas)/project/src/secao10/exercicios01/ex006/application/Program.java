package secao10.exercicios01.ex006.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
        terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
        o vetor C gerado. */
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantos valores terá cada vator: ");
        int n = sc.nextInt();
        System.out.println();

        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectC = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for(int i = 0; i < vectA.length; i++){
            vectA[i] = sc.nextInt();
        }
        System.out.println();

        System.out.println("Digite os valores do vetor B:");
        for(int i = 0; i < vectB.length; i++){
            vectB[i] = sc.nextInt();
        }
        System.out.println();

        for(int i = 0; i < vectC.length; i++){
            vectC[i] = vectA[i] + vectB[i];
        }

        System.out.println("VETOR RESULTANTE:");
        for(int num : vectC){
            System.out.println(num);
        }

        sc.close();
    }
}
