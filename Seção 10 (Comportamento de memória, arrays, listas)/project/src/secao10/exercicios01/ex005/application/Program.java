package secao10.exercicios01.ex005.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
        o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
        considerando a primeira posição como 0 (zero). */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantos numeros serão digitados: ");
        int n = sc.nextInt();
        System.out.println();

        double[] vect = new double[n];
        for(int i = 0; i < vect.length; i++){
            System.out.printf("Insira o %dº valor: ", (i+1));
            vect[i] = sc.nextDouble();
        }
        System.out.println();

        double maior = 0.0;
        int posMaior = 0;
        for(int i = 0; i < vect.length; i++){
            if(i == 0){
                maior = vect[i];
                posMaior = i;
            }
            else if(vect[i] > maior){
                maior = vect[i];
                posMaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posMaior);

        sc.close();
    }
}
