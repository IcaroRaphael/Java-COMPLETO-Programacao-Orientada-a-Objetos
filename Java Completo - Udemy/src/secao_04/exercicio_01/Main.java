package secao_04.exercicio_01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números
        com uma mensagem explicativa, conforme exemplos.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        int n1 = sc.nextInt();
        System.out.print("Insira o segundo valor: ");
        int n2 = sc.nextInt();

        int soma = n1 + n2;
        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
