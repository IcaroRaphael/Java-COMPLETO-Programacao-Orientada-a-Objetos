package secao_10.exercicio_04;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
        tela todos os números pares, e também a quantidade de números pares.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? R:");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for(int i = 0; i < numeros.length; i++){
            System.out.printf("Insira o %dº numero: ", (i+1));
            numeros[i] = sc.nextInt();
        }
        System.out.println();

        int contPares = 0;
        System.out.println("NUMEROS PARES:");
        for(int i = 0; i < numeros.length; i++){
            if((numeros[i] % 2) == 0){
                System.out.printf(" %d ", numeros[i]);
                contPares++;
            }
        }
        System.out.println("\n");

        System.out.println("QUANTIDADE DE PARES: " + contPares);

        sc.close();
    }
}
