package secao17.exercicioFixacao01.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> cursoA = new HashSet<>();
        System.out.print("Quantos alunos estão matriculados no curso A? R:");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.printf("Insira o código do %dº aluno: ", i);
            cursoA.add(sc.nextInt());
        }

        Set<Integer> cursoB = new HashSet<>();
        System.out.print("Quantos alunos estão matriculados no curso B? R:");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.printf("Insira o código do %dº aluno: ", i);
            cursoB.add(sc.nextInt());
        }

        Set<Integer> cursoC = new HashSet<>();
        System.out.print("Quantos alunos estão matriculados no curso C? R:");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.printf("Insira o código do %dº aluno: ", i);
            cursoC.add(sc.nextInt());
        }

        Set<Integer> total = new HashSet<>();
        total.addAll(cursoA);
        total.addAll(cursoB);
        total.addAll(cursoC);

        System.out.printf("Alex possui %d alunos.\n", total.size());

        sc.close();
    }
}
