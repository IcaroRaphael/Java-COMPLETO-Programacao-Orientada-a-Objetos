package secao_06.exercicio_pt1.exercicio_02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no
        sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será
        encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever
        mensagem alguma).
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira as coordenadas: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while((x != 0) && (y != 0)){
            System.out.print("Quadrante: ");
            if((x > 0) && (y > 0)){
                System.out.println("1º");
            }else if((x < 0) && (y > 0)){
                System.out.println("2º");
            }else if((x < 0) && (y < 0)){
                System.out.println("3º");
            }else if((x > 0) && (y < 0)){
                System.out.println("4º");
            }
            System.out.println();

            System.out.print("Insira as coordenadas: ");
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}