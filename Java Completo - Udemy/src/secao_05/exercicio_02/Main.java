package secao_05.exercicio_02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int numero = sc.nextInt();

        if (numero == 0){
            System.out.println("Este número é neutro!");
        }else if((numero % 2) == 0){
            System.out.println("Este número é par!");
        } else{
            System.out.println("Este número é ímpar!");
        }

        sc.close();
    }
}
