package secao_10.exercicio_08;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
        aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
        digitado, mostrar a mensagem "NENHUM NUMERO PAR".
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantos valores serão lidos: ");
        int n = sc.nextInt();
        System.out.println();

        int[] numeros = new int[n];

        int somaPares = 0;
        int contPares = 0;
        for(int i = 0; i < numeros.length; i++){
            System.out.printf("Insira o %dº número: ", (i+1));
            numeros[i] = sc.nextInt();

            if((numeros[i] % 2) == 0){
                somaPares += numeros[i];
                contPares++;
            }
        }
        System.out.println();

        double media = (double) somaPares / contPares;
        if(contPares == 0){
            System.out.println("NENHUM NÚMERO PAR FOI LIDO");
        }else {
            System.out.printf("MÉDIA DOS PARES: %.1f\n", media);
        }

        sc.close();
    }
}
