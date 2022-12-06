package secao_10.exercicio_10;

import secao_10.exercicio_10.entidades.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
        no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois,
        imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas
        seja maior ou igual a 6.0 (seis).
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantas pessoas serão lidas: ");
        int n = sc.nextInt();
        System.out.println();

        Aluno[] alunos = new Aluno[n];

        for(int i = 0; i < alunos.length; i++){
            sc.nextLine();
            System.out.printf("Insira os dados do %dº aluno...\n", (i+1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("1º nota: ");
            double nota1 = sc.nextDouble();
            System.out.print("2º nota: ");
            double nota2 = sc.nextDouble();

            alunos[i] = new Aluno(nome, nota1, nota2);
            System.out.println();
        }

        System.out.println("Alunos aprovados: ");
        for(int i = 0; i < alunos.length; i++){
            double media = (alunos[i].getNota1() + alunos[i].getNota2()) / 2;
            if(media >= 6){
                System.out.printf("- %s\n", alunos[i].getNome());;
            }
        }

        sc.close();
    }
}
