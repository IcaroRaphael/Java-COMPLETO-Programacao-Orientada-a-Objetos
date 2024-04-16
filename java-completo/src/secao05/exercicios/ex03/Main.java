package secao05.exercicios.ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.print("Insira o segundo numero: ");
        int num2 = sc.nextInt();

        if((num1 % num2 == 0) || (num2 % num1 == 0)){
            System.out.println("Sao multiplos");
        }
        else{
            System.out.println("Nao sao multiplos");
        }

        sc.close();
    }
}
