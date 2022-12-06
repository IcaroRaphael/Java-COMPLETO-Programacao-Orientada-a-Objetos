package secao_05.exercicio_01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int numero = sc.nextInt();

        if(numero == 0){
            System.out.println("Você digitou um número neutro.");
        }
        else if(numero < 0){
            System.out.println("Você digitou um número negativo.");
        }
        else{
            System.out.println("Você digitou um número positivo.");
        }

        sc.close();
    }
}
