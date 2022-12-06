package secao_10.exercicio_09;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
        devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o
        nome da pessoa mais velha.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantas pessoas serão lidas: ");
        int n = sc.nextInt();

        int[] idades = new int[n];
        String[] nomes = new String[n];

        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println();
            System.out.printf("Insira os dados da %dº pessoa...\n", (i+1));
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }
        System.out.println();

        int posicaoMaisVelha = 0;
        int idadeMaisVelha = 0;
        for(int i = 0; i < n; i++){
            if(i == 0){
                idadeMaisVelha = idades[i];
                posicaoMaisVelha = i;
            }else{
                if(idades[i] > idadeMaisVelha){
                    idadeMaisVelha = idades[i];
                    posicaoMaisVelha = i;
                }
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nomes[posicaoMaisVelha]);

        sc.close();
    }
}
