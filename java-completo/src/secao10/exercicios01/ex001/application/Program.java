package secao10.exercicios01.ex001.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantos números serão lidos: ");
        int n = sc.nextInt();
        System.out.println();

        int[] vect = new int[n];
        for(int i = 0; i < vect.length; i++){
            System.out.printf("Insira o %dº número: ", (i+1));
            vect[i] = sc.nextInt();
        }
        System.out.println();

        System.out.println("NUMEROS NEGATIVOS:");
        for(int num : vect){
            if(num < 0){
                System.out.println(num);
            }
        }

        sc.close();
    }
}
