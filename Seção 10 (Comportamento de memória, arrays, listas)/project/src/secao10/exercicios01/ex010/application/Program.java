package secao10.exercicios01.ex010.application;

import secao10.exercicios01.ex010.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
        no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
        os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
        igual a 6.0 (seis).*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão verificados: ");
        int n = sc.nextInt();
        System.out.println();

        Aluno[] vect = new Aluno[n];

        for(int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.printf("Insira os dados do %dº aluno: \n", (i+1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Nota 1: ");
            double nota1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();

            vect[i] = new Aluno(nome, nota1, nota2);
            System.out.println();
        }

        System.out.println("Alunos aprovados: ");
        for(Aluno aluno : vect){
            if(aluno.verificaAprovacao()){
                System.out.println(aluno.getNome());
            }
        }

        sc.close();
    }
}
