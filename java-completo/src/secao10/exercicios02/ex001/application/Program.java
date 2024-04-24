package secao10.exercicios02.ex001.application;

import secao10.exercicios02.ex001.entities.Estudante;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*A dona de um pensionato possui dez quartos para alugar para estudantes,
        sendo esses quartos identificados pelos números 0 a 9.

        Fazer um programa que inicie com todos os dez quartos vazios, e depois
        leia uma quantidade N representando o número de estudantes que vão
        alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
        N estudantes. Para cada registro de aluguel, informar o nome e email do
        estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
        que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
        um relatório de todas ocupações do pensionato, por ordem de quarto,
        conforme exemplo.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        System.out.println();

        Estudante[] vetor = new Estudante[10];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.printf("Rent #%d\n", (i+1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            vetor[room] = new Estudante(name, email);
            System.out.println();
        }

        System.out.println("Busy rooms:");
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] != null){
                System.out.println((i) + ": " + vetor[i]);
            }
        }

        sc.close();
    }
}
