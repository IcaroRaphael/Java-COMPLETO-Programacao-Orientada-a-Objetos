package secao_10.exercicio_fixacao03;

import secao_10.exercicio_fixacao03.applications.Metodos;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz de M linhas
        por N colunas contendo números inteiros, podendo haver repetições. Em seguida, ler um número
        inteiro X que pertence à matriz. Para cada ocorrência de X, mostrar os valores à esquerda, acima,
        à direita e abaixo de X, quando houver, conforme exemplo.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // DEFININDO TAMANHO DA MATRIZ
        System.out.print("Insira o numero de linhas: ");
        int m = sc.nextInt();
        System.out.print("Insira o numero de colunas: ");
        int n = sc.nextInt();
        System.out.println();

        // CRIANDO A MATRIZ
        int[][] matriz = new int[m][n];

        // PRENCHENDO A MATRIZ
        for(int l = 0; l < matriz.length; l++){
            System.out.printf("- Insira os valores da %dº linha: \n", l+1);
            for(int c = 0; c < matriz[l].length; c++){
                System.out.printf("Matriz[%d][%d]: ", l, c);
                matriz[l][c] = sc.nextInt();
            }
        }
        System.out.println();

        // ESCOLHENDO UM VALOR DA MATRIZ
        System.out.print("Insira um valor da matriz: ");
        int valor = sc.nextInt();

        if(!Metodos.verificaNumero(valor, matriz)){
            System.out.println("Valor não existe na matriz.");
        }else{
            for(int l = 0; l < matriz.length; l++){
                for(int c = 0; c < matriz[l].length; c++){
                    if(valor == matriz[l][c]){
                        System.out.printf("Posicao: (%d,%d)\n", l, c);
                        if(c > 0){
                            System.out.printf("Left: %d\n", matriz[l][c-1]);
                        }
                        if(c < (matriz[l].length-1)){
                            System.out.printf("Right: %d\n", matriz[l][c+1]);
                        }
                        if(l > 0){
                            System.out.printf("Up: %d\n", matriz[l-1][c]);
                        }
                        if(l < (matriz.length-1)){
                            System.out.printf("Down: %d\n", matriz[l+1][c]);
                        }
                        System.out.println();
                    }
                }
            }
        }

        sc.close();
    }
}
