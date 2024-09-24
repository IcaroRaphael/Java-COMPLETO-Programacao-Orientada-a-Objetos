package secao10.exercicios01.ex009.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
        devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
        da pessoa mais velha.*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantas pessoas serão lidas: ");
        int n = sc.nextInt();
        System.out.println();

        int[] vetorIdades = new int[n];
        String[] vetorNomes = new String[n];

        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.printf("Insira os dados da %dº pessoa: \n", (i+1));
            System.out.print("Nome: ");
            vetorNomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            vetorIdades[i] = sc.nextInt();
            System.out.println();
        }

        int maiorIdade = 0;
        int posMaiorIdade = 0;
        for(int i = 0; i < n; i++){
            if(i == 0){
                maiorIdade = vetorIdades[i];
                posMaiorIdade = i;
            }
            else if(vetorIdades[i] > maiorIdade){
                maiorIdade = vetorIdades[i];
                posMaiorIdade = i;
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + vetorNomes[posMaiorIdade]);

        sc.close();
    }
}
