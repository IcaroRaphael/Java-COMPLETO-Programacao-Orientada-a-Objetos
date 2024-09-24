package secao10.exercicios01.ex003.application;

import secao10.exercicios01.ex003.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
        tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
        bem como os nomes dessas pessoas caso houver. */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantas pessoas serão lidas: ");
        int n = sc.nextInt();
        System.out.println();

        Pessoa[] vect = new Pessoa[n];
        for(int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.printf("Insira os dados da %dº pessoa: \n", (i+1));

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            vect[i] = new Pessoa(nome, idade, altura);
            System.out.println();
        }

        double somaAltura = 0.0;
        double somaIdade = 0.0;
        for (Pessoa p : vect){
            //Pegar todas as alturas
            somaAltura += p.getAltura();

            //Pegar todos os menores de 16 anos
            if(p.getIdade() < 16){
                somaIdade++;
            }
        }

        System.out.printf("Altura média: %.2f\n", (somaAltura/ vect.length));
        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", ((somaIdade/ vect.length)*100)) + "%");
        for (Pessoa p : vect){
            if(p.getIdade() < 16){
                System.out.println(p.getNome());
            }
        }

        sc.close();
    }
}
