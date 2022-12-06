package secao_10.exercicio_01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? [Entre 1-10]:");
        int n = sc.nextInt();
        while((n > 10) || (n < 1)){
            System.out.println("Erro! Tente novamente.");
            System.out.print("Quantos números você vai digitar? [Entre 1-10]:");
            n = sc.nextInt();
        }

        int[] vect = new int[n];

        for(int i = 0; i < vect.length; i++){
            System.out.printf("Digite o %dº número: ", (i+1));
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for(int i = 0; i < vect.length; i++){
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
