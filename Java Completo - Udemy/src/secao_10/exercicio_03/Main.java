package secao_10.exercicio_03;

import secao_10.exercicio_03.entidades.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar
        na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16
        anos, bem como os nomes dessas pessoas caso houver.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão lidas? R:");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        double somaAltura = 0;
        int contIdade = 0;

        for(int i = 0; i < pessoas.length; i++){
            sc.nextLine();
            System.out.println();
            System.out.printf("Insira os dados da %dº pessoa...\n", (i+1));

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            if(idade < 16){
                contIdade++;
            }

            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            somaAltura += altura;

            pessoas[i] = new Pessoa(nome, idade, altura);
        }
        System.out.println();

        double alturaMedia = somaAltura / pessoas.length;
        System.out.printf("Altura media: %.2f\n", alturaMedia);

        double percentualIdade = ((double)contIdade / pessoas.length) * 100;
        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", percentualIdade) + "%");

        for(int i = 0; i < pessoas.length; i++){
            if(pessoas[i].getIdade() < 16){
                System.out.println(pessoas[i].getNome());
            }
        }

        sc.close();
    }
}
