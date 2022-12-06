package secao_04.aula_026;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        System.out.print("Digite um inteiro: ");
        x = sc.nextInt();
        sc.nextLine(); //Necessário para quebrar linha do Int para String
        System.out.print("Digite uma string: ");
        s1 = sc.nextLine();
        System.out.print("Digite uma string: ");
        s2 = sc.nextLine();
        System.out.print("Digite uma string: ");
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
