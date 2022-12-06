package secao_10.aula_089;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantas alturas serão lidas: ");
        int quant = sc.nextInt();

        double[] vect = new double[quant];

        double soma = 0;
        for(int i = 0; i < quant; i++){
            System.out.printf("Insira a %dº altura: ", (i+1));
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }

        System.out.printf("Média: %.2f\n", (soma/quant));

        sc.close();
    }
}
