package secao06.exercicios01.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a senha: ");
        int password = sc.nextInt();

        while(password != 2002){
            System.out.println("Acesso negado");
            System.out.println();
            System.out.print("Insira a senha: ");
            password = sc.nextInt();
        }

        System.out.println("Acesso permitido");

        sc.close();
    }
}
