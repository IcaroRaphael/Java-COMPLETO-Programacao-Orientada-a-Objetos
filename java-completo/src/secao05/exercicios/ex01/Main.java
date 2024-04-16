package secao05.exercicios.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um numero inteiro: ");
        int num = sc.nextInt();

        if(num < 0){
            System.out.println("Este número é negativo");
        }
        else{
            System.out.println("Este número é positivo");
        }

        sc.close();
    }
}
