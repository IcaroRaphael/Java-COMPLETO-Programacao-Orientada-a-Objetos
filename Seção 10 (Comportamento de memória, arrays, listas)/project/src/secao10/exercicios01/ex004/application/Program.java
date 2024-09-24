package secao10.exercicios01.ex004.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
        tela todos os números pares, e também a quantidade de números pares.*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantos numeros serão lidos: ");
        int n = sc.nextInt();
        System.out.println();

        int[] vect = new int[n];
        for(int i = 0; i < vect.length; i++){
            System.out.printf("Insira o %dº numero: ", (i+1));
            vect[i] = sc.nextInt();
        }
        System.out.println();

        int quantPares = 0;
        System.out.println("NUMEROS PARES:");
        for(int num : vect){
            if(num % 2 == 0){
                quantPares++;
                System.out.print(num + "  ");
            }
        }
        System.out.println();
        System.out.println("\nQUANTIDADE DE PARES = " + quantPares);

        sc.close();
    }
}
