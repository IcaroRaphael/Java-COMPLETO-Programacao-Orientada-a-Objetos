package secao06.exercicios02.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        while(true){
            System.out.print("Insira o valor de X: ");
            x = sc.nextInt();
            if((x >= 1) && (x <= 1000)){
                System.out.println();
                break;
            }
            else{
                System.out.println("X tem que ser: (1 <= X <= 1000)");
            }
            System.out.println();
        }


        for(int i = 1; i <= x; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
