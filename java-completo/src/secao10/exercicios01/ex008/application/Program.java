package secao10.exercicios01.ex008.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
        aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
        digitado, mostrar a mensagem "NENHUM NUMERO PAR" */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantos elementos terá o vetor: ");
        int n = sc.nextInt();
        System.out.println();

        int[] vect = new int[n];

        double contPares = 0;
        for(int i = 0; i < vect.length; i++){
            System.out.printf("Insira o %dº numero: ", (i+1));
            vect[i] = sc.nextInt();
            if(vect[i] % 2 == 0){
                contPares++;
            }
        }

        double somaPares = 0;
        if(contPares == 0){
            System.out.println("NENHUM NUMERO PAR");
        }
        else{
            for(int num : vect){
                if(num % 2 == 0){
                    somaPares += num;
                }
            }
            System.out.printf("MEDIA DOS PARES = %.1f\n", (somaPares/contPares));
        }

        sc.close();
    }
}
