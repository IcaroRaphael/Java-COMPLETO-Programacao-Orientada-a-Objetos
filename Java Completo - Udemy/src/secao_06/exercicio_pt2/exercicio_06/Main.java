package secao_06.exercicio_pt2.exercicio_06;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Ler um número inteiro N e calcular todos os seus divisores.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numero = sc.nextInt();

        System.out.print("Divisores:");
        for(int i = 1; i <= numero; i++){
            if((numero % i) == 0){
                System.out.printf(" %d", i);
            }
        }

        sc.close();
    }
}
