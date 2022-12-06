package secao_10.aula_103;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro N e uma matriz de ordem N contendo números
        inteiros. Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da
        matriz.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o tamanho da matriz: ");
        int tam = sc.nextInt();
        System.out.println();

        int[][] matriz = new int[tam][tam];

        for(int l = 0; l < matriz.length; l++){
            System.out.printf("- Insira os valores da %dº linha: \n", (l+1));
            for(int c = 0; c < matriz[l].length; c++){
                System.out.printf("Matriz[%d][%d]: ", l, c);
                matriz[l][c] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.print("Diagonal principal:");
        for(int x = 0; x < tam; x++){
            System.out.printf("  %d", matriz[x][x]);
        }
        System.out.println();

        int contNegativo = 0;
        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                if(matriz[l][c] < 0){
                    contNegativo++;
                }
            }
        }
        System.out.printf("Total de números negativos: %d\n", contNegativo);

        sc.close();
    }
}
