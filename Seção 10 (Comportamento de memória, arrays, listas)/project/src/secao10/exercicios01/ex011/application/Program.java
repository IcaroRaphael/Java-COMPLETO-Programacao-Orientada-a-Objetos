package secao10.exercicios01.ex011.application;

import secao10.exercicios01.ex011.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
        que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
        de homens.*/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantas pessoas serão digitadas: ");
        int n = sc.nextInt();
        System.out.println();

        Pessoa[] vect = new Pessoa[n];
        for(int i = 0; i < vect.length; i++){
            System.out.printf("Insira os dados da %dº pessoa: \n", (i+1));
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            System.out.print("Sexo: ");
            char sexo = sc.next().charAt(0);

            vect[i] = new Pessoa(altura, sexo);
            System.out.println();
        }

        double menorAltura = 0;
        double maiorAltura = 0;
        double somaAlturaMulheres = 0;
        int contMulheres = 0;
        int contHomens = 0;
        for(int i = 0; i < vect.length; i++){
            if(i == 0){
                menorAltura = vect[i].getAltura();
                maiorAltura = vect[i].getAltura();
            }
            else{
                if(vect[i].getAltura() > maiorAltura){
                    maiorAltura = vect[i].getAltura();
                }
                if(vect[i].getAltura() < menorAltura){
                    menorAltura = vect[i].getAltura();;
                }
            }
            if(vect[i].getSexo() == 'F'){
                somaAlturaMulheres += vect[i].getAltura();
                contMulheres++;
            }
            else if(vect[i].getSexo() == 'M'){
                contHomens++;
            }
        }

        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", (somaAlturaMulheres/contMulheres));
        System.out.println("Numero de homens = " + contHomens);

        sc.close();
    }
}
