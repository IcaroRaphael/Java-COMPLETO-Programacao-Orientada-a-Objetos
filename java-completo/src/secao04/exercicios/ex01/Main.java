package secao04.exercicios.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        mensagem explicativa, conforme exemplos.
        */

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("SOMA = " + (a+b));

        sc.close();
    }
}
