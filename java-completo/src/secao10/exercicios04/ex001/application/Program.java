package secao10.exercicios04.ex001.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Fazer um programa para ler dois números inteiros M e N, e depois ler
        uma matriz de M linhas por N colunas contendo números inteiros,
        podendo haver repetições. Em seguida, ler um número inteiro X que
        pertence à matriz. Para cada ocorrência de X, mostrar os valores à
        esquerda, acima, à direita e abaixo de X, quando houver.*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor de M: ");
        int m = sc.nextInt();
        System.out.print("Insira o valor de N: ");
        int n = sc.nextInt();
        System.out.println();

        int[][] matriz = new int[m][n];
        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                System.out.printf("Matriz[%d][%d}: ", l, c);
                matriz[l][c] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.print("Qual número você deseja ver as ocorrências: ");
        int x = sc.nextInt();
        System.out.println();

        int ocorrências = 1;
        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                if(matriz[l][c] == x){
                    System.out.printf("Dados da %dº ocorrência:\n", ocorrências);
                    ocorrências++;
                    System.out.println("Posição: " + l + "," + c);
                    if(c > 0){
                        System.out.println("Esquerda: " + matriz[l][c-1]);
                    }
                    if(c < (matriz[l].length-1)){
                        System.out.println("Direita: " + matriz[l][c+1]);
                    }
                    if(l > 0){
                        System.out.println("Acima: " + matriz[l-1][c]);
                    }
                    if(l < (matriz.length-1)){
                        System.out.println("Abaixo: " + matriz[l+1][c]);
                    }
                    System.out.println();
                }
            }
        }

        sc.close();
    }
}
