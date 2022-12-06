package secao_04.aula_027;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira uma string: ");
        String s1 = sc.nextLine();
        System.out.print("Insira uma string: ");
        String s2 = sc.nextLine();
        System.out.print("Insira uma string: ");
        String s3 = sc.nextLine();

        System.out.println("\nDados digitados: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
