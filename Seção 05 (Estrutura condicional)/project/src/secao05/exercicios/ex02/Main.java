package secao05.exercicios.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um numero inteiro: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Este numero e par");
        }
        else{
            System.out.println("Este numero e impar");
        }

        sc.close();
    }
}
