package secao_06.aula_045;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um valor inteiro: ");
        int x = sc.nextInt();

        int soma = 0;
        while(x != 0){
            soma += x;
            System.out.print("Insira um valor inteiro: ");
            x = sc.nextInt();
        }
        System.out.println("Soma: " + soma);

        sc.close();
    }
}
