package secao06.exercicios01.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 1;
        int y = 1;

        while((x != 0) && (y != 0)){
            System.out.print("Insira o valor de X: ");
            x = sc.nextInt();
            System.out.print("Insira o valor de Y: ");
            y = sc.nextInt();

            if((x > 0) && (y > 0)){
                System.out.println("Primeiro");
            }
            else if((x < 0) && (y > 0)){
                System.out.println("Segundo");
            }
            else if((x < 0) && (y < 0)){
                System.out.println("Terceiro");
            }
            else if((x > 0) && (y < 0)){
                System.out.println("Quarto");
            }
            System.out.println();
        }

        sc.close();
    }
}
