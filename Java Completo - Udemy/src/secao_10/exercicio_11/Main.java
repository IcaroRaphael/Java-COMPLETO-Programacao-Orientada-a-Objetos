package secao_10.exercicio_11;

import secao_10.exercicio_11.entidades.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
        que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o
        número de homens.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantas pessoas serão lidas: ");
        int n = sc.nextInt();
        System.out.println();

        Pessoa[] pessoas = new Pessoa[n];

        for(int i = 0; i < pessoas.length; i++){
            System.out.printf("Insira os dados da %dº pessoa...\n", (i+1));
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            System.out.print("Gênero [M/F]: ");
            char genero = sc.next().toUpperCase().charAt(0);

            pessoas[i] = new Pessoa(altura, genero);
            System.out.println();
        }

        double maiorAltura = 0;
        double menorAltura = 0;
        double somaMulheres = 0;
        int contMulheres = 0;
        int contHomens = 0;
        for(int i = 0; i < pessoas.length; i++){

            // MAIOR E MENOR ALTURA
            if(i == 0){
                maiorAltura = pessoas[i].getAltura();
                menorAltura = pessoas[i].getAltura();
            }else{
                if(pessoas[i].getAltura() >= maiorAltura){
                    maiorAltura = pessoas[i].getAltura();
                }
                if(pessoas[i].getAltura() <= menorAltura){
                    menorAltura = pessoas[i].getAltura();
                }
            }

            // MÉDIA DA ALTURA DAS MULHERES
            if(pessoas[i].getGenero() == 'F'){
                somaMulheres += pessoas[i].getAltura();
                contMulheres++;
            }

            // NUMERO DE HOMENS
            if(pessoas[i].getGenero() == 'M'){
                contHomens++;
            }
        }

        double mediaAlturaMulheres =  somaMulheres / (double)contMulheres;

        System.out.printf("Menor altura: %.2f\n", menorAltura);
        System.out.printf("Maior altura: %.2f\n", maiorAltura);
        System.out.printf("Média das alturas das mulheres: %.2f\n", mediaAlturaMulheres);
        System.out.printf("Número de homens: %d\n", contHomens);

        sc.close();
    }
}
