package secao_05.exercicio_07;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto
        em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre
        um dos eixos cartesianos ou na origem (x = y = 0).
        Se o ponto estiver na origem, escreva a mensagem “Origem”.
        Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor de X: ");
        double x = sc.nextDouble();
        System.out.print("Insira o valor de Y: ");
        double y = sc.nextDouble();

        System.out.print("Quadrante: ");
        if((x == 0) && (y == 0)){
            System.out.println("origem");
        }else if((x > 0) && (y > 0)){
            System.out.println("1º");
        }else if((x < 0) && (y > 0)){
            System.out.println("2º");
        }else if((x < 0) && (y < 0)){
            System.out.println("3º");
        }else if((x > 0) && (y < 0)){
            System.out.println("4º");
        }

        sc.close();
    }
}
